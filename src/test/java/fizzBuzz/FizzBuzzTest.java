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

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

}
