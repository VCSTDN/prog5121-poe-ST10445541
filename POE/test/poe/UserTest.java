/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package poe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author byron
 */
public class LoginTest {
    private Login login;

    @BeforeEach
    public void setUp() {
        login = new Login();
    }

    @Test
    public void testCheckUserName() {
        assertTrue(login.checkUserName("kyl_1"));
        assertFalse(login.checkUserName("kyle!!!!!!!"));
    }

    @Test
    public void testCheckPasswordComplexity() {
        assertTrue(login.checkPasswordComplexity("Ch&&sec@ke99!"));
        assertFalse(login.checkPasswordComplexity("password"));
    }

    @Test
    public void testRegisterUser() {
        assertEquals("User registered successfully.", login.registerUser("kyl_1", "Ch&&sec@ke99!", "Kyle", "Smith"));
        assertEquals("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.", login.registerUser("kyle!!!!!!!", "Ch&&sec@ke99!", "Kyle", "Smith"));
        assertEquals("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.", login.registerUser("kyl_1", "password", "Kyle", "Smith"));
    }

    @Test
    public void testLoginUser() {
        login.registerUser("kyl_1", "Ch&&sec@ke99!", "Kyle", "Smith");
        assertTrue(login.loginUser("kyl_1", "Ch&&sec@ke99!"));
        assertFalse(login.loginUser("kyl_1", "wrongpassword"));
    }

    @Test
    public void testReturnLoginStatus() {
        login.registerUser("kyl_1", "Ch&&sec@ke99!", "Kyle", "Smith");
        assertEquals("Welcome Kyle, it is great to see you again.", login.returnLoginStatus("kyl_1", "Ch&&sec@ke99!"));
        assertEquals("Username or password incorrect, please try again.", login.returnLoginStatus("kyl_1", "wrongpassword"));
    }
}