package com.zipcodewilmington.danny_do_better_exercises;

//import sun.jvm.hotspot.HelloWorld;

import java.util.Objects;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        String str = "Hello World";
        return str;

    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment) {

        return firstSegment.concat(secondSegment);
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment) {
        return firstSegment + secondSegment;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input) {
        String ThreeChars = "";     //substring containing first 3 characters

        if (input.length() > 3) {
            ThreeChars = input.substring(0, 3);
        } else {
            ThreeChars = input;
        }

        System.out.println(ThreeChars);

        return ThreeChars;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input) {
        String lastThreeChars = "";     //substring containing last 3 characters

        if (input.length() > 3) {
            lastThreeChars = input.substring(input.length() - 3);
        } else {
            lastThreeChars = input;
        }

        System.out.println(lastThreeChars);

        return lastThreeChars;

    }

    /**
     * @param inputValue      the value to be compared
     * @param comparableValue the value to be compared against
     */
    public static boolean compareTwoStrings(String inputValue, String comparableValue) {

        if (inputValue.equals(comparableValue))
        {
            System.out.println("Input value is -->"+inputValue);
            System.out.println("Compare value is -->"+comparableValue);
            return true;
        }
        else {
            System.out.println("Not compared Input value is -->" + inputValue);
            System.out.println("Not compared comparableValue value is -->" + comparableValue);
            return false;
        }
    }
    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
       // return (inputValue.charAt(inputValue.length() /2));
        String str = inputValue;
        int length = str.length();
        if(length%2==0)
        {
            char ch1=str.charAt((length/2)-1);
            return ch1;
        }
        else
        {
            char ch = str.charAt(length/2);
            return ch;

        }
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString)
    {
        int i = spaceDelimitedString.indexOf(' ');
        String word = spaceDelimitedString.substring(0, i);
        System.out.println(" The first word is -->"+word);
        return word;
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){

        int i = spaceDelimitedString.indexOf(' ');
        // It will only work when there are only two words.
        String word = spaceDelimitedString.substring(i+1);
        System.out.println(" The second word is -->"+word);
        return word;


    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){

        System. out. println("Enter string to reverse:");
               String strNew = "";


        for(int i = stringToReverse. length() - 1; i >= 0; i--)
        {
            strNew = strNew + stringToReverse. charAt(i);

        }
        System.out.println(" The reversed string  is -->"+strNew);
        return strNew;
    }
}
