/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author preet
 */
public class createTestCases {

    @Test
    public void test() {
        Admin a = new Admin();
        String actual = a.create("aloknath", "BS");
        String expected = "User account successfully created";
        assertEquals(actual, expected);
    }

    @Test
    public void test1() {
        Admin b = new Admin();
        String actual = b.create("ilovecps", "SS");
        String expected = "User account successfully created";
        assertEquals(actual, expected);
    }

    @Test
    public void test2() {
        Admin c = new Admin();
        String actual = c.create("JackMa", "AA");
        String expected = "User account successfully created";
        assertEquals(actual, expected);
    }
}
