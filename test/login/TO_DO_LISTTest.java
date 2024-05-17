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
    TO_DO_LIST description = new TO_DO_LIST();
    

    public TO_DO_LISTTest() {
    }

    @Test
    public void testMain() {
    }

    @Test
    public void testCheckTaskDescription() {

        boolean Expected = true;
        boolean Actual;
        Actual = description.checkTaskDescription();
        assertTrue(Actual);

    }

    @Test
    public void testTaskID() {
        String[] expected = {"CR:0:IKE", "CR:1:ARD", "CR:2:THA", "CR:3:NDY"};
        String[] actual = new String[4];
        description.Tasknumber = 0;
        for (int i = 0; i < expected.length; i++) {

            t.setTaskNO(description.Tasknumber);
            actual[i] += description.getTask_Name() + description.getDev_Name();
            actual[i] = t.TaskID();
            description.Tasknumber++;

        }
        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void testTotalHours() {
        int[] expected = {10, 12, 55, 11, 1};

        int[] actual = new int[5];
        for (int i = 0; i < expected.length; i++) {
            actual[i] = t.TotalHours();

        }

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testPrinttotal() {
        int expected = 89;

        int actual = 0;
        for (int i = 0; i < 5; i++) {
            actual = t.TotalHours();
            actual = t.total;

        }
        System.out.println(actual);

        assertEquals(expected, actual);
    }

}
