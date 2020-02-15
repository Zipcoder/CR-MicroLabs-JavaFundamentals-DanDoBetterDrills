package com.zipcodewilmington.danny_do_better_exercises;

import java.util.Arrays;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        return "Hello World";
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        return firstSegment.concat(secondSegment);
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        // make new string set value
        String result = "";
        result += firstSegment;
        result += secondSegment;

        return result;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        String firstThreeChars= "";
        if (input.length() >3) {
           firstThreeChars = input.substring(0,3);
       }
        else {
            firstThreeChars = input;
        }
        return firstThreeChars;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        String lastThreeChars= "";
        if (input.length() > 3) {
            lastThreeChars = input.substring(input.length() - 3);
        }
        else {
            lastThreeChars = input;
        }
        return lastThreeChars;
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        return inputValue.equals(comparableValue);
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue) {
        if ((inputValue.length() % 2) == 1) {
            return inputValue.charAt(inputValue.length() / 2);
        } else {
            return inputValue.charAt((inputValue.length() / 2) -1);


        }
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString) {
        String [] result = spaceDelimitedString.split(" ");

        return result[0];
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String [] result = spaceDelimitedString.split(" ");

        return result[1];
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse) {
        String result = new StringBuilder(stringToReverse).reverse().toString();


        return result;
    }
}
