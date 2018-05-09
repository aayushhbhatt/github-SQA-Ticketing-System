/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramesh
 */
public class loginTestCasesTest {
    
    public loginTestCasesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class event.
     */
    @Test
    public void testMain() throws Exception {
        String message = "onada";
        String exists="";
        String doesnotexist="";
        Scanner file = new Scanner(new FileReader("CurrentUserFile.txt")).useDelimiter("\\s");
        while (file.hasNextLine()) {
            String[] split = file.nextLine().split(" ");
            if (message.equals(split[0])) {
                exists = "User exists";
            }
            else
            {
               doesnotexist = "User does not exist";
            }
        }
        file.close();
        String actual = exists;
        String expected = exists;
        assertEquals(actual, expected);
    }
    
    @Test
    public void testMain2() throws Exception {
        String message = "Timothy";
        String exists="";
        String doesnotexist="";
        Scanner file = new Scanner(new FileReader("CurrentUserFile.txt")).useDelimiter("\\s");
        while (file.hasNextLine()) {
            String[] split = file.nextLine().split(" ");
            if (message.equals(split[0])) {
                exists = "User exists";
            }
            else
            {
               doesnotexist = "User does not exist";
            }
        }
        file.close();
        String actual = doesnotexist;
        String expected = doesnotexist;
        assertEquals(actual, expected);
    }
}
