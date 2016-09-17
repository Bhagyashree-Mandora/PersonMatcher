package usu.MatcherComponents;

import main.usu.Child;
import main.usu.MatcherComponents.MatchBirthDateAndName;
import main.usu.MatcherComponents.MatchMothersNameCountyAndBirthDate;
import org.junit.Assert;
import org.junit.Test;

public class MatchMothersNameCountyAndBirthDateTest {
    @Test
    public void validWhenChildBirthDateCountyAndMothersNameIsSame() {
        Child child1 = new Child();
        child1.setBirthDay(22);
        child1.setBirthMonth(2);
        child1.setBirthYear(1991);
        child1.setMotherFirstName("a");
        child1.setMotherMiddleName("b");
        child1.setMotherLastName("c");
        child1.setBirthCounty("Logan");

        Child child2 = new Child();
        child2.setBirthDay(22);
        child2.setBirthMonth(2);
        child2.setBirthYear(1991);
        child2.setMotherFirstName("a");
        child2.setMotherMiddleName("b");
        child2.setMotherLastName("c");
        child2.setBirthCounty("Logan");

        MatchMothersNameCountyAndBirthDate matchMothersNameCountyAndBirthDate = new MatchMothersNameCountyAndBirthDate();
        Boolean matched = matchMothersNameCountyAndBirthDate.apply(child1,child2);

        Assert.assertTrue(matched);
    }

    @Test
    public void invalidWhenChildBirthDateNotSame() {
        Child child1 = new Child();
        child1.setBirthDay(22);
        child1.setBirthMonth(2);
        child1.setBirthYear(1991);
        child1.setMotherFirstName("a");
        child1.setMotherMiddleName("b");
        child1.setMotherLastName("c");
        child1.setBirthCounty("Logan");

        Child child2 = new Child();
        child2.setBirthDay(8);
        child2.setBirthMonth(8);
        child2.setBirthYear(1988);
        child2.setMotherFirstName("a");
        child2.setMotherMiddleName("b");
        child2.setMotherLastName("c");
        child2.setBirthCounty("Logan");

        MatchMothersNameCountyAndBirthDate matchMothersNameCountyAndBirthDate = new MatchMothersNameCountyAndBirthDate();
        Boolean matched = matchMothersNameCountyAndBirthDate.apply(child1,child2);

        Assert.assertFalse(matched);
    }

    @Test
    public void invalidWhenChildBirthCountyNotSame() {
        Child child1 = new Child();
        child1.setBirthDay(22);
        child1.setBirthMonth(2);
        child1.setBirthYear(1991);
        child1.setMotherFirstName("a");
        child1.setMotherMiddleName("b");
        child1.setMotherLastName("c");
        child1.setBirthCounty("Logan");

        Child child2 = new Child();
        child2.setBirthDay(22);
        child2.setBirthMonth(2);
        child2.setBirthYear(1991);
        child2.setMotherFirstName("a");
        child2.setMotherMiddleName("b");
        child2.setMotherLastName("c");
        child2.setBirthCounty("Utah");

        MatchMothersNameCountyAndBirthDate matchMothersNameCountyAndBirthDate = new MatchMothersNameCountyAndBirthDate();
        Boolean matched = matchMothersNameCountyAndBirthDate.apply(child1,child2);

        Assert.assertFalse(matched);
    }

    @Test
    public void invalidWhenChildMothersNameIsNotSame() {
        Child child1 = new Child();
        child1.setBirthDay(22);
        child1.setBirthMonth(2);
        child1.setBirthYear(1991);
        child1.setMotherFirstName("a");
        child1.setMotherMiddleName("b");
        child1.setMotherLastName("c");
        child1.setBirthCounty("Logan");

        Child child2 = new Child();
        child2.setBirthDay(22);
        child2.setBirthMonth(2);
        child2.setBirthYear(1991);
        child2.setMotherFirstName("x");
        child2.setMotherMiddleName("y");
        child2.setMotherLastName("z");
        child2.setBirthCounty("Logan");

        MatchMothersNameCountyAndBirthDate matchMothersNameCountyAndBirthDate = new MatchMothersNameCountyAndBirthDate();
        Boolean matched = matchMothersNameCountyAndBirthDate.apply(child1,child2);

        Assert.assertFalse(matched);
    }
}
