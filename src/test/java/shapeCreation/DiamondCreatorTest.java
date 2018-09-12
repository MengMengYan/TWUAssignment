package shapeCreation;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class DiamondCreatorTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private DiamondCreator diamondCreator;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        diamondCreator = new DiamondCreator();
    }

    @Test
    public void testDrawIsoscelesTriangle() {
        diamondCreator.drawIsoscelesTriangle(4);
        assertEquals("   *   \n"
                      + "  ***  \n"
                      + " ***** \n"
                      + "*******\n", outContent.toString());
    }


    @Test
    public void testDrawDiamond() {
        diamondCreator.drawDiamond(2);
        assertEquals("* \n"
                + "***\n"
                + " *", outContent.toString().trim());
    }

    @Test
    public void testDrawDiamondWithName() {
        diamondCreator.drawDiamondWithMyName(3);
        assertEquals("*  \n"
                + " *** \n"
                + "MengMeng\n"
                + " *** \n"
                + "  *", outContent.toString().trim());
    }
}
