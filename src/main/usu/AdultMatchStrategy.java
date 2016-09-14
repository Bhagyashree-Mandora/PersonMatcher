package main.usu;

public class AdultMatchStrategy extends MatchStrategy {
    @Override
    public boolean apply(Person person1, Person person2) {

        Adult adult1;
        Adult adult2;

        if(personsAreAdults(person1, person2)) {
            adult1 = (Adult) person1;
            adult2 = (Adult) person2;
        }
        else return false;

        if(isPhoneNumberAndAnyUniqueIdSame(adult1, adult2)) {
            return true;
        }

        if(isPhoneNumberAndBirthDateSame(adult1, adult2)) {
            return true;
        }
        return false;
    }

    private boolean isPhoneNumberAndAnyUniqueIdSame(Adult adult1, Adult adult2) {
        if(isPhoneNumberSame(adult1, adult2) && (isStateFileNumberSame(adult1, adult2) || isSocialSecurityNumberSame(adult1, adult2)))
            return true;
        return false;
    }

    private boolean isPhoneNumberAndBirthDateSame(Adult adult1, Adult adult2) {
        if(isPhoneNumberSame(adult1, adult2) && isBirthDateSame(adult1, adult2))
            return true;
        return false;
    }

    private boolean isPhoneNumberSame(Adult adult1, Adult adult2) {
        if(adult1.phone1 == adult2.phone2 || adult1.phone1 == adult2.phone2)
            return true;
        return false;
    }

    private boolean personsAreAdults(Person person1, Person person2) {
        if(person1 instanceof Adult && person2 instanceof Adult)
            return true;
        return false;
    }
}
