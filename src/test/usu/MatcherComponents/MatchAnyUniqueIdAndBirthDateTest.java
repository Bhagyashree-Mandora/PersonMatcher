package usu.MatcherComponents;

import main.usu.Adult;
import main.usu.Child;
import main.usu.MatcherComponents.MatchAnyUniqueIdAndBirthDate;
import org.junit.Assert;
import org.junit.Test;

public class MatchAnyUniqueIdAndBirthDateTest {

    @Test
    public void validWhenBirthDateAndAllIdAreSame() {
        Adult adult1 = new Adult();
        adult1.setBirthDay(22);
        adult1.setBirthMonth(2);
        adult1.setBirthYear(1991);
        adult1.setSocialSecurityNumber("A123");
        adult1.setStateFileNumber("Z123");

        Adult adult2 = new Adult();
        adult2.setBirthDay(22);
        adult2.setBirthMonth(2);
        adult2.setBirthYear(1991);
        adult2.setSocialSecurityNumber("A123");
        adult2.setStateFileNumber("Z123");

        MatchAnyUniqueIdAndBirthDate matchAnyUniqueIdAndBirthDate = new MatchAnyUniqueIdAndBirthDate();
        Boolean matched = matchAnyUniqueIdAndBirthDate.apply(adult1,adult2);

        Assert.assertTrue(matched);
    }

    @Test
    public void validWhenBirthDateAndOneIdAreSame() {
        Adult adult1 = new Adult();
        adult1.setBirthDay(22);
        adult1.setBirthMonth(2);
        adult1.setBirthYear(1991);
        adult1.setSocialSecurityNumber("A123");
        adult1.setStateFileNumber("");

        Adult adult2 = new Adult();
        adult2.setBirthDay(22);
        adult2.setBirthMonth(2);
        adult2.setBirthYear(1991);
        adult2.setSocialSecurityNumber("A123");
        adult2.setStateFileNumber("Z123");

        MatchAnyUniqueIdAndBirthDate matchAnyUniqueIdAndBirthDate = new MatchAnyUniqueIdAndBirthDate();
        Boolean matched = matchAnyUniqueIdAndBirthDate.apply(adult1,adult2);

        Assert.assertTrue(matched);
    }

    @Test
    public void validWhenBirthDateAndOtherIdAreSame() {
        Adult adult1 = new Adult();
        adult1.setBirthDay(22);
        adult1.setBirthMonth(2);
        adult1.setBirthYear(1991);
        adult1.setSocialSecurityNumber("A");
        adult1.setStateFileNumber("Z123");

        Adult adult2 = new Adult();
        adult2.setBirthDay(22);
        adult2.setBirthMonth(2);
        adult2.setBirthYear(1991);
        adult2.setSocialSecurityNumber("A123");
        adult2.setStateFileNumber("Z123");

        MatchAnyUniqueIdAndBirthDate matchAnyUniqueIdAndBirthDate = new MatchAnyUniqueIdAndBirthDate();
        Boolean matched = matchAnyUniqueIdAndBirthDate.apply(adult1,adult2);

        Assert.assertTrue(matched);
    }

    @Test
    public void invalidWhenBirthDateAreNotSame() {
        Adult adult1 = new Adult();
        adult1.setBirthDay(22);
        adult1.setBirthMonth(2);
        adult1.setBirthYear(1991);
        adult1.setSocialSecurityNumber("A123");
        adult1.setStateFileNumber("Z123");

        Adult adult2 = new Adult();
        adult2.setBirthDay(8);
        adult2.setBirthMonth(8);
        adult2.setBirthYear(1988);
        adult2.setSocialSecurityNumber("A123");
        adult2.setStateFileNumber("Z123");

        MatchAnyUniqueIdAndBirthDate matchAnyUniqueIdAndBirthDate = new MatchAnyUniqueIdAndBirthDate();
        Boolean matched = matchAnyUniqueIdAndBirthDate.apply(adult1,adult2);

        Assert.assertFalse(matched);
    }

    @Test
    public void invalidWhenBothIdAreNotSame() {
        Adult adult1 = new Adult();
        adult1.setBirthDay(22);
        adult1.setBirthMonth(2);
        adult1.setBirthYear(1991);
        adult1.setSocialSecurityNumber("A");
        adult1.setStateFileNumber("");

        Adult adult2 = new Adult();
        adult2.setBirthDay(22);
        adult2.setBirthMonth(2);
        adult2.setBirthYear(1991);
        adult2.setSocialSecurityNumber("A123");
        adult2.setStateFileNumber("Z123");

        MatchAnyUniqueIdAndBirthDate matchAnyUniqueIdAndBirthDate = new MatchAnyUniqueIdAndBirthDate();
        Boolean matched = matchAnyUniqueIdAndBirthDate.apply(adult1,adult2);

        Assert.assertFalse(matched);
    }

    @Test
    public void validWhenChildBirthDateAndNewBornNumberIsSame() {
        Child child1 = new Child();
        child1.setBirthDay(22);
        child1.setBirthMonth(2);
        child1.setBirthYear(1991);
        child1.setNewbornScreeningNumber("A123");

        Child child2 = new Child();
        child2.setBirthDay(22);
        child2.setBirthMonth(2);
        child2.setBirthYear(1991);
        child2.setNewbornScreeningNumber("A123");

        MatchAnyUniqueIdAndBirthDate matchAnyUniqueIdAndBirthDate = new MatchAnyUniqueIdAndBirthDate();
        Boolean matched = matchAnyUniqueIdAndBirthDate.apply(child1,child2);

        Assert.assertTrue(matched);
    }
}
