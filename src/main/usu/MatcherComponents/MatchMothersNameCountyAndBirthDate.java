package main.usu.MatcherComponents;

import main.usu.Child;
import main.usu.Person;

public class MatchMothersNameCountyAndBirthDate extends MatchStrategy {

    @Override
    public boolean apply(Person person1, Person person2) {
        if(isMothersNameSame(person1,person2) && isBirthCountySame(person1,person2) && isBirthDateSame(person1,person2)) {
            return true;
        }
        else return false;
    }

    private boolean isBirthCountySame(Person person1, Person person2) {
        Child child1;
        Child child2;

        if(AreChild(person1,person2)) {
            child1 = (Child) person1;
            child2 = (Child) person2;
        }
        else return false;

        if(child1.getBirthCounty() != null && child2.getBirthCounty() != null && child1.getBirthCounty().equals(child2.getBirthCounty())) {
            return true;
        }
        return false;
    }

    private boolean isMothersNameSame(Person person1, Person person2) {
        Child child1;
        Child child2;

        if(AreChild(person1,person2)) {
            child1 = (Child) person1;
            child2 = (Child) person2;
        }
        else return false;

        String mothersFirstName1 = child1.getMotherFirstName();
        String mothersFirstName2 = child2.getMotherFirstName();
        String mothersMiddleName1 = child1.getMotherMiddleName();
        String mothersMiddleName2 = child2.getMotherMiddleName();
        String mothersLastName1 = child1.getMotherLastName();
        String mothersLastName2 = child2.getMotherLastName();

        if(mothersFirstName1 != null && mothersFirstName2 != null && mothersFirstName1.equals(mothersFirstName2)) {
            if (mothersMiddleName1 != null && mothersMiddleName2 != null && mothersMiddleName1.equals(mothersMiddleName2)) {
                if (mothersLastName1 != null && mothersLastName2 != null && mothersLastName1.equals(mothersLastName2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
