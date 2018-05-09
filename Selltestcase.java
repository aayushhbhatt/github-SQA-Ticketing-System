/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selljtest;

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
public class SellJTestTest {
    
    public SellJTestTest() {
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
     public void testSell() {
        System.out.println("sell");
        String title = "";
        double price = 0.0;
        int numOfTickets = 0;
        String sellerName = "";
        SellJTest instance = new SellJTest();
        String expResult = "";
        String result = instance.sell("", 101, 20, "kimk");
        assertEquals("Missing Input", result);
      //  fail("The test case is a prototype.");
    }

      @Test
     public void testSell2() {
        System.out.println("sell");
        String title = "";
        double price = 0.0;
        int numOfTickets = 0;
        String sellerName = "";
        SellJTest instance = new SellJTest();
        String expResult = "";
        String result = instance.sell("Event", 1000, 20, "kimk");
        assertEquals("Invalid Amount", result);
      //  fail("The test case is a prototype.");
    }
     
      @Test
     public void testSell3() {
        System.out.println("sell");
        String title = "";
        double price = 0.0;
        int numOfTickets = 0;
        String sellerName = "";
        SellJTest instance = new SellJTest();
        String expResult = "";
        String result = instance.sell("Event", 10, 101, "kimk");
        assertEquals("Tickets out of range", result);
      //  fail("The test case is a prototype.");
    }
     
      @Test
     public void testSell4() {
        System.out.println("sell");
        String title = "";
        double price = 0.0;
        int numOfTickets = 0;
        String sellerName = "";
        SellJTest instance = new SellJTest();
        String expResult = "";
        String result = instance.sell("", 10, 20,"kimk");
        assertEquals("Missing Input", result);
      //  fail("The test case is a prototype.");
    }
     
      @Test
     public void testSell5() {
        System.out.println("sell");
        String title = "";
        double price = 0.0;
        int numOfTickets = 0;
        String sellerName = "";
        SellJTest instance = new SellJTest();
        String expResult = "";
        String result = instance.sell("Event", 10,20, "kim");
        assertEquals("User doesnt exist", result);
      //  fail("The test case is a prototype.");
    }
   
    
}
