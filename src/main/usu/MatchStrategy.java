package main.usu;

public abstract class MatchStrategy {

    public abstract boolean apply(Person person1, Person person2);

    public boolean isSocialSecurityNumberSame(Person person1, Person person2) {
        String ssn1 = person1.socialSecurityNumber;
        String ssn2 = person2.socialSecurityNumber;
        return (ssn1!=null && ssn2!=null && ssn1 == ssn2);
    }

    public boolean isStateFileNumberSame(Person person1, Person person2) {
        String sfn1 = person1.stateFileNumber;
        String sfn2 = person2.stateFileNumber;
        return (sfn1!=null && sfn2!=null && sfn1 == sfn2);
    }

    public boolean isBirthDateSame(Person person1, Person person2) {
        Integer birthDay1 = person1.birthDay;
        Integer birthday2 = person2.birthDay;
        Integer birthMonth1 = person1.birthMonth;
        Integer birthMonth2 = person2.birthMonth;
        Integer birthYear1 = person1.birthYear;
        Integer birthYear2 = person2.birthYear;

        if(birthDay1 !=null && birthday2 !=null && birthDay1==birthday2)
            if(birthMonth1 !=null && birthMonth2 !=null && birthMonth1 == birthMonth2)
                if(birthYear1 !=null && birthYear2 !=null && birthYear1 == birthYear2)
                    return true;
        return false;
    }

    public boolean isNameSame(Person person1, Person person2) {
        String firstName1 = person1.firstName;
        String firstName2 = person2.firstName;
        String middleName1 = person1.middleName;
        String middleName2 = person2.middleName;
        String lastName1 = person1.lastName;
        String lastName2 = person2.lastName;

        if(firstName1 != null && firstName2 != null && firstName1==firstName2){
            if(lastName1 != null && lastName2!= null && lastName1== lastName2)
                return true;
         else if(middleName1 != null && middleName2 != null && middleName1== middleName2)
             return true;
        }
        return false;
    }
}
