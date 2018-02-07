package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class MathUtilities {


    public Integer add(int baseValue, int difference) {
        int add = baseValue + difference;
        return add;
    }

    public Long add(long baseValue, long difference) {
        long add = baseValue + difference;
        return add;
    }

    public Short add(short baseValue, short difference) {
        int sum = baseValue + difference;
        short shortSum = (short) sum;
        return shortSum;
    }

    public Byte add(byte baseValue, byte difference) {
        int sum = baseValue + difference;
        byte byteSum = (byte) sum;
        return byteSum;
    }

    public Float add(float baseValue, float difference) {
       float add = baseValue + difference;
        return add;
    }

    public Double add(double baseValue, double difference) {
        double add = baseValue + difference;
        return add;
    }

    public Integer subtract(int baseValue, int difference) {
        int subtract = baseValue - difference;
        return subtract;
    }

    public Long subtract(long baseValue, long difference) {
        long subtract = baseValue - difference;
        return subtract;
    }

    public Short subtract(short baseValue, short difference) {
        int sum = baseValue - difference;
        short shortSum = (short) sum;
        return shortSum;

    }

    public Byte subtract(byte baseValue, byte difference) {
        int sum = baseValue - difference;
        byte byteSum = (byte) sum;
        return byteSum;

    }

    public Float subtract(float baseValue, float difference) {
        float subtract = baseValue - difference;
        return subtract;
    }

    public Double subtract(double baseValue, double difference) {
        double subtract = baseValue - difference;
        return subtract;
    }

    public Integer divide(int dividend, int divisor) {
        int divide = dividend / divisor;
        return divide;
    }

    public Long divide(long dividend, long divisor) {
        long divide = dividend / divisor;
        return divide;

    }

    public Short divide(short dividend, short divisor) {
        int sum = dividend / divisor;
        short shortSum = (short) sum;
        return shortSum;

    }

    public Byte divide(byte dividend, byte divisor) {
        int sum = dividend / divisor;
        byte byteSum = (byte) sum;
        return byteSum;

    }

    public Float divide(float dividend, float divisor) {
        float divide = dividend / divisor;
        return divide;

    }

    public Double divide(double dividend, double divisor) {
        double divide = dividend / divisor;
        return divide;

    }

    public Integer multiply(int multiplicand, int multiplier) {
        int multiply = multiplicand * multiplier;
        return multiply;
    }

    public Long multiply(long multiplicand, long multiplier) {
        long multiply = multiplicand * multiplier;
        return multiply;
    }

    public Short multiply(short multiplicand, short multiplier) {
        int sum = multiplicand * multiplier;
        short shortSum = (short) sum;
        return shortSum;
    }

    public Byte multiply(byte multiplicand, byte multiplier) {
        int sum = multiplicand * multiplier;
        byte byteSum = (byte) sum;
        return byteSum;
    }

    public Float multiply(float multiplicand, float multiplier) {
        float multiply = multiplicand * multiplier;
        return multiply;
    }

    public Double multiply(double multiplicand, double multiplier) {
        double multiply = multiplicand * multiplier;
        return multiply;

    }

    public Boolean returnTrue() {
        if (20 < 100) {
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean returnFalse() {
        if (69 >= 9000) {
            return true;
        } else {
            return false;
        }

    }

}
