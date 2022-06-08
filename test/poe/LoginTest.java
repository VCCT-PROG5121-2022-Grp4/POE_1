/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package poe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author freds
 */
public class LoginTest
{
    
    public LoginTest()
    {
    }
    
    @BeforeAll
    public static void setUpClass()
    {
    }
    
    @AfterAll
    public static void tearDownClass()
    {
    }
    
    @BeforeEach
    public void setUp()
    {
    }
    
    @AfterEach
    public void tearDown()
    {
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName()
    {
        System.out.println("checkUserName");
        String toCheck = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUserName(toCheck);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkDigit method, of class Login.
     */
    @Test
    public void testCheckDigit()
    {
        System.out.println("checkDigit");
        String toCheck = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkDigit(toCheck);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkSpecial method, of class Login.
     */
    @Test
    public void testCheckSpecial()
    {
        System.out.println("checkSpecial");
        String toCheck = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkSpecial(toCheck);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUpper method, of class Login.
     */
    @Test
    public void testCheckUpper()
    {
        System.out.println("checkUpper");
        String toCheck = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUpper(toCheck);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity()
    {
        System.out.println("checkPasswordComplexity");
        String toCheck = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(toCheck);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Login.
     */
    @Test
    public void testGetName()
    {
        System.out.println("getName");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Login.
     */
    @Test
    public void testSetName()
    {
        System.out.println("setName");
        String name = "";
        Login instance = new Login();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurname method, of class Login.
     */
    @Test
    public void testGetSurname()
    {
        System.out.println("getSurname");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSurname method, of class Login.
     */
    @Test
    public void testSetSurname()
    {
        System.out.println("setSurname");
        String surname = "";
        Login instance = new Login();
        instance.setSurname(surname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class Login.
     */
    @Test
    public void testGetUsername()
    {
        System.out.println("getUsername");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class Login.
     */
    @Test
    public void testSetUsername()
    {
        System.out.println("setUsername");
        String username = "";
        Login instance = new Login();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Login.
     */
    @Test
    public void testGetPassword()
    {
        System.out.println("getPassword");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Login.
     */
    @Test
    public void testSetPassword()
    {
        System.out.println("setPassword");
        String password = "";
        Login instance = new Login();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
