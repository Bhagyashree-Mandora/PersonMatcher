package main.usu.Writer;

import main.usu.PersonsPair;

import java.io.*;
import java.util.List;

public class FileWriterStrategy implements WriterStrategy {
    private String outputFileName;

    public FileWriterStrategy(String outputFile) {
        outputFileName = outputFile;
    }

    @Override
    public boolean write(List<PersonsPair> matchingPersonsPair) {
        try {
            PrintWriter writer = new PrintWriter(outputFileName, "UTF-8");
            writer.println("Matched pairs:");
            for(PersonsPair personsPair : matchingPersonsPair) {
                writer.println("(" + personsPair.getPerson1().getObjectId() + "," + personsPair.getPerson2().getObjectId() + ")");
            }
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return true;
    }
}