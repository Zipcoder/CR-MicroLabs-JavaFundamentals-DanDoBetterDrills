package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {

    public static String getHelloWorld() {

        return "Hello World";
    }

    public static String concatenation(String firstSegment, String secondSegment){

        return firstSegment + secondSegment;
    }

    public static String concatenation(int firstSegment, String secondSegment){

        return firstSegment + secondSegment;
    }

    public static String getPrefix(String input){

        return input.substring(0,3);
    }

    public static String getSuffix(String input){

        return input.substring(2);
    }

    public static Boolean compareTwoStrings(String inputValue, String comparableValue){

        return inputValue.equals(comparableValue) ;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){

        return input;
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        return null;
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        return null;
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverseTheTwo(String stringToReverse){
        return null;
    }
}
