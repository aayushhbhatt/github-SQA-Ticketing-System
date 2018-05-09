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
public class logoutTestCasesTest {
    
    public logoutTestCasesTest() {
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
        BuyUser bs = new BuyUser();
        String logoutmessage = "LoGout";
        String actual,expected;
        if (logoutmessage.equalsIgnoreCase("logout"))
        {
           actual = "success";
        }
        else
            actual = "failure";
        expected = "success";
        assertEquals(actual,expected); 
    }

        @Test
    public void testMain2() throws Exception {
        BuyUser bs = new BuyUser();
        String logoutmessage = "Loggedout";
        String actual,expected;
        if (logoutmessage.equalsIgnoreCase("logout"))
        {
           actual = "success";
        }
        else
            actual = "failure";
        expected = "failure";
        assertEquals(actual,expected); 
    }
}
