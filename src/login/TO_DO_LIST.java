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
    public int[] array ={10,12,55,11,1};
    
    public static void main(String[] args) {
        
    }
    public void setDeev_Name(String DEV_Name){
       Developer_Name = DEV_Name; 
    }

    public String getDev_Name() {
        // asking for developers name usinga dialog box
        

        return Developer_Name;
    }

    public void setTaskNO(int TaskNo) {// accepts an integer parameter named TaskNo.
        Tasknumber = TaskNo;//this line assigns the value of the TaskNo parameter to a variable 
    }

    public int getTaskNO() {
        return Tasknumber;
    }
    public void setTask_Name(String Name_Of_Task){
        task_NAME = Name_Of_Task;
    }

    public String getTask_Name() {
        //asks for the name of tasks
        
        return task_NAME; //returns task name
    }

    public String status() {//shows a dialog to the user with different task status options 
        status2 = JOptionPane.showInputDialog("Choose Task status" + '\n' + "Status 1): TO DO" + '\n' + "Status2 ): Done" + '\n' + "Status 3) : Doing");
        switch (status2) {//the value of status2 is equal to "1,2 or 3", the code inside the case block will be executed.
            case "1":// if 1 is chosen the status to do is stored and printed
                String Status1 = "TO DO";

               Status = Status1 ;
                System.out.println(Status1);
                break;
            case "2":// if 2 is chosen the status done is stored and printed
                String Status2 = "Done!";
               
                Status = Status2 ;
                System.out.println(Status2);
                break;
            case "3":// if 3 is chosen the status doing is stored and printed
                String Status3 = "Doing";
                
                Status = Status3;
                System.out.println(Status3);
                break;
        }
        return Status;
    }

    public boolean checkTaskDescription() {

        while (true) {
//a loop that repeatedly prompts the user to enter a task description. 
           // description = JOptionPane.showInputDialog(null, "Enter a task description less than 50 characters:");
            if (description.length() > 50) {// If the description is too long, an error message is shown
                JOptionPane.showMessageDialog(null, "The description is too long. Please enter a description less than 50 characters.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {//otherwise, a success message is displayed, and the loop terminates.
                System.out.println("Task successfully captured");
                break;
            }
        }
        return true;
    }

    public String TaskID() {
//code makes a taskID by combining the first two characters of task_NAME, the Tasknumber, and the last three characters of Developer_Name.
        taskID = task_NAME.substring(0, 2) + ":" + Tasknumber + ":" + Developer_Name.substring(Developer_Name.length() - 3);
        
        return taskID;
    }
    public void setDuration(int time){
        duration = time;
    }

    public Integer TotalHours() {
        //The user is prompted to enter the total duration of the task in hours.
        //duration = Integer.parseInt(JOptionPane.showInputDialog("please enter total duration of task in hours"));
       total  = total + duration;//adds the parsed duration value to an existing variable 
       
        return duration;
    }
    public int Printtotal(){
         total  = total + duration; 
    return total;}

    public String TaskDetails() {
        //displays a message dialog with task-related details, including status, developer information, task number, name, description, ID, and duration.
        JOptionPane.showMessageDialog(null, "Task Status: " + Status + '\n' + "Developer details:  " + Developer_Name + '\n' + "Task number:  " + Tasknumber + '\n' + "Task Name:  " + task_NAME + '\n' + "Task description:  " + description + '\n' + "Task ID :  " + TaskID() + '\n' + "Task Duration: " + duration + "Hours");

        return "";
    }

}
