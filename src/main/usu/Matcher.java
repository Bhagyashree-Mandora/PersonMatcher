package main.usu;

import main.usu.MatcherComponents.MatchStrategiesList;
import main.usu.MatcherComponents.MatchStrategy;
import main.usu.MatcherComponents.PersonsPair;

import java.util.ArrayList;
import java.util.List;

public class Matcher {
    List<MatchStrategy> matchStrategies;

    public Matcher() {
        matchStrategies = new MatchStrategiesList().create();
    }

    public List match(List<Person> personList) {
        Boolean matched;
        Person person1;
        Person person2;
        List<PersonsPair> matchedPersons = new ArrayList<>();

        for (int i = 0; i < personList.size() - 1; i++) {
            person1 = personList.get(i);
            for (int j = i + 1; j < personList.size(); j++) {
                person2 = personList.get(j);
                System.out.println("person1: " + person1.getObjectId());
                System.out.println("person2: " + person2.getObjectId());
                for (MatchStrategy matchStrategy : matchStrategies) {
                    matched = matchStrategy.apply(person1,person2);
                    System.out.println("variable matched: " + matched);
                    if(matched){
                        System.out.println("matched");
                        PersonsPair personsPair = new PersonsPair(person1,person2);
                        matchedPersons.add(personsPair);
                        break;
                    }
                }
            }
        }
        return matchedPersons;
    }
}