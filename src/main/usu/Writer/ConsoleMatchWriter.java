package main.usu.Writer;

import main.usu.PersonsPair;

import java.util.List;

public class ConsoleMatchWriter implements MatchWriter {

    @Override
    public boolean write(List<PersonsPair> matchingPersonsPair) {
            System.out.println("Matched: ");
        for(PersonsPair personsPair : matchingPersonsPair) {
            System.out.println("(" + personsPair.getPerson1().getObjectId() + "," + personsPair.getPerson2().getObjectId() + ")");
            System.out.println(personsPair.getPerson1().toString());
            System.out.println(personsPair.getPerson2().toString());
        }
        return true;
    }
}
