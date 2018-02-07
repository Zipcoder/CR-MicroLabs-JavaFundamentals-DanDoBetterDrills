package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class MathUtilities {

    public Integer add(int baseValue, int difference) {
        return baseValue + difference;
    }

    public Long add(long baseValue, long difference) {
        return baseValue + difference;
    }

    public Short add(short baseValue, short difference) {
         return (short) (baseValue + difference);
    }

    public Byte add(byte baseValue, byte difference) {
        return (byte) (baseValue + difference);
    }

    public Float add(float baseValue, float difference) {
        float floatyAdd = (baseValue + difference);
        return Math.round(floatyAdd * 1000f)/1000f;
    }

    public Double add(double baseValue, double difference) {
        return baseValue + difference;
    }

    public Integer subtract(int baseValue, int difference) {
        return baseValue - difference;
    }

    public Long subtract(long baseValue, long difference) {
        return baseValue - difference;
    }

    public Short subtract(short baseValue, short difference) {
        return (short) (baseValue - difference);
    }

    public Byte subtract(byte baseValue, byte difference) {
        return (byte) (baseValue - difference);
    }

    public Float subtract(float baseValue, float difference) {
        float floatySub = (baseValue - difference);
        return Math.round(floatySub * 1000f)/1000f;
    }

    public Double subtract(double baseValue, double difference) {
        return baseValue - difference;
    }

    public Integer divide(int dividend, int divisor) {
        return dividend / divisor;
    }

    public Long divide(long dividend, long divisor) {
        return dividend / divisor;
    }

    public Short divide(short dividend, short divisor) {
        return (short) (dividend / divisor);
    }

    public Byte divide(byte dividend, byte divisor) {
        return (byte) (dividend / divisor);
    }

    public Float divide(float dividend, float divisor) {
        return dividend / divisor;
    }

    public Double divide(double dividend, double divisor) {
        return dividend / divisor;
    }

    public Integer multiply(int multiplicand, int multiplier) {
        return multiplicand * multiplier;
    }

    public Long multiply(long multiplicand, long multiplier) {
        return multiplicand * multiplier;
    }

    public Short multiply(short multiplicand, short multiplier) {
        return (short) (multiplicand * multiplier);
    }

    public Byte multiply(byte multiplicand, byte multiplier) {
        return (byte) (multiplicand * multiplier);
    }

    public Float multiply(float multiplicand, float multiplier) {
        Float floatProduct = multiplicand * multiplier;
        return floatProduct;
    }

    public Double multiply(double multiplicand, double multiplier) {
        Double doubleProduct = multiplicand * multiplier;
        return doubleProduct;
    }

    public Boolean returnTrue() {
        return true;
    }

    public Boolean returnFalse() {
        return false;
    }

}
