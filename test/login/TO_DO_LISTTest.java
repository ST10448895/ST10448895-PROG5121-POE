
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package login;

import login.TO_DO_LIST;
import login.TO_DO_LIST;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Assert;

/**
 *
 * @author lab_services_student
 */
public class TO_DO_LISTTest {

    TO_DO_LIST testtask = new TO_DO_LIST();
    TO_DO_LIST description1 = new TO_DO_LIST();

    public TO_DO_LISTTest() {
    }

    @Test
    public void testMain() {
    }

    @Test
    public void testCheckTaskDescription() {
        boolean Expected = true;
        boolean Actual;

        description1.description.add("create login to authenticate user");

        // Check the description
        Actual = description1.checkTaskDescription(0);
        assertEquals(Expected, Actual);

    }

    @Test
    public void testTaskID() {
       // Pre-determined dev_names and task names
        String[] devNames = {"MIKE", "JARD", "SAMANTHA", "RANDY"};
        String[] taskNames = {"CRAB_CATCH", "CROW_WATCH", "CREAM_REFILL", "CRUST_CUTTING"};

        // Generate task IDs for each combination of dev_name and task name
        for (int j = 0; j < taskNames.length; j++) {
            testtask.setTask_Name(taskNames[j]);
            testtask.setDev_Name(devNames[j]);
            testtask.setTaskNO(1); // Setting task number to 1 for each task
            String actual = testtask.TaskID(j);

            String expectedTaskID = taskNames[j].substring(0, 2).toUpperCase() + ":1:" + devNames[j].substring(devNames[j].length() - 3).toUpperCase();
            System.out.println(actual);
            assertEquals(expectedTaskID, actual);
        }
    
    }

    @Test
    public void testTotalHours() {
        int expected = 89;
        int[] Hours = {10, 12, 55, 11, 1};
        int actual = 0;

        for (int i = 0; i < Hours.length; i++) {
            int duration = Hours[i];
            actual = testtask.Printtotal(duration);

        }
        System.out.println(actual);
        assertEquals(expected, actual);
        int expected_itirration = 18;
        int acutal_itirration = 0;
        for (int i = 0; i <= 1; i++) {
            testtask.setDuration(9, 0);
            //testtask.setDuration(testtask.duration);
            testtask.TotalHours();
            acutal_itirration = testtask.TotalHours();
            System.out.println(testtask.TotalHours());

        }
        assertEquals(expected_itirration, acutal_itirration);

    }

    @Test
    public void testGetDev_Name() {

        testtask.setDev_Name("Mike Smith");

        testtask.setDev_Name("Edward Harrison");

        testtask.setDev_Name("Samantha Paulsen");

        testtask.setDev_Name("Glenda Oberholzer");

        String tasks0 = testtask.getDev_Name(0);
        String tasks1 = testtask.getDev_Name(1);
        String tasks2 = testtask.getDev_Name(2);
        String tasks3 = testtask.getDev_Name(3);
        String expected0 = "Mike Smith";
        String expected1 = "Edward Harrison";
        String expected2 = "Samantha Paulsen";
        String expected3 = "Glenda Oberholzer";

        assertEquals(expected0, tasks0);
        assertEquals(expected1, tasks1);
        assertEquals(expected2, tasks2);
        assertEquals(expected3, tasks3);

        System.out.println(expected0);
        System.out.println(expected1);
        System.out.println(expected2);
        System.out.println(expected3);

    }

    @Test
    public void testManageTasksByDeveloper() {

        testtask.setTaskNO(3);
        testtask.setDev_Name("Samantha Paulsen");
        testtask.setTask_Name("Create Reports");
        testtask.description.add("Description");
        testtask.setDuration(2, 0);
        testtask.status(3, "2");

        String tasks = testtask.manageTasksByDeveloper("Samantha Paulsen");

        assertTrue(tasks.contains("Create Reports"));
        System.out.println("Create Reports");
    }

    @Test
    public void testDeleteTask() {

        testtask.setTaskNO(3);
        testtask.setDev_Name("Samantha Paulsen");
        testtask.setTask_Name("Create Reports");
        testtask.description.add("Description");
        testtask.setDuration(2, 0);
        testtask.status(0, "2");

        // Deleting the task at index 0, as it's the first and only task
        testtask.deleteTask(0);

        assertTrue(testtask.Tasknumber.isEmpty());
        assertTrue(testtask.Developer_Name.isEmpty());
        assertTrue(testtask.task_NAME.isEmpty());
        assertTrue(testtask.description.isEmpty());
        assertTrue(testtask.duration.isEmpty());
        assertTrue(testtask.Status.isEmpty());
        System.out.println("Entry Create Reports successfully deleted!");
    }

