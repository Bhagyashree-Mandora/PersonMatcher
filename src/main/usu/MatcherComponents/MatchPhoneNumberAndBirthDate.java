package main.usu.MatcherComponents;

import main.usu.Person;

public class MatchPhoneNumberAndBirthDate extends MatchStrategy {
    @Override
    public boolean apply(Person person1, Person person2) {
        if(isPhoneNumberSame(person1, person2) && isBirthDateSame(person1,person2)) {
            return true;
        }
        else return false;
    }
}
