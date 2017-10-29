package Strings;

/**
 * Created by dan on 6/14/17.
 */
public class Strings {

    //Concatenate two strings together that are passed in the parameters
    public String concatenation(String one, String two){
        String output = one + two;
        return output;
    }

    //Concatenate a string and a integer together that are passed in the parameters
    public String concatenation(int one, String two){
        String output = one + two;
        return output;
    }

    //Get the substring of the first three letters of a string
    public String subStringBegin(String input){
        String output = input.substring(0, 3);
        return output;
    }

    //Get the substring of a string "Hello" so it returns the last three letters only
    public String subStringEnd(String input){
        String output = input.substring(input.length() - 3);
        return output;
    }

    //Compare the two strings using compareTo() and if they are return true, else false
    public boolean compareTwoStrings(String one, String two){
        int answer = one.compareTo(two);
        if (answer == 0){
            return true;
        } else {
            return false;
        }
    }

    //Compare the two strings using equals() and if they are return true, else false
    public boolean compareTwoStringsEqual(String one, String two){
        if (one.equals(two)){
            return true;
        } else {
            return false;
        }
    }

    //Write a method that returns the middle character in the given string hint: use the .length and .charAt methods
    public char getTheMiddleChar(String string){
        int indexToRemove = (string.length() / 2);
        return string.charAt(indexToRemove);
    }

    //Use the indexOf method to find the first space in a string and .substring() to return the first word
    public String getTheFirstWord(String string){
        return string.substring(0, string.indexOf(' '));
    }

    //Use the same behavior to find the second word
    public String getTheSecondWord(String string){
        String subString = string.substring(string.indexOf(' ') + 1);
        return subString;
    }

    //Create a method that uses the above methods to return a string consisting of the second and first word in reversed order
    public String reverseTheTwo(String string){
        String substring = string.substring(string.indexOf(' ') + 1) + " " + string.substring(0, string.indexOf(' '));
        return substring;
    }

}
