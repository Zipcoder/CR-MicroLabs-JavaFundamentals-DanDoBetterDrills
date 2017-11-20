package HelloWorld;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by dan on 6/14/17.
 */

//public class HelloWorldTest{
//
//    HelloWorld helloWorld;
//
//
//    @Before
//
//
//    public void initialize(){
//        helloWorld = new HelloWorld();
//
//    }
//
//    @Test
//    public void HelloWorldTest(){
//        String Expected = "Hello World!";
//        System.out.println(Expected);
//
//        String Actual = this.helloWorld.sayHelloWorld();
//        System.out.println(Actual);
//
//
//
//        assertEquals(Expected, Actual);
//    }
//
//
//}

// @Before
// Execute before each test method.
// Used with non-static method.
// For example, to reinitialize some
// class attributes used by the methods

public class HelloWorldTest{
    @Test
    public void sayHelloWorldTest(){
        HelloWorld helloworld = new HelloWorld();
        String expected = "Hello World!";
        String actual = helloworld.sayHelloWorld();
        assertEquals(expected, actual);
    }
}













