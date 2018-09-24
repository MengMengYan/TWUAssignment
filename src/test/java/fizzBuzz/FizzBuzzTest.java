package fizzBuzz;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class FizzBuzzTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void test1(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.decideFizzBuzz(1));
    }

    @Test
    public void test2(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.decideFizzBuzz(2));
    }

    @Test
    public void test3(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.decideFizzBuzz(3));
    }

    @Test
    public void test6() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.decideFizzBuzz(6));
    }

    @Test
    public void test5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.decideFizzBuzz(5));
    }

    @Test
    public void test10() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.decideFizzBuzz(10));
    }

    @Test
    public void test15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.decideFizzBuzz(15));
    }

    @Test
    public void test30() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.decideFizzBuzz(30));
    }

    @Test
    public void test1to100() {
        new FizzBuzz();
        assertEquals("1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz\n" +
                "16\n" +
                "17\n" +
                "Fizz\n" +
                "19\n" +
                "Buzz\n" +
                "Fizz\n" +
                "22\n" +
                "23\n" +
                "Fizz\n" +
                "Buzz\n" +
                "26\n" +
                "Fizz\n" +
                "28\n" +
                "29\n" +
                "FizzBuzz\n" +
                "31\n" +
                "32\n" +
                "Fizz\n" +
                "34\n" +
                "Buzz\n" +
                "Fizz\n" +
                "37\n" +
                "38\n" +
                "Fizz\n" +
                "Buzz\n" +
                "41\n" +
                "Fizz\n" +
                "43\n" +
                "44\n" +
                "FizzBuzz\n" +
                "46\n" +
                "47\n" +
                "Fizz\n" +
                "49\n" +
                "Buzz\n" +
                "Fizz\n" +
                "52\n" +
                "53\n" +
                "Fizz\n" +
                "Buzz\n" +
                "56\n" +
                "Fizz\n" +
                "58\n" +
                "59\n" +
                "FizzBuzz\n" +
                "61\n" +
                "62\n" +
                "Fizz\n" +
                "64\n" +
                "Buzz\n" +
                "Fizz\n" +
                "67\n" +
                "68\n" +
                "Fizz\n" +
                "Buzz\n" +
                "71\n" +
                "Fizz\n" +
                "73\n" +
                "74\n" +
                "FizzBuzz\n" +
                "76\n" +
                "77\n" +
                "Fizz\n" +
                "79\n" +
                "Buzz\n" +
                "Fizz\n" +
                "82\n" +
                "83\n" +
                "Fizz\n" +
                "Buzz\n" +
                "86\n" +
                "Fizz\n" +
                "88\n" +
                "89\n" +
                "FizzBuzz\n" +
                "91\n" +
                "92\n" +
                "Fizz\n" +
                "94\n" +
                "Buzz\n" +
                "Fizz\n" +
                "97\n" +
                "98\n" +
                "Fizz\n" +
                "Buzz", outContent.toString().trim());
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

}
