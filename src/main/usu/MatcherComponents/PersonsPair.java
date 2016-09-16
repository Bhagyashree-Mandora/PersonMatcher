package main.usu.MatcherComponents;

import main.usu.Person;

public class PersonsPair {
    Person person1;
    Person person2;

    public PersonsPair(Person p1, Person p2) {
        person1 = p1;
        person2 = p2;
    }

    public Person getPerson1() {
        return person1;
    }

    public Person getPerson2() {
        return person2;
    }
}
