package org.interview.assessment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class ReverseFile {

    public void reverseFile(BufferedReader reader, BufferedWriter writer) throws IOException {
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        writer.write(content.reverse().toString());
    }

}
