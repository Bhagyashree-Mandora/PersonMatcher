package main.usu;

import java.io.*;

public class FileMatchWriter implements MatchWriter {
    String outputFileName;

    public FileMatchWriter(String outputFile) {
        outputFileName = outputFile;
    }

    @Override
    public boolean write(Boolean isMatching) {
        try {
            PrintWriter writer = new PrintWriter(outputFileName, "UTF-8");
            writer.println(isMatching);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return true;
    }
}