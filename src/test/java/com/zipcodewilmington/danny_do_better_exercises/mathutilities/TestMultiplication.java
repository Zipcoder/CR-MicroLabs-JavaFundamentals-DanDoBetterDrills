package com.zipcodewilmington.danny_do_better_exercises.mathutilities;

import com.zipcodewilmington.danny_do_better_exercises.MathUtilities;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 8/26/18.
 */
public class TestMultiplication {

    private static volatile MathUtilities mathUtils = new MathUtilities();


    @Test
    public void testIntegerMultiplication(){
        // : Given
        int multiplicand = 5;
        int multiplier = 2;
        int expectedInt = 10;
        // : When
        int actualInt = mathUtils.multiply(multiplicand,multiplier);
        // : Then
        System.out.println("The final value in testIntegerMultiplication is--->"+actualInt);
        assertEquals(expectedInt,actualInt);
    }
    @Test
    public void testLongMultiplication() {
        // : Given
        long multiplicand = 20;
        long multiplier = 1000;
        long expectedLong = 20000;
        // : When
        long actualLong = mathUtils.multiply(multiplicand, multiplier);
        // : Then
        System.out.println("The final value in longMultiplication--->"+actualLong);
        assertEquals(expectedLong, actualLong);
    }
    @Test
    public void testShortMultiplication() {
        // : Given
        short multiplicand = 2;
        short multiplier = 1;
        short expectedShort = 2;
        // : When
        short actualShort = mathUtils.multiply(multiplicand, multiplier);
        // : Then
        System.out.println("The final value in testShortMultiplication--->"+actualShort);
        assertEquals(expectedShort, actualShort);
    }
    @Test
    public void testByteMultiplication() {
        // : Given
        byte multiplicand = 16;
        byte multiplier = 14;
        byte expectedByte = -32;
        // : When
        byte actualByte = mathUtils.multiply(multiplicand, multiplier);
        // : Then
        System.out.println("The final value in testShortMultiplication--->"+actualByte);
        assertEquals(expectedByte, actualByte);
    }
    @Test
    public void testFloatMultiplication() {
        // : Given
        float multiplicand = 2.5F;
        float multiplier = 1;
        float expectedFloat = 2.50F;
        // : When
        float actualFloat =  mathUtils.multiply(multiplicand,multiplier);
        // : Then
        System.out.println("The final value in testFloatMultiplication--->"+actualFloat);
        assertEquals(expectedFloat, actualFloat, 0);
    }
    @Test
    public void testDoubleMultiplication() {
        // : Given
        double multiplicand = 3.25;
        double multiplier = 3.0;
        double expectedDouble = 9.75;
        // : When
        double actualDouble = mathUtils.multiply(multiplicand,multiplier);
        // : Then
        System.out.println("The final value in testFloatMultiplication--->"+actualDouble);
        assertEquals(expectedDouble, actualDouble, 0);
    }
}
