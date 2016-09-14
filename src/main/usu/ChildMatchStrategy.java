package main.usu;

public class ChildMatchStrategy extends MatchStrategy {

    @Override
    public boolean apply(Person person1, Person person2) {

        Child child1;
        Child child2;

        if(personsAreChild(person1,person2)) {
            child1 = (Child) person1;
            child2 = (Child) person2;
        }
        else return false;

        if(isNewbornScreeningNumberAndNameSame(child1, child2)){
            return true;
        }

        if(isMothersNameAndBirthCountyAndBirthDateSame(child1, child2)){
            return true;
        }
    return false;
    }

    private boolean isNewbornScreeningNumberAndNameSame(Child child1, Child child2) {
        if(isNewbornScreeningNumberSame(child1,child2) && isNameSame(child1,child2))
            return true;
        return false;
    }

    private boolean isMothersNameAndBirthCountyAndBirthDateSame(Child child1, Child child2) {
        if(isMothersNameSame(child1,child2) && isBirthCountySame(child1,child2) && isBirthDateSame(child1,child2))
            return true;
        return false;
    }

    private boolean isNewbornScreeningNumberSame(Child child1, Child child2) {
        String nbsn1 = child1.NewbornScreeningNumber;
        String nbsn2 = child2.NewbornScreeningNumber;
        return (nbsn1!=null && nbsn2!=null && nbsn1 == nbsn2);
    }

    private boolean isBirthCountySame(Child child1, Child child2) {
        if(child1.BirthCounty != null && child2.BirthCounty != null && child1.BirthCounty == child2.BirthCounty)
            return true;
        return false;
    }

    private boolean isMothersNameSame(Child child1, Child child2) {
//        check for Mothers name
        return false;
    }

    private boolean personsAreChild(Person person1, Person person2) {
        if(person1 instanceof Child && person2 instanceof Child)
            return true;
        return false;
    }
}
