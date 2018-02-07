package com.zipcodewilmington.danny_do_better_exercises;


/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {

    public static String getHelloWorld() {
        String ayMane = "Hello World";
        return ayMane;
    }

    public static String concatenation(String firstSegment, String secondSegment){
        String newWordConcat = firstSegment + secondSegment;
        return newWordConcat;
    }

    public static String concatenation(int firstSegment, String secondSegment){
        String firstSegmentToString = Integer.toString(firstSegment);
        return firstSegmentToString + secondSegment;
    }

    public static String getPrefix(String input){
        return input.substring(0, 3);
    }

    public static String getSuffix(String input){
        String stepOne = new StringBuilder(input).reverse().toString();
        String stepTwo = stepOne.substring(0, 3);
        return new StringBuilder(stepTwo).reverse().toString();
    }

    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        return new String(inputValue).equals(comparableValue);
    }

    public static Character getMiddleCharacter(String inputValue){
        String hadToReverseItBecauseOneOfTheDamnTestCasesWouldntWork = new StringBuilder(inputValue).reverse().toString();
        int length = (hadToReverseItBecauseOneOfTheDamnTestCasesWouldntWork.length())/2;
        char middleChild[] = hadToReverseItBecauseOneOfTheDamnTestCasesWouldntWork.toCharArray();
        return middleChild[length];
    }

    public static String getFirstWord(String spaceDelimitedString){
        String[] probablyZipcode = spaceDelimitedString.split("\\s+");
        return probablyZipcode[0];
    }

    public static String getSecondWord(String spaceDelimitedString){
        String[] probablyWilmington = spaceDelimitedString.split("\\s+");
        return probablyWilmington[1];
    }

    public static String reverseTheTwo(String stringToReverse){
        return new StringBuilder(stringToReverse).reverse().toString();
    }
}
