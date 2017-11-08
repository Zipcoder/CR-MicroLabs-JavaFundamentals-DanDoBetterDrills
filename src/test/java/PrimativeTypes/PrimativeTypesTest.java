package PrimativeTypes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by dan on 6/14/17.
 */
public class PrimativeTypesTest {

    PrimativeTypes primativeTypes;

    @Before
    public void initialize() {

        primativeTypes = new PrimativeTypes();
    }

    @Test
    public void testAdditions() {
        int expectedInt = 27;
        int actualInt = this.primativeTypes.addInt(20, 7);
        assertEquals(expectedInt, actualInt);

        long expectedLong = 456874531;
        long actualLong = this.primativeTypes.add(228437266, 228437265);
        assertEquals(expectedLong, actualLong);

        short expectedShort = 32767;
        short actualShort = (short) this.primativeTypes.addShort(16384, 16383);
        assertEquals(expectedShort, actualShort);

        byte expectedByte = 127;
        byte actualByte = (byte) this.primativeTypes.addByte(63, 64);
        assertEquals(expectedByte, actualByte);

        float expectedFloat = (float) 1545.585;
        float actualFloat = (float) this.primativeTypes.add(750.585, 795.000);
        assertEquals(expectedFloat, actualFloat, 0);

        double expectedDouble = 456.25;
        double actualDouble = this.primativeTypes.add1(225.25, 231);
        assertEquals(expectedDouble, actualDouble, 0);
    }

    @Test
    public void testSubtractions() {
        int expectedInt = 13;
        int actualInt = this.primativeTypes.subtract(20, 7);
        assertEquals(expectedInt, actualInt);

        long expectedLong = 1;
        long actualLong = this.primativeTypes.subtract(228437266, 228437265);
        assertEquals(expectedLong, actualLong);

        short expectedShort = 1;
        short actualShort = (short) this.primativeTypes.subtract(16384, 16383);
        assertEquals(expectedShort, actualShort);

        byte expectedByte = -1;
        byte actualByte = (byte) this.primativeTypes.subtract(63, 64);
        assertEquals(expectedByte, actualByte);

        float expectedFloat = (float) -44.0;
        float actualFloat = (float) this.primativeTypes.subtract(750.585f, 795.000f);
        assertEquals(expectedFloat, actualFloat, 0);

        double expectedDouble = -5.75;
        double actualDouble = this.primativeTypes.subtract(225.25, 231);
        assertEquals(expectedDouble, actualDouble, 0);


    }

    @Test
    public void testDivision() {
        int expectedInt = 10;
        int actualInt = this.primativeTypes.divide(20, 2);
        assertEquals(expectedInt, actualInt);

        long expectedLong = 20000;
        long actualLong = this.primativeTypes.divide(20000000, 1000);
        assertEquals(expectedLong, actualLong);

        short expectedShort = 2;
        short actualShort = (short) this.primativeTypes.divide(2, 1);
        assertEquals(expectedShort, actualShort);

        byte expectedByte = 2;
        byte actualByte = (byte) this.primativeTypes.divide(64, 32);
        assertEquals(expectedByte, actualByte);

        float expectedFloat = (float) 2.50;
        float actualFloat = (float) this.primativeTypes.divide((float) 7.5, 3);
        assertEquals(expectedFloat, actualFloat, 0);

        double expectedDouble = 1.25;
        double actualDouble = this.primativeTypes.divide(5.0, 4.0);
        assertEquals(expectedDouble, actualDouble, 0);

    }

    @Test
    public void testMultiplication() {
        int expectedInt = 10;
        int actualInt = this.primativeTypes.multiply(5, 2);
        assertEquals(expectedInt,actualInt);

        long expectedLong = 20000;
        long actualLong = this.primativeTypes.multiply(20, 1000);
        assertEquals(expectedLong,actualLong);

        short expectedShort = 2;
        short actualShort = (short) this.primativeTypes.multiply(2, 1);
        assertEquals(expectedShort,actualShort);

        byte expectedByte = 64;
        byte actualByte = (byte) this.primativeTypes.multiply(16, 4);
        assertEquals(expectedByte,actualByte);

        float expectedFloat = (float) 2.50;
        float actualFloat = (float) this.primativeTypes.multiply((float) 2.50,1);
        assertEquals(expectedFloat,actualFloat, 0);

        double expectedDouble = 9.75;
        double actualDouble = this.primativeTypes.multiply(3.25,3.0);
        assertEquals(expectedDouble,actualDouble, 0);
    }

    @Test
    public void testBoolean(){
        assertTrue(this.primativeTypes.returnTrue());
        assertFalse(this.primativeTypes.returnFalse());

    }
}


