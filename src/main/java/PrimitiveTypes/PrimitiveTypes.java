package PrimitiveTypes;

///**
// * Created by dan on 6/14/17.
// */
public class PrimitiveTypes {

    public int add(int x, int y) {
        return x + y;
    }


    public long add(long x, long y) {
        return x + y;
    }

    //Add two short's and return the answer Must Type Cast
    public short add(short a, short b) {
        int total = a + b;
        return (short) total;
    }
//possible lossy conversion from int to short


    // Add two bytes and return the answer, Must Type Cast
    public byte add(byte x, byte y) {
        int total = x + y;
        return (byte) total;
    }

    //    //Add two floats and return the answer
    public float addFloat(float x, float y) {
        float total = x + y;
        return total;
    }

    //Add two doubles and return the answer
    public double addDouble(double x, double y) {
    return x +y;
    }




    public int subtractInt(int x, int y){
        return x-y;
    }


    public long subtractLong(long x, long y){

        return x-y;
    }

    //Subtract two short's and return the answer Must Type Cast
    //int takes 4 bytes of memory and short takes 2 bytes of memory.
    public short subtractShort(short x, short y){
        short product = (short) (x - y);
        return product;
    }


//    Subtract two bytes and return the answer, Must Type Cast
    public byte subtract(byte x, byte y){
        byte product = (byte) (x - y);
        return product;
    }

    //Subtract two floats and return the answer
    public float subtract(float x, float y){
          return x - y;
    }

    //Subtract two doubles and return the answer
    public double subtract(double x, double y){
        return x - y;
    }

    //Divide two ints and return the answer
    public int divide(int x, int y){
        return x / y;
    }

    //Divide two long's and return the answer
    public long divide(long x, long y){
        return x / y;
    }

    //Divide two short's and return the answer Must Type Cast
    public short divide(short x, short y){
        short div = (short) (x/y);
        return div;
    }
    //Divide two bytes and return the answer, Must Type Cast
    public byte divide(byte x, byte y){
        byte divv = (byte) (x/y);
        return divv;
    }

    //Divide two floats and return the answer
    public float divide(float x, float y){
        return x / y;
    }

    //Divide two doubles and return the answer
    public double divide(double x, double y){
        return x / y;
    }

    //Multiply two ints and return the answer
    public int multiply(int x, int y){
        return x * y;
    }

    //Multiply two long's and return the answer
    public long multiply(long x, long y){
        return x * y;
    }

    //Multiply two short's and return the answer Must Type Cast
    public short multiply(short x, short y){
        short prod = (short) (x * y);
        return prod;
    }
    //Multiply two bytes and return the answer, Must Type Cast
    public byte multiply(byte x, byte y){
        byte prod = (byte) (x * y);
        return prod;
    }

    //Multiply two floats and return the answer
    public float multiply(float x, float y){
        return x * y;
    }

    //Multiply two doubles and return the answer
    public double multiply(double x, double y){
        return x * y;
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
