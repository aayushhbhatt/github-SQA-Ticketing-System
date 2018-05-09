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

/**
 *
 * @author Sapna
 */
public class deleteTestCase {

    public deleteTestCase() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void test1() {
        String user = "12raj";
        Admin tem = new Admin();
        String actual = tem.delete(user);
        String expected = "User account sucessfully deleted";
        assertEquals(actual, expected);
    }
    
    @Test
    public void test2() {
        //Failed - details mentioned in the report
        String user = "1helj";
        Admin tem2 = new Admin();
        String actual = tem2.delete(user);
        String expected2 = "User does not exist";
        assertEquals(actual, expected2);
    }
}
