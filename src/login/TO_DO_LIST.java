/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login;

import javax.swing.JOptionPane;

//import static to_do_list.Task.option;
public class TO_DO_LIST {

    public static String description, task_NAME, taskID, Developer_Name, Status, status2;
    public  int loops, Tasknumber, duration,total, opt1, opt2, opt3, status;
    

    public static void main(String[] args) {
        
    }

   

    public String getDev_Name() {
        Developer_Name = JOptionPane.showInputDialog("Enter developers name and surename");

        return Developer_Name;
    }

    public void setTaskNO(int TaskNo) {
        Tasknumber = TaskNo;
    }

    public int getTaskNO() {
        return Tasknumber;
    }

    public String getTask_Name() {
        task_NAME = JOptionPane.showInputDialog("enter the name of new task");
        return task_NAME;
    }

    public String status() {
        status2 = JOptionPane.showInputDialog("Choose Task status" + '\n' + "Status 1): TO DO" + '\n' + "Status2 ): Done" + '\n' + "Status 3) : Doing");
        switch (status2) {
            case "1":
                String Status1 = "TO DO";

               Status = Status1 ;
                System.out.println(Status1);
                break;
            case "2":
                String Status2 = "Done!";
               // Status2 = Status;
                Status = Status2 ;
                System.out.println(Status2);
                break;
            case "3":
                String Status3 = "Doing";
                //Status3 = Status;
                Status = Status3;
                System.out.println(Status3);
                break;
        }
        return Status;
    }

    public boolean checkTaskDescription() {

        while (true) {

            description = JOptionPane.showInputDialog(null, "Enter a task description less than 50 characters:");
            if (description.length() > 50) {
                JOptionPane.showMessageDialog(null, "The description is too long. Please enter a description less than 50 characters.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Task successfully captured");
                break;
            }
        }
        return true;
    }

    public String TaskID() {

        taskID = task_NAME.substring(0, 2) + ":" + Tasknumber + ":" + Developer_Name.substring(Developer_Name.length() - 3);
        //System.out.println(taskID);
        return taskID;
    }

    public Integer TotalHours() {

        duration = Integer.parseInt(JOptionPane.showInputDialog("please enter total duration of task in hours"));
       total  = total + duration;
       
        //int [] time;
        //int i = 0;
        //time = new int[100];
        //time[loops]= duration;
        return duration;
    }
    public int Printtotal(){
         total  = total + duration;
    return total;}

    public String TaskDetails() {
        JOptionPane.showMessageDialog(null, "Task Status: " + Status + '\n' + "Developer details:  " + Developer_Name + '\n' + "Task number:  " + Tasknumber + '\n' + "Task Name:  " + task_NAME + '\n' + "Task description:  " + description + '\n' + "Task ID :  " + TaskID() + '\n' + "Task Duration: " + TotalHours() + "Hours");

        return "";
    }

}
