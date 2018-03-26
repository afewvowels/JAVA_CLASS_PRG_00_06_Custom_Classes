/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_class_prg_00_06_custom_classes;

import exceptions.IllegalMinuteException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kbsmith01
 */
public class ClockTest {
    
    public ClockTest() {
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
     * Test of setHour method, of class Clock.
     */
    @Test
    public void testSetHour() {
        System.out.println("setHour");
        int hour = 9;
        Clock instance = new Clock(12,57);
        instance.setHour(hour);
        assertEquals("Hour failed","0"+hour,instance.getHour());
        assertEquals("Minute failed","57",instance.getMinute());
    }

    /**
     * Test of setMinute method, of class Clock.
     */
    @Test
    public void testSetMinute() {
        System.out.println("setMinute");
        int minute = 4;
        Clock instance = new Clock(12,57);
        instance.setMinute(minute);
        String expResult = "12 4";
        String result = instance.toString();
        assertEquals("Minute did not match",expResult,result);
    }

    /**
     * Test of setMinute method, of class Clock.
     */
    @Test
    public void testSetMinuteException() {
        System.out.println("setMinute");
        int minute = 61;
        Clock instance = new Clock(12,57);
        try {
           instance.setMinute(minute);
           fail("Should have thrown exception");
        }
        catch (IllegalMinuteException e) {
            String expected = "12 57";
            String actual = instance.toString();
            assertEquals(expected,actual);
        }
//        String expResult = "12 4";
//        String result = instance.toString();
//        assertEquals("Minute did not match",expResult,result);
    }
    /**
     * Test of setTime method, of class Clock.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        int hour = 0;
        int minute = 0;
        Clock instance = new Clock();
        instance.setTime(hour, minute);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHour method, of class Clock.
     */
    @Test
    public void testGetHour() {
        System.out.println("getHour");
        Clock instance = new Clock();
        String expResult = "";
        String result = instance.getHour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMinute method, of class Clock.
     */
    @Test
    public void testGetMinute() {
        System.out.println("getMinute");
        Clock instance = new Clock(12,7);
        String expResult = "07";
        String result = instance.getMinute();
        assertEquals("Unexpected result.", expResult, result);
    }

    /**
     * Test of getTime method, of class Clock.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        Clock instance = new Clock();
        String expResult = "";
        String result = instance.getTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incrementMinute method, of class Clock.
     */
    @Test
    public void testIncrementMinuteNormal() {
        System.out.println("incrementMinute");
        Clock instance = new Clock(9,37);
        instance.incrementMinute();
        assertEquals("9 38",instance.toString());
    }
    
    /**
     * Test of incrementMinute method, of class Clock.
     */
    @Test
    public void testIncrementMinuteHour() {
        System.out.println("incrementMinute");
        Clock instance = new Clock(12,59);
        instance.incrementMinute();
        assertEquals("13 0",instance.toString());
    }

    /**
     * Test of incrementMinute method, of class Clock.
     */
    @Test
    public void testIncrementMinuteDay() {
        System.out.println("incrementMinute");
        Clock instance = new Clock(23,59);
        instance.incrementMinute();
        assertEquals("0 0",instance.toString());
    }
    
        /**
     * Test of incrementHour method, of class Clock.
     */
    @Test
    public void testIncrementHour() {
        System.out.println("incrementHour");
        Clock instance = new Clock(23,59);
        instance.incrementHour();
        assertEquals("0 59",instance.toString());
    }
    

    /**
     * Test of toString method, of class Clock.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Clock instance = new Clock();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
