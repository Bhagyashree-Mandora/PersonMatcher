package main.usu.MatcherComponents;

import main.usu.Adult;
import main.usu.Child;
import main.usu.Person;

public abstract class MatchStrategy {

    public abstract boolean apply(Person person1, Person person2);

    protected boolean isSocialSecurityNumberSame(Person person1, Person person2) {
        String ssn1 = person1.getSocialSecurityNumber();
        String ssn2 = person2.getSocialSecurityNumber();
        return (ssn1!=null && ssn2!=null && ssn1.equals(ssn2));
    }

    protected boolean isStateFileNumberSame(Person person1, Person person2) {
        String sfn1 = person1.getStateFileNumber();
        String sfn2 = person2.getStateFileNumber();
        return (sfn1!=null && sfn2!=null && sfn1.equals(sfn2));
    }

    protected boolean isBirthDateSame(Person person1, Person person2) {
        Integer birthDay1 = person1.getBirthDay();
        Integer birthday2 = person2.getBirthDay();
        Integer birthMonth1 = person1.getBirthMonth();
        Integer birthMonth2 = person2.getBirthMonth();
        Integer birthYear1 = person1.getBirthYear();
        Integer birthYear2 = person2.getBirthYear();

        if(birthDay1 !=null && birthday2 !=null && birthDay1.equals(birthday2))
            if(birthMonth1 !=null && birthMonth2 !=null && birthMonth1.equals(birthMonth2))
                if(birthYear1 !=null && birthYear2 !=null && birthYear1.equals(birthYear2))
                    return true;
        return false;
    }

    protected boolean isNameSame(Person person1, Person person2) {
        String firstName1 = person1.getFirstName();
        String firstName2 = person2.getFirstName();
        String middleName1 = person1.getMiddleName();
        String middleName2 = person2.getMiddleName();
        String lastName1 = person1.getLastName();
        String lastName2 = person2.getLastName();

        //Name is same if first name and either of middle and last name is same
        if(firstName1 != null && firstName2 != null && firstName1.equals(firstName2)){
            if(lastName1 != null && lastName2!= null && lastName1.equals(lastName2))
                return true;
         else if(middleName1 != null && middleName2 != null && middleName1.equals(middleName2))
             return true;
        }
        return false;
    }

    protected boolean isNewbornScreeningNumberSame(Person person1, Person person2) {
        Child child1;
        Child child2;

        if(AreChild(person1,person2)) {
            child1 = (Child) person1;
            child2 = (Child) person2;
        }
        else return false;

        String nbsn1 = child1.getNewbornScreeningNumber();
        String nbsn2 = child2.getNewbornScreeningNumber();
        return (nbsn1!=null && nbsn2!=null && nbsn1.equals(nbsn2));
    }

    protected boolean isPhoneNumberSame(Person person1, Person person2) {
        Adult adult1;
        Adult adult2;

        if(AreAdults(person1, person2)) {
            adult1 = (Adult) person1;
            adult2 = (Adult) person2;
        }
        else return false;

        if((adult1.getPhone1() != null && adult2.getPhone1() != null && adult1.getPhone1().equals(adult2.getPhone1()))
                || (adult1.getPhone2() != null && adult2.getPhone2() != null && adult1.getPhone2().equals(adult2.getPhone2()))){
            return true;
        }
        return false;
    }

    protected boolean AreAdults(Person person1, Person person2) {
        return (person1 instanceof Adult && person2 instanceof Adult);
    }

    protected boolean AreChild(Person person1, Person person2) {
        return (person1 instanceof Child && person2 instanceof Child);
    }
}
