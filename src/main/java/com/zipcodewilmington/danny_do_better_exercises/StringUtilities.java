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
        String s1="";
        for(int i=0; i<3; i++)
        {
            s1=s1+input.charAt(i);
        }
        return s1;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input)
    {
        String s2="";
        for(int i=input.length()-3;i<input.length();i++){
       s2=s2+input.charAt(i);
        }
        return s2;
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        if(inputValue==comparableValue){
           return true;
        }
        return false ;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
        int m=inputValue.length();
        char c;
        if(m%2==0){
             c=inputValue.charAt((m/2)-1);
        }
        else{
             c=inputValue.charAt((m/2));
        }

        return c;
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        String s= "";
       for(int i=0;i<spaceDelimitedString.length() ; i++ ){
           if(spaceDelimitedString.charAt(i)!=' '){
               s=s+spaceDelimitedString.charAt(i);
           }
           else{
               break;
           }
       }

        return s;
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String first=getFirstWord(spaceDelimitedString);
        int n=first.length();
        String cutStr="";
        for(int i=n+1;i<spaceDelimitedString.length();i++){
           cutStr=cutStr+spaceDelimitedString.charAt(i);
        }
        String second=getFirstWord(cutStr);

        return second;
    }


    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        String reverse="";
        for(int i=stringToReverse.length()-1;i>=0;i--){
            reverse=reverse+stringToReverse.charAt(i);
        }
        return reverse;
    }
}
