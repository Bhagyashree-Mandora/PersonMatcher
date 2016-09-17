package main.usu.Writer;

import main.usu.PersonsPair;

import java.util.List;

public class ConsoleWriterStrategy implements WriterStrategy {

    @Override
    public boolean write(List<PersonsPair> matchingPersonsPair) {
            System.out.println("Matched: ");
        for(PersonsPair personsPair : matchingPersonsPair) {
            System.out.println("(" + personsPair.getPerson1().getObjectId() + "," + personsPair.getPerson2().getObjectId() + ")");
        }
        return true;
    }
}
