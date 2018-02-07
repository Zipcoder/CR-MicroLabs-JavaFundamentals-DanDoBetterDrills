package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class PredicateUtilities {

    public Boolean isGreaterThan(int x, int y) {

        if (x > y) {
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean isLessThan(int x, int y) {
        if (x < y) {
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean isGreaterThanOrEqualTo(int x, int y) {
        if (x >= y) {
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean isLessThanOrEqualTo(int x, int y) {
        if (x <= y) {
            return true;
        }
        else {
            return false;
        }
    }
}
