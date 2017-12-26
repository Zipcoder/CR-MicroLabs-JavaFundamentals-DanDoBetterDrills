package Strings;

/**
 * Created by dan on 6/14/17.
 */
public class Strings {

    //Concatenate two strings together that are passed in the parameters
    public String concatenation(String one, String two){
        return one +two;
    }

    //Concatenate a string and a integer together that are passed in the parameters
    public String concatenation(int one, String two){
        return one +two;
    }

    //Get the substring of the first three letters of a string
    public String subStringBegin(String input){

        return input.substring(0,3);
    }

    //Get the substring of a string "Hello" so it returns the last three letters only
    public String subStringEnd(String input){

        return input.substring(2,5);
    }

    //Compare the two strings using compareTo() and if they are return true, else false
    public boolean compareTwoStrings(String one, String two) {
        if (one.compareTo(two) == 0) {
            return true;
        }
        return false;
    }


    //Compare the two strings using equals() and if they are return true, else false
    public boolean compareTwoStringsEqual(String one, String two){
        if(one.equals(two)) {
            return true;
        }
        return false;
    }

    //Write a method that returns the middle character
    // in the given string hint: use the .length

    public String getTheMiddleChar(String string){
        int position;
        int length;
        if(string.length() %2 ==0){
            position =string.length() /2-1;
            length =2;
        }else{
            position =string.length()/2;
            length =1;
        }

        return string.substring(position, position +length);
    }


    //Use the indexOf method to find the first space in a string and .substring() to return the first word
    public String getTheFirstWord(String string){

        int firstWordIndex = string.indexOf(" ");
        String firstWord = string.substring(0,firstWordIndex);
        return firstWord;
    }

    //Use the same behavior to find the second word
    public  String getTheSecondWord(String string) {
        int firstSpaceIndex2 = string.indexOf(" ");
        int secondSpaceIndex = string.indexOf(" ", firstSpaceIndex2 + 1);
        String secondWord = string.substring(firstSpaceIndex2 + 1,
                secondSpaceIndex);
        return secondWord;
    }

    //Create a method that uses the above methods to return a string consisting of the second and first word in reversed order
    public String reverseTheTwo(String string){

        String a = getTheFirstWord(string);
        String b = getTheSecondWord(string);
//        System.out.println( b + " " + a);
        return b + " " + a;
    }

}
