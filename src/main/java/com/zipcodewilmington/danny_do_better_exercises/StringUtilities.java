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

    public static Character getMiddleCharacter(String inputValue){
        int length = inputValue.length();
        int middleIndex = length / 2;
        if (middleIndex % 2 == 0){
            middleIndex = middleIndex - 1;
        }
        char middleCharacter = inputValue.charAt(middleIndex);
        return middleCharacter;
    }

    public static String getFirstWord(String spaceDelimitedString) {
        String[] firstWord = spaceDelimitedString.split(" ");
        return firstWord[0];
    }

    public static String getSecondWord(String spaceDelimitedString){
        String[]secondWord = spaceDelimitedString.split( " ");
        return secondWord[1];
    }

    public static String reverseTheTwo(String stringToReverse){

        String reverse = new StringBuffer(stringToReverse).reverse().toString();

        return reverse;
    }
}
