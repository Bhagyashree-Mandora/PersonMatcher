package main.usu.MatcherComponents;

import main.usu.Person;

public class MatchBirthDateAndName extends MatchStrategy {

    @Override
    public boolean apply(Person person1, Person person2) {
        if (isBirthDateSame(person1, person2) && isNameSame(person1, person2)) {
            return true;
        }
        else return false;
    }
}
