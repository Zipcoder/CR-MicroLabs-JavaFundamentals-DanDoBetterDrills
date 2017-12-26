package PrimativeTypes;

import PrimitiveTypes.PrimitiveTypes;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
// * Created by dan on 6/14/17.
// */
public class PrimativeTypesTest {

    PrimitiveTypes primitiveTypes;

    @Before public void initialize(){
        primitiveTypes = new PrimitiveTypes();
    }
    @Test
    public void testAdditionsInt() {
        PrimitiveTypes primitiveTypesInt = new PrimitiveTypes();
        int expectedInt = 38;
        int actualInt = primitiveTypesInt.add(30, 8);
        assertEquals(expectedInt, actualInt);
    }

    @Test
    public void testAdditionLong() {
        PrimitiveTypes primitiveTypesLong = new PrimitiveTypes();
        long expectedLong = 45678911;
        long actualLong = primitiveTypesLong.add(45678910, 1);
        ///System.out.println(actualLong);
        assertEquals(expectedLong, actualLong);

    }

    @Test
    public void testAdditionShort() {
        PrimitiveTypes primitiveTypesShort = new PrimitiveTypes();
        long expectedShort = 32767;
        long actualShort = (short) primitiveTypesShort.add(16384, 16383);
        System.out.println(actualShort);
        assertEquals(expectedShort, actualShort);
    }

    @Test
    public void testAdditionByte() {
        PrimitiveTypes primitiveTypesByte = new PrimitiveTypes();
        byte expectedByte = 127;
        byte actualByte = (byte) primitiveTypesByte.add(63, 64);
        assertEquals(expectedByte, actualByte);

    }

    //add f to the end of the number
    @Test
    public void testAdditionFloat() {
        PrimitiveTypes primitiveTypesFloat = new PrimitiveTypes();
        float expectedFloat = 1545.585f;
        float actualFloat = primitiveTypesFloat.addFloat(750.585f, 795.000f);
        Assert.assertEquals(expectedFloat, actualFloat, .000001);
    }

    @Test
    public void testDoubleAddition() {
        PrimitiveTypes doublePrimitive = new PrimitiveTypes();
        double expectedDouble = 456.25;
        double actualDouble = doublePrimitive.addDouble(225.25, 231);
        Assert.assertEquals(expectedDouble, actualDouble, .03);
    }


//    @Test
//    public void testSubtractionInt() {
//        PrimitiveTypes subtractPrimitiveInt = new PrimitiveTypes();
//        int expectedInt = 20;
//        int actualInt = subtractPrimitiveInt.subtractInt(22, 2);
//        assertEquals(expectedInt, actualInt);
//    }
//
//    @Test
//    public void testSubtractLong() {
//        PrimitiveTypes subtractPrimitiveLong = new PrimitiveTypes();
//        long expectedLong = 1;
//        long actualLong = subtractPrimitiveLong.subtractLong(228437266, 228437265);
//        System.out.println(actualLong);
//        assertEquals(expectedLong, actualLong);
//    }
//
//    @Test
//    public void testSubtractShort(){
//        PrimitiveTypes subtractShort = new PrimitiveTypes();
//        short expectedShort = 1;
//        short actualShort = (short) subtractShort.subtractShort(16384,16383);
//        Assert.assertEquals(expectedShort, actualShort);
//        assertEquals(expectedShort,actualShort);
//    }

    @Test
    public void testSubtractions(){
        int expectedInt = 13;
        int actualInt = this.primitiveTypes.subtractInt(20,7);

        long expectedLong = 1;
        long actualLong = this.primitiveTypes.subtractLong(228437266, 228437265);

        short expectedShort = 1;
        short actualShort = (short) this.primitiveTypes.subtractShort(16384, 16383);

        byte expectedByte = -1;
        byte actualByte = (byte) this.primitiveTypes.subtract(63, 64);

        float expectedFloat = (float) -44.415;
        float actualFloat = (float) this.primitiveTypes.subtract(750.585,795.000);

        double expectedDouble = -5.75;
        double actualDouble = this.primitiveTypes.subtract(225.25,231);

        assertEquals(expectedInt,actualInt);
        assertEquals(expectedLong,actualLong);
        assertEquals(expectedShort,actualShort);
        assertEquals(expectedByte,actualByte);
        assertEquals(expectedFloat,actualFloat, 0);
        assertEquals(expectedDouble,actualDouble, 0);
    }



    @Test
    public void testDivision(){
        int expectedInt = 10;
        int actualInt = this.primitiveTypes.divide(20,2);

        long expectedLong = 20000;
        long actualLong = this.primitiveTypes.divide(20000000, 1000);

        short expectedShort = 2;
        short actualShort = (short) this.primitiveTypes.divide(2, 1);

        byte expectedByte = 2;
        byte actualByte = (byte) this.primitiveTypes.divide(64, 32);

        float expectedFloat = (float) 2.50;
        float actualFloat = (float) this.primitiveTypes.divide(7.5,3);

        double expectedDouble = 1.25;
        double actualDouble = this.primitiveTypes.divide(5.0,4.0);

        assertEquals(expectedInt,actualInt);
        assertEquals(expectedLong,actualLong);
        assertEquals(expectedShort,actualShort);
        assertEquals(expectedByte,actualByte);
        assertEquals(expectedFloat,actualFloat, 0);
        assertEquals(expectedDouble,actualDouble, 0);
    }




    @Test
    public void testMultiplication(){
        int expectedInt = 10;
        int actualInt = this.primitiveTypes.multiply(5,2);

        long expectedLong = 20000;
        long actualLong = this.primitiveTypes.multiply(20, 1000);

        short expectedShort = 2;
        short actualShort = (short) this.primitiveTypes.multiply(2, 1);

        byte expectedByte = 64;
        byte actualByte = (byte) this.primitiveTypes.multiply(16, 4);

        float expectedFloat = (float) 2.50;
        float actualFloat = (float) this.primitiveTypes.multiply(2.50,1);

        double expectedDouble = 9.75;
        double actualDouble = this.primitiveTypes.multiply(3.25,3.0);

        assertEquals(expectedInt,actualInt);
        assertEquals(expectedLong,actualLong);
        assertEquals(expectedShort,actualShort);
        assertEquals(expectedByte,actualByte);
        assertEquals(expectedFloat,actualFloat, 0);
        assertEquals(expectedDouble,actualDouble, 0);
    }

    @Test
    public void testBoolean() {

        PrimitiveTypes testTrue = new PrimitiveTypes();
        boolean expected = true;
        boolean actual = testTrue.returnTrue();
        Assert.assertEquals(expected, actual);
}

        @Test

        public void testBooleanFalse(){
        PrimitiveTypes testFalse = new PrimitiveTypes();
        assertFalse(testFalse.returnFalse());
        }
//
    }
