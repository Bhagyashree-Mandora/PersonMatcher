package main.usu.Writer;

import main.usu.MatcherComponents.PersonsPair;

import java.util.List;

public class ConsoleMatchWriter implements MatchWriter {

    @Override
    public boolean write(List<PersonsPair> matchingPersonsPair) {
        for(PersonsPair personsPair : matchingPersonsPair) {
            System.out.println("Matched: ");
            System.out.println(personsPair.getPerson1().toString());
            System.out.println(personsPair.getPerson2().toString());
        }
        return true;
    }
}
