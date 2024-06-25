
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.util.ArrayList;
import java.util.List;
import login.TO_DO_LIST;
import javax.swing.JOptionPane;

public class Task {

    public static List<String> description, task_NAME, taskID, Status, developer_Name;
    public static int loops, Tasknumber, duration, option, numTasks;
    public static int totals = 0;

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");

        // Initialize array lists based on the number of tasks
        description = new ArrayList<>(numTasks);
        task_NAME = new ArrayList<>(numTasks);
        taskID = new ArrayList<>(numTasks);
        Status = new ArrayList<>(numTasks);
        developer_Name = new ArrayList<>(numTasks);

        TO_DO_LIST task = new TO_DO_LIST();

        getTasks(task);
    }

    public static void getTasks(TO_DO_LIST task) {
        Tasknumber = 0;
        option = 0;
        while (option != 7) {
            option = Integer.parseInt(JOptionPane.showInputDialog("Welcome to EasyKanban" + '\n' + "Choose an option" + '\n' + "1: Add task" + '\n' + "2: Show report" + '\n' + "3: search tasks by Dev" + '\n' + "4: Display done tasks" + '\n' + "5: Search Task by TaskName" + '\n' + "6: Delete a task" + '\n' + "7: EXIT"));
            switch (option) {
                case 1:
                    numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter the maximum number of tasks you want to manage:"));
                    loops = numTasks;
                    for (int i = 0; i < loops; i++) {
                        if (Tasknumber >= numTasks) {
                            JOptionPane.showMessageDialog(null, "Maximum number of tasks reached.", "Error", JOptionPane.ERROR_MESSAGE);
                            break;
                        }

                        Tasknumber++;
                        task.setTaskNO(Tasknumber);
                        String devName = JOptionPane.showInputDialog("Enter developer's name and surname");
                        developer_Name.add(devName);
                        task.setDev_Name(devName);
                        task.getDev_Name(Tasknumber - 1);
                        String taskName = JOptionPane.showInputDialog("Enter the name of new task");
                        task_NAME.add(taskName);
                        task.setTask_Name(taskName);
                        task.getTask_Name(Tasknumber - 1);
                        String taskDescription = JOptionPane.showInputDialog("Enter task description (less than 50 characters):");
                        description.add(taskDescription);
                        task.description.add(taskDescription);
                        boolean validDescription = task.checkTaskDescription(task.description.size() - 1);
                        while (!validDescription) {
                            taskDescription = JOptionPane.showInputDialog("Description too long. Enter task description (less than 50 characters):");
                            description.set(description.size() - 1, taskDescription);
                            task.description.set(task.description.size() - 1, taskDescription);
                            validDescription = task.checkTaskDescription(task.description.size() - 1);
                        }
                        String statusOption = JOptionPane.showInputDialog("Choose Task status" + '\n' + "1: TO DO" + '\n' + "2: Done" + '\n' + "3: Doing");
                        task.status(task.Status.size(), statusOption);
                        task.TaskID(Tasknumber - 1);
                        duration = Integer.parseInt(JOptionPane.showInputDialog("Please enter total duration of task in hours"));
                        task.setDuration(duration, Tasknumber - 1);
                        totals = task.Printtotal(duration);
                        task.TaskDetails(Tasknumber - 1);
                    }
                    System.out.println(task.totals);
                    String largestTask = task.getTaskWithLargestDuration();
                    JOptionPane.showMessageDialog(null, largestTask);
                    break;
                case 2:
                    String allTasks = task.displayAllTasks();
                    JOptionPane.showMessageDialog(null, allTasks);
                    break;
                case 3:
                    String developer_Task = JOptionPane.showInputDialog("Enter the developer's name to view their tasks:");
                    String tasks = task.manageTasksByDeveloper(developer_Task);
                    JOptionPane.showMessageDialog(null, tasks);
                    break;
                case 4:
                    String DoneTasks = task.searchAndDisplayDoneTasks();
                    JOptionPane.showMessageDialog(null, DoneTasks);

                    break;
                case 5:
                    String seraching = JOptionPane.showInputDialog("Enter the task name to search:");
                    String search_outcome = task.searchTaskByName(seraching);
                    JOptionPane.showMessageDialog(null, search_outcome);
                    break;
                case 6:
                    String deleteOption = JOptionPane.showInputDialog("Do you want to delete any task? (yes/no)");
                    if (deleteOption.equalsIgnoreCase("yes")) {
                        int taskToDelete = Integer.parseInt(JOptionPane.showInputDialog("Enter the task number to delete:")) - 1;
                        if (taskToDelete >= 0 && taskToDelete < task_NAME.size()) {
                            task.deleteTask(taskToDelete);
                            JOptionPane.showMessageDialog(null, "Task " + (taskToDelete + 1) + " has been deleted.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid task number.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Quitting.....");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Please choose 1, 2,3,4, 5 or 6.", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}
