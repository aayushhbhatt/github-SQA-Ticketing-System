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
public class addcreditTestCase {

    public addcreditTestCase() {
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
        double oldcredit = 0;
        double amount = 400;
        String user = "12raj";
        String usertype= "BS";
        BuySellUser tem = new BuySellUser();
        String actual = tem.addcredit( amount, oldcredit,  user,  usertype);
        String expected = "Credit successfully added";        
        assertEquals(actual,expected);
    }
    
    @Test
    public void test2() {
        double oldcredit = 0;
        double amount = 1100;
        String user = "12raj";
        String usertype= "BS";
        BuySellUser tem = new BuySellUser();
        String actual = tem.addcredit( amount, oldcredit,  user,  usertype);
        String expected = "Invalid Amount";        
        assertEquals(actual,expected);
    }
    @Test
    public void test3() {
        //Checks for the user name
        //Explained in the Report 
        double oldcredit = 5;
        double amount = 10;
        String user = "12raj";
        String usertype = "BS";
        BuySellUser tem = new BuySellUser();
        String actual = tem.addcredit(amount, oldcredit, user, usertype);
        double newcredit = 15;
        String expected = Double.toString(newcredit);        
        assertEquals(actual, expected);
    }
}
