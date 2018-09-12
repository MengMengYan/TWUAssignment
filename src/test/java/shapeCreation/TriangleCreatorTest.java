package shapeCreation;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class TriangleCreatorTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private TriangleCreator triangleCreator;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        triangleCreator = new TriangleCreator();
    }

    @Test
    public void testDrawHorizontalLineTest() {

        triangleCreator.drawHorizontalLine(4);
        assertEquals("****", outContent.toString().trim());
    }


    @Test
    public void testDrawVerticalLineTest() {
        triangleCreator.drawVerticalLine(5);
        assertEquals("*\n*\n*\n*\n*", outContent.toString().trim());
    }

    @Test
    public void testDrawRightTriangle() {
        triangleCreator.drawRightTriangle(3);
        assertEquals("*\n**\n***", outContent.toString().trim());
    }
}
