package primeFactor;
import static org.junit.Assert.assertEquals;

import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class PrimeFactorCalculatorTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testPrimeFactorCalculator() {
        PrimeFactorCalculator primeFactorCalculator = new PrimeFactorCalculator();
        primeFactorCalculator.generate(315);
        assertEquals("3,5,7", outContent.toString().trim());
    }

    @Test
    public void testPrimeFactorCalculatorMarginCase() {
        PrimeFactorCalculator primeFactorCalculator = new PrimeFactorCalculator();
        primeFactorCalculator.generate(2);
        assertEquals("2", outContent.toString().trim());
    }

    @Test
    public void testPrimeFactorCalculatorPrimeNumber() {
        PrimeFactorCalculator primeFactorCalculator = new PrimeFactorCalculator();
        primeFactorCalculator.generate(7);
        assertEquals("7", outContent.toString().trim());
    }

    @Test
    public void testPrimeFactorCalculatorNoPrimeFactors() {
        PrimeFactorCalculator primeFactorCalculator = new PrimeFactorCalculator();
        primeFactorCalculator.generate(1);
        assertEquals("", outContent.toString().trim());
    }

}