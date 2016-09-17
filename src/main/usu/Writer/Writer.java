package main.usu.Writer;

import main.usu.PersonsPair;

import java.util.ArrayList;
import java.util.List;

public class Writer {

    public static final String OUTPUT_FILE = "outputFile";

    private List<WriterStrategy> writerStrategies = new ArrayList<>();

    public Writer() {
        writerStrategies.add(new FileWriterStrategy(OUTPUT_FILE));
        writerStrategies.add(new ConsoleWriterStrategy());
    }

    public void write(List<PersonsPair> matchedPersons) {
        for (WriterStrategy writerStrategy : writerStrategies) {
            writerStrategy.write(matchedPersons);
        }
    }
}
