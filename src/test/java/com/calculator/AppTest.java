package com.calculator;

//import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for Calculator.
 */
public class AppTest 
{
    /*
     * Tests the add() method
     */
    @Test
    public void testAddition()
    {
       double result = App.add(3.0, 7.0);
       assertEquals(10, result, 0.001);
    }

    /*
     * Tests the subtract() method
     */
    @Test
    public void testSubtraction()
    {
       double result = App.subtract(10.0, 5.0);
       assertEquals(5.0, result, 0.001);
    }
}
