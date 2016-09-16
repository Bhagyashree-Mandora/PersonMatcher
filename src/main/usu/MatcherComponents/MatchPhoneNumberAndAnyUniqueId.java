package main.usu.MatcherComponents;

import main.usu.Person;

public class MatchPhoneNumberAndAnyUniqueId extends MatchStrategy {

    @Override
    public boolean apply(Person person1, Person person2) {
        if(isPhoneNumberSame(person1, person2) && (isStateFileNumberSame(person1, person2)
                || isSocialSecurityNumberSame(person1, person2) || isNewbornScreeningNumberSame(person1,person2))) {
            return true;
        }
        else return false;
    }
}
