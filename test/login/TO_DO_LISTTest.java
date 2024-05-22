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
import static login.TO_DO_LIST.taskID;
import org.junit.Assert;

/**
 *
 * @author lab_services_student
 */
public class TO_DO_LISTTest {

    TO_DO_LIST t = new TO_DO_LIST();
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

        String description = "create login to authenticate user";
        description1.description = description;
        Actual = description1.checkTaskDescription();
        assertEquals(Expected, Actual);

        // assertTrue(Actual);
    }

    @Test
    public void testTaskID() {
         // Pre-determined dev_names and task names
        String[] devNames = {"MIKE", "JARD", "SAMANTHA", "RANDY"};
        String[] taskNames = {"CRAB_CATCH", "CROW_WATCH", "CREAM_REFILL", "CRUST_CUTTING"};

        // Generate task IDs for each combination of dev_name and task name
        t.Tasknumber = -1;
       // for (int i = 0; i < devNames.length; i++) {
            for (int j = 0; j < taskNames.length; j++) {

                t.setTask_Name(taskNames[j]);
                t.setDeev_Name(devNames[j]);
                t.Tasknumber++;
                String actual = t.TaskID();
                
                String expectedTaskID = taskNames[j].substring(0, 2) + ":" + t.Tasknumber  + ":" + devNames[j].substring(devNames[j].length() - 3);
               System.out.println(actual);
                assertEquals(expectedTaskID, actual);
           // }
        }
    }

    @Test
    public void testTotalHours() {
        int expected = 89;
        int[] numbers = {10, 12, 55, 11, 1};
        int actual = 0;

        for (int i = 0; i < numbers.length; i++) {
            actual += numbers[i];
        }

        assertEquals(expected, actual);
    }

    
    }

