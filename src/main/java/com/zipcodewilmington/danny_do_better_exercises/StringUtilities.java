package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        String hello = "Hello World";
        return hello;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){

        return firstSegment + secondSegment;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment) {
//    String firstString = Integer.toString(firstSegment);
       // firstSegment = "a string to be added to";


        return String.valueOf(firstSegment) + secondSegment;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){


        return input.substring(0,3);
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        String shortString = input.substring(input.length() -3);
        return shortString;
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue) {


        return inputValue.equals(comparableValue);


    }
        /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue) {


        //return  middleString = inputValue.charAt(inputValue.length()/2);
 // even length string
        //if (inputValue.length() % 2 == 0) {
            char middleString = inputValue.charAt(inputValue.length() / 2);

           // return middleString;
        //} else
            return middleString;
    }
    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
       // String [] firstWord;
        //
       // how can I get rid of regex or why would I use regex?
        // firstWord = spaceDelimitedString.split("");

       // return firstWord[0];
        return spaceDelimitedString.substring(0,spaceDelimitedString.indexOf(""));
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){

        return spaceDelimitedString.substring(spaceDelimitedString.indexOf(""),spaceDelimitedString.length());
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverseTheTwo(String stringToReverse){
         StringBuilder reverseString = new StringBuilder();
        reverseString.append(stringToReverse);
        reverseString = reverseString.reverse();
       return reverseString.toString();

    }
}
