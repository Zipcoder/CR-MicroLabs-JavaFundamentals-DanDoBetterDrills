package PrimativeTypes;

/**
 * Created by dan on 6/14/17.
 */
public class PrimativeTypes {

    //Add two ints and return the answer
    public int addInt(int x, int y){
        int sum = x + y;
        return sum;
    }

    //Add two long's and return the answer
    public long add(long x, long y){
        long sum = x + y;
        return sum;
    }

    //Add two short's and return the answer Must Type Cast
    public short addShort(int x, int y){
        int sum = (short) (x + y);
        return (short) sum;
    }

    //Add two bytes and return the answer, Must Type Cast
    public byte addByte(int x, int y){
        int sum = (byte) (x + y);
        return (byte) sum;
    }

    //Add two floats and return the answer
    public float add(double x, double y){
        double sum = x +y;
        return (float) sum;
    }

    //Add two doubles and return the answer
    public double add1(double x, double y){
        double sum = x + y;
        return sum;
    }

//    //Subtract two ints and return the answer
//    public int subtract(int x, int y){
//        int answer = x - y;
//        return answer;
//    }

    //Subtract two long's and return the answer
    public long subtract(long x, long y){
        long answer = x - y;
        return answer;
    }

    //Subtract two short's and return the answer Must Type Cast
    public short subtract(int x, int y){
        int answer = (short) (x - y);
        return (short) answer;
    }

    //Subtract two bytes and return the answer, Must Type Cast
    public byte subtract(byte x, byte y){
        int answer = (byte) (x - y);
        return (byte) answer;
    }

    //Subtract two floats and return the answer
    public float subtract(float x, float y){
        int answer = (int) (x - y);
        return (float) answer;
    }

    //Subtract two doubles and return the answer
    public double subtract(double x, double y){
        double answer = x - y;
        return answer;
    }

    //Divide two ints and return the answer
    public int divide(int x, int y){
        int answer = x / y;
        return answer;
    }

    //Divide two long's and return the answer
    public long divide(long x, long y){
        long answer = x / y;
        return answer;
    }

    //Divide two short's and return the answer Must Type Cast
    public short divide(short x, short y){
        int answer = (short) x / y;
        return (short) answer;
    }
    //Divide two bytes and return the answer, Must Type Cast
    public byte divide(byte x, byte y){
        int answer = (byte) x / y;
        return (byte) answer;
    }

    //Divide two floats and return the answer
    public float divide(float x, float y){
        float answer = x / y;
        return answer;
    }

    //Divide two doubles and return the answer
    public double divide(double x, double y){
        double answer = x / y;
        return answer;
    }

    //Multiply two ints and return the answer
    public int multiply(int x, int y){
        int answer = x * y;
        return answer;
    }

    //Multiply two long's and return the answer
    public long multiply(long x, long y){
        long answer = x * y;
        return answer;
    }

    //Multiply two short's and return the answer Must Type Cast
    public short multiply(short x, short y){
        int answer = (short) x * y;
        return (short) answer;
    }
    //Multiply two bytes and return the answer, Must Type Cast
    public byte multiply(byte x, byte y){
        int answer = (byte) x * y;
        return (byte) answer;
    }

    //Multiply two floats and return the answer
    public float multiply(float x, float y){
        float answer = (int) x * y;
        return (int) answer;
    }

    //Multiply two doubles and return the answer
    public double multiply(double x, double y){
        double answer = (int) x * y;
        return (int) answer;
    }

    //Return true
    public boolean returnTrue(){
        return true;
    }

    //Return false
    public boolean returnFalse(){
        return false;
    }

}
