package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Refactored
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
        return input.substring(0,3); //returns a range of characters from the string from index positions 0 - 3 (prefix)
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

        return inputValue.charAt(middleIndex);
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
        return new StringBuffer(stringToReverse).reverse().toString();
    }
}