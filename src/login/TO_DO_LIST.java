
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

//import static to_do_list.Task.option;
public class TO_DO_LIST {

   
    public List<String> description, task_NAME, taskID, Developer_Name, Status, status2;
    public List<Integer> Tasknumber, duration;
    public int totals = 0;
    public String statusOption;

    public TO_DO_LIST() {
        description = new ArrayList<>();
        task_NAME = new ArrayList<>();
        taskID = new ArrayList<>();
        Developer_Name = new ArrayList<>();
        Status = new ArrayList<>();
        status2 = new ArrayList<>();
        Tasknumber = new ArrayList<>();
        duration = new ArrayList<>();
    }

    public void setDev_Name(String DEV_Name) {
        Developer_Name.add(DEV_Name);
    }

    public String getDev_Name(int index) {
        return Developer_Name.get(index);
    }

    public void setTaskNO(int TaskNo) {
        Tasknumber.add(TaskNo);
    }

    public int getTaskNO(int index) {
        return Tasknumber.get(index);
    }

    public void setTask_Name(String Name_Of_Task) {
        task_NAME.add(Name_Of_Task);
    }

    public String getTask_Name(int index) {
        return task_NAME.get(index);
    }

    public String status(int index, String statusOption) {
        String status;
        switch (statusOption) {
            case "1":
                status = "TO DO";
                break;
            case "2":
                status = "Done!";
                break;
            case "3":
                status = "Doing";
                break;
            default:
                status = "Invalid";
        }
        if (index < Status.size()) {
            Status.set(index, status);
        } else {
            Status.add(status);
        }

        return status;
    }

    public boolean checkTaskDescription(int index) {
        while (true) {
            while (true) {
                if (description.get(index).length() > 50) {
                    return false;
                } else {
                    System.out.println("Task successfully captured");
                    break;
                }
            }
            return true;
        }
    }

    public String TaskID(int index) {
        String id = task_NAME.get(index).substring(0, 2).toUpperCase() + ":" + Tasknumber.get(index) + ":" + Developer_Name.get(index).substring(Developer_Name.get(index).length() - 3).toUpperCase();
        taskID.add(id);
        
        return id;
    }

    public void setDuration(int time, int index) {
        duration.add(time);
    }

    public Integer TotalHours() {
        totals = 0; // reset totals to avoid double counting
        for (int time : duration) {
            totals += time;
        }
        return totals;
    }

    public int Printtotal(int hour) {
        totals += hour;
        return totals;
    }

    public String TaskDetails(int index) {
        JOptionPane.showMessageDialog(null, "Task Status: " + Status.get(index) + '\n' + "Developer details: " + Developer_Name.get(index) + '\n' + "Task number: " + Tasknumber.get(index) + '\n' + "Task Name: " + task_NAME.get(index) + '\n' + "Task description: " + description.get(index) + '\n' + "Task ID: " + TaskID(index) + '\n' + "Task Duration: " + duration.get(index) + " Hours");
        return "";
    }

    public String manageTasksByDeveloper(String developer) {
        StringBuilder tasks = new StringBuilder();
        boolean taskFound = false;

        for (int i = 0; i < Developer_Name.size(); i++) {
            if (Developer_Name.get(i).equalsIgnoreCase(developer)) {
                tasks.append("Task ").append(i + 1).append(": ").append(task_NAME.get(i))
                        .append("\nDescription: ").append(description.get(i))
                        .append("\nStatus: ").append(Status.get(i)).append("\n\n");
                taskFound = true;
            }
        }

        if (!taskFound) {
            return "No tasks found for developer: " + developer;
        } else {
            return tasks.toString();
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < Tasknumber.size()) {
            Tasknumber.remove(index);
            Developer_Name.remove(index);
            task_NAME.remove(index);
            description.remove(index);
            duration.remove(index);
            Status.remove(index);
        } else {
            System.out.println("Invalid index for deletion: " + index);
        }
    }

     public String displayAllTasks() {
        StringBuilder tasks = new StringBuilder();
        for (int i = 0; i < task_NAME.size(); i++) {
            tasks.append("Task ").append(i + 1).append(": ").append(task_NAME.get(i))
                    .append("\nDescription: ").append(description.get(i))
                    .append("\nStatus: ").append(Status.get(i))
                    .append("\nDeveloper: ").append(Developer_Name.get(i))
                    .append("\nTask ID: ").append(taskID.get(i))
                    .append("\nDuration: ").append(duration.get(i)).append(" hours\n\n");
        }
        return tasks.toString();
    }

    public String getTaskWithLargestDuration() {

        int LongestDuration = 0;
        for (int i = 1; i < duration.size(); i++) {
            if (duration.get(i) > duration.get(LongestDuration)) {
                LongestDuration = i;
            }
        }

        return "Task with the largest duration:\n"
                + "Task " + (LongestDuration + 1) + " : " + task_NAME.get(LongestDuration)
                + "\nDescription: " + description.get(LongestDuration)
                + "\nStatus: " + Status.get(LongestDuration)
                + "\nDeveloper: " + Developer_Name.get(LongestDuration)
                + "\nTask ID: " + taskID.get(LongestDuration)
                + "\nDuration: " + duration.get(LongestDuration) + " hours\n";
    }

    public String searchTaskByName(String taskName) {
        StringBuilder search = new StringBuilder();
        boolean find = false;

        for (int i = 0; i < task_NAME.size(); i++) {
            if (task_NAME.get(i).equalsIgnoreCase(taskName)) {
                search.append("Task ").append(i + 1).append(" : ").append(task_NAME.get(i))
                        .append("\nStatus : ").append(Status.get(i))
                        .append("\nDeveloper : ").append(Developer_Name.get(i)).append("\n\n");
                find = true;
            }
        }
        if (!find) {
            return "No task found with the name: " + taskName;
        }

        return search.toString();
    }

    public String searchAndDisplayDoneTasks() {
        StringBuilder done = new StringBuilder();
        boolean doneTaskFound = false;

        for (int i = 0; i < Status.size(); i++) {
            if (Status.get(i).equals("Done!")) {
                done.append("Task ").append(i + 1).append(": ").append(task_NAME.get(i))
                        .append("\nDescription: ").append(description.get(i))
                        .append("\nDeveloper: ").append(Developer_Name.get(i))
                        .append("\nTask ID: ").append(taskID.get(i))
                        .append("\nDuration: ").append(duration.get(i)).append(" hours\n\n");
                doneTaskFound = true;
            }
        }

        if (!doneTaskFound) {
            return "No tasks with status 'Done!' found.";
        }

        return done.toString();
    }
}