package main.usu;

public class AdultAndChildMatchStrategy extends MatchStrategy {


    @Override
    public boolean apply(Person person1, Person person2) {

        if (isAnyUniqueIdAndBirthDateSame(person1, person2)) {
            return true;
        }

        if (isBirthDateAndNameSame(person1, person2)) {
            return true;
        }
        return false;
    }

    private boolean isAnyUniqueIdAndBirthDateSame(Person person1, Person person2) {
        if((isSocialSecurityNumberSame(person1,person2) || isStateFileNumberSame(person1,person2)) && isBirthDateSame(person1,person2))
            return true;
        return false;
        }

    private boolean isBirthDateAndNameSame(Person person1, Person person2) {
        if(isBirthDateSame(person1,person2) && isNameSame(person1,person2))
            return true;
        return false;
    }
}