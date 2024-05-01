package org.interview.assessment;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import static org.mockito.Mockito.*;

public class ReverseFileTest {

    private ReverseFile reverseFileObj;

    @Before
    public void setUp() {
        reverseFileObj = Mockito.spy(new ReverseFile());
    }

    @Test
    public void reverseFile() throws IOException {
        BufferedReader mockReader = mock(BufferedReader.class);
        BufferedWriter mockWriter = mock(BufferedWriter.class);

        // Setup mock behavior for reader
        when(mockReader.readLine()).thenReturn("hello", "world", null);

        // Call the method under test
        reverseFileObj.reverseFile(mockReader, mockWriter);

        // Verify that the writer received the reversed content
        verify(mockWriter).write("dlrow\nolleh\n");
    }
}