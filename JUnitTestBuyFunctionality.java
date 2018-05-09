/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyjtest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BHATT
 */
public class BuyJTestTest {
    
    public BuyJTestTest() {
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

    @Test
    public void testBuy() {
        System.out.println("buy");
        String title = "";
        int numOfTickets = 0;
        String sellername = "";
        String myname = "";
        BuyJTest instance = new BuyJTest();
        String expResult = "";
        String result = instance.buy("", 2, "kimk", "12raj");
        assertEquals("Missing Input", result);
      //  fail("The test case is a prototype.");
    }

     @Test
    public void testBuy2() {
        System.out.println("buy");
        String title = "";
        int numOfTickets = 0;
        String sellername = "";
        String myname = "";
        BuyJTest instance = new BuyJTest();
        String expResult = "";
        String result = instance.buy("Event", 6, "kimk", "12raj");
        assertEquals("Number of tickets out of range", result);
      //  fail("The test case is a prototype.");
    }
    
//     @Test
    //Need to emppty the Current user file to check the test case
//    public void testBuy3() {
//        System.out.println("buy");
//        String title = "";
//        int numOfTickets = 0;
//        String sellername = "";
//        String myname = "";
//        BuyJTest instance = new BuyJTest();
//        String expResult = "";
//        String result = instance.buy("Event", 2, "kimk", "12raj");
//        assertEquals("Empty File", result);
//      //  fail("The test case is a prototype.");
//    }
//    
//     @Test
     //Need to change avaialble tickets to 3 in Available Tickets file to test the case 
//    public void testBuy4() {
//     System.out.println("buy");
//        String title = "";
//        int numOfTickets = 0;
//        String sellername = "";
//        String myname = "";
//        BuyJTest instance = new BuyJTest();
//        String expResult = "";
//        String result = instance.buy("Event", 4, "kimk", "12raj");
//        assertEquals("Seller doesnt have enough tickets", result);
//      //  fail("The test case is a prototype.");
//    }
    
//    @Test
    //Need to remove kimk user from current user file to test the below test case
//    public void testUpdateUserFile() {
//        System.out.println("UpdateUserFile");
//        String sName = "";
//        String bName = "";
//        double totalCost = 0.0;
//        BuyJTest instance = new BuyJTest();
//        String expResult = "";
//        String result = instance.UpdateUserFile("kimk", "12raj", 20);
//        assertEquals("User doesnt exist", result);
//        //fail("The test case is a prototype.");
 //   }



//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        BuyJTest.main(args);
//        fail("The test case is a prototype.");
//    }
    
}
