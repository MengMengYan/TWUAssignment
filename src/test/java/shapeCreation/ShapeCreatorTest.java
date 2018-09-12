package shapeCreation;

import org.junit.Before;
import org.junit.Test;
import primeFactor.PrimeFactorCalculator;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ShapeCreatorTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testPrintAsterisk() {
        ShapeCreator shapeCreator = new ShapeCreator();
        shapeCreator.printAsterisk();
        assertEquals("*", outContent.toString().trim());
    }


    @Test
    public void testPrintLineOfAsterisk() {
        ShapeCreator shapeCreator = new ShapeCreator();
        shapeCreator.printLineOfAsterisks(7);
        assertEquals("*******", outContent.toString().trim());
    }
}
