package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Refactored
 */
public class MathUtilities {

    public Integer add(int baseValue, int difference) {
        return baseValue + difference;
    }

    public Long add(long baseValue, long difference) {
        return baseValue + difference;
    }

    public Short add(short baseValue, short difference) {
        int sum = baseValue + difference;
        return (short) sum;
    }

    public Byte add(byte baseValue, byte difference) {
        int sum = baseValue + difference;
        return (byte) sum;
    }

    public Float add(float baseValue, float difference) {
        return baseValue + difference;
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
        int sum = baseValue - difference;
        return (short) sum;
    }

    public Byte subtract(byte baseValue, byte difference) {
        int sum = baseValue - difference;
        return (byte) sum;
    }

    public Float subtract(float baseValue, float difference) {
        return baseValue - difference;
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
        int sum = dividend / divisor;
        return (short) sum;
    }

    public Byte divide(byte dividend, byte divisor) {
        int sum = dividend / divisor;
        return (byte) sum;
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
        int sum = multiplicand * multiplier;
        return (short) sum;
    }

    public Byte multiply(byte multiplicand, byte multiplier) {
        int sum = multiplicand * multiplier;
        return (byte) sum;
    }

    public Float multiply(float multiplicand, float multiplier) {
        return multiplicand * multiplier;
    }

    public Double multiply(double multiplicand, double multiplier) {
        return multiplicand * multiplier;
    }

    public Boolean returnTrue() {
        return true;
    }

    public Boolean returnFalse() {
        return false;
    }
}