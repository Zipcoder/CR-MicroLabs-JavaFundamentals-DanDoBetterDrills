package com.zipcodewilmington.danny_do_better_exercises;

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

        return firstSegment + secondSegment;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){

        return firstSegment + secondSegment;
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

        return input.substring(input.length() - 3);
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
    public static int getMiddleCharacter(String inputValue) {
        // Checking to see if the string is even numbers fist
        // if its not Even, then return the character after its been divided by two
        if(inputValue.length()%2==0){
           /*For Even: this returns the length of inputValue's characters, AFTER
           its been divided by 2 and subtracted by one.*/
           return inputValue.charAt((inputValue.length()/2));
       }else {
            return inputValue.charAt((inputValue.length() / 2) - 1);
        }
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        //using .split and index 0 to grab the first word in spaceDelimitedString.
        return spaceDelimitedString.split(" ")[0];
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        //same as above but index 1 represents the second word.
        return spaceDelimitedString.split(" ")[1];
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverseTheTwo(String stringToReverse){
        //so if the string contains a space, I want to split it then reverse it
        if (stringToReverse.contains(" ")
            return(reverse(stringToReverse.split(" ")));
        else //if not still reverse it
            return(reverse(stringToReverse));
    }
}

//Everytime I try to test "TestStringUtilities I get "java: char cannot be dereferenced."