package main.usu;

import java.util.List;

public class Matcher {

    public Boolean match(List<Person> personList) {

        for (int i = 0; i < personList.size()-1; i++) {
            Person person1 = personList.get(i);
            for (int j = i+1; j < personList.size(); j++){
                Person person2 = personList.get(j);

                if(isSsnAndBirthDateSame(person1, person2)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isSsnAndBirthDateSame(Person person1, Person person2) {
        if(isSsnSame(person1,person2) && isBirthDateSame(person1,person2))
            return true;
        else
            return false;
    }

    private boolean isSsnSame(Person person1, Person person2) {
        String ssn1 = person1.socialSecurityNumber;
        String ssn2 = person2.socialSecurityNumber;
        return (ssn1!=null && ssn2!=null && ssn1 == ssn2);
    }

    private boolean isBirthDateSame(Person person1, Person person2) {
        int birthDay1 = person1.birthDay;
        int birthday2 = person2.birthDay;
        int birthMonth1 = person1.birthMonth;
        int birthMonth2 = person2.birthMonth;
        int birthYear1 = person1.birthYear;
        int birthYear2 = person2.birthYear;

        if(birthDay1 != 0 && birthday2!=0 && birthDay1==birthday2)
            if(birthMonth1 != 0 && birthMonth2 != 0 && birthMonth1 == birthMonth2)
                if(birthYear1 != 0 && birthYear2 !=0 && birthYear1 == birthYear2)
                    return true;
        return false;
    }
}
