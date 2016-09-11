package main.usu;

public class Matcher {

    public Boolean match(Person person1, Person person2) {
        if(person1._socialSecurityNumber == person2._socialSecurityNumber)
                if(isBirthDateSame(person1, person2))
                    return true;
        return false;
    }

    private boolean isBirthDateSame(Person person1, Person person2) {
        return person1._birthDay == person2._birthDay && person1._birthMonth == person2._birthMonth && person1._birthYear == person2._birthYear;
    }
}
