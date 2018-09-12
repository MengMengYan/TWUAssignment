package inputManager;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class InputRetrieverTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testGetStringInput() {
        InputRetriever retriever = new InputRetriever();
        System.setIn(new ByteArrayInputStream("Test".getBytes()));
        assertEquals("Test", retriever.getStringInput());
    }

    @Test
    public void testGetIntegerInput() {
        InputRetriever retriever = new InputRetriever();
        System.setIn(new ByteArrayInputStream("3".getBytes()));
        assertEquals(3, retriever.getIntInput());
    }
}
