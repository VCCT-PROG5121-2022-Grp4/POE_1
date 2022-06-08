/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package poe;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author freds
 */
public class TaskTest
{
    
    public TaskTest()
    {
    }

    @Test
    public void testCreateTaskID()
    {
        System.out.println("createTaskID");
        String taskname = "";
        int taskIncr = 0;
        String devName = "";
        Task instance = new Task();
        String expResult = "";
        String result = instance.createTaskID(taskname, taskIncr, devName);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