    @Test
    public void testDisplayAllTasks() {

        // Add test data
        testtask.task_NAME.add("Create Login");
        testtask.task_NAME.add("Create add Feature");
        testtask.task_NAME.add("Create Reports");
        testtask.task_NAME.add("add array");
        testtask.description.add("Description");
        testtask.description.add("Description");
        testtask.description.add("Description");
        testtask.description.add("Description");
        testtask.Status.add("TO DO");
        testtask.Status.add("Doing");
        testtask.Status.add("Done");
        testtask.Status.add("TO DO");
        testtask.Developer_Name.add("Mike Smith");
        testtask.Developer_Name.add("Edward Harrison");
        testtask.Developer_Name.add("Samantha Paulsen");
        testtask.Developer_Name.add("Glenda Oberholzer");
        testtask.taskID.add("CR:1:GIN");//change
        testtask.taskID.add("CR:2:SON");
        testtask.taskID.add("CR:3:SEN");
        testtask.taskID.add("AD:4:ZER");
        testtask.duration.add(5);
        testtask.duration.add(8);
        testtask.duration.add(2);
        testtask.duration.add(11);

        // Call the displayAllTasks() method
        String result = testtask.displayAllTasks();

        // Expected output
        String expected = "Task 1: Create Login\nDescription: Description\nStatus: TO DO\nDeveloper: Mike Smith\nTask ID: CR:1:GIN\nDuration: 5 hours\n\n"
                + "Task 2: Create add Feature\nDescription: Description\nStatus: Doing\nDeveloper: Edward Harrison\nTask ID: CR:2:SON\nDuration: 8 hours\n\n"
                + "Task 3: Create Reports\nDescription: Description\nStatus: Done\nDeveloper: Samantha Paulsen\nTask ID: CR:3:SEN\nDuration: 2 hours\n\n"
                + "Task 4: add array\nDescription: Description\nStatus: TO DO\nDeveloper: Glenda Oberholzer\nTask ID: AD:4:ZER\nDuration: 11 hours\n\n";

        // Assert that the result matches the expected output
        assertEquals(expected, result);
        System.out.println(result);

    }

    @Test
    public void testGetTaskWithLargestDuration() {

        testtask.setTaskNO(1);
        testtask.setDev_Name("Mike Smith");
        testtask.setTask_Name("Create Login");
        testtask.setDuration(5, 0);
        testtask.status(0, "1");

        testtask.setTaskNO(2);
        testtask.setDev_Name("Edward Harrison");
        testtask.setTask_Name("Create add features");
        testtask.setDuration(8, 1);
        testtask.status(1, "2");

        testtask.setTaskNO(3);
        testtask.setDev_Name("Samantha Paulsen");
        testtask.setTask_Name("Create Reports");
        testtask.setDuration(2, 2);
        testtask.status(2, "3");

        testtask.setTaskNO(4);
        testtask.setDev_Name("Glenda Oberholzer");
        testtask.setTask_Name("add array");
        testtask.setDuration(11, 3);
        testtask.status(3, "1");

        // Finding the task with the longest duration
        int LongestDuration = 0;
        for (int i = 1; i < testtask.duration.size(); i++) {
            if (testtask.duration.get(i) > testtask.duration.get(LongestDuration)) {
                LongestDuration = i;
            }
        }

        // Verifying the task with the longest duration
        assertEquals(3, LongestDuration);

        System.out.println("the longest task duration is by Glenda Oberholzer of 11 hours! ");
    }

    @Test
    public void testSearchTaskByName() {

        testtask.setTaskNO(1);
        testtask.setDev_Name("Mike Smith");
        testtask.setTask_Name("Create Login");
        testtask.setDuration(5, 0);
        testtask.status(0, "1");

        testtask.setTaskNO(4);
        testtask.setDev_Name("Glenda Oberholzer");
        testtask.setTask_Name("add array");
        testtask.setDuration(11, 3);
        testtask.status(3, "1");

        String searchResult = testtask.searchTaskByName("Create Login");

        assertTrue(searchResult.contains("Mike Smith"));
        assertFalse(searchResult.contains("Glenda Oberholzer"));

        System.out.println("Mike Smith ,Create Login ");

    }

}
