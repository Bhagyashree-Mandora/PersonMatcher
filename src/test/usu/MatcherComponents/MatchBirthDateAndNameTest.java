package usu.MatcherComponents;

import main.usu.Adult;
import main.usu.Child;
import main.usu.MatcherComponents.MatchBirthDateAndName;
import org.junit.Assert;
import org.junit.Test;

public class MatchBirthDateAndNameTest {

    @Test
    public void validWhenBirthDateAndNameIsSame() {
        Adult adult1 = new Adult();
        adult1.setBirthDay(22);
        adult1.setBirthMonth(2);
        adult1.setBirthYear(1991);
        adult1.setFirstName("a");
        adult1.setMiddleName("b");
        adult1.setLastName("c");

        Adult adult2 = new Adult();
        adult2.setBirthDay(22);
        adult2.setBirthMonth(2);
        adult2.setBirthYear(1991);
        adult2.setFirstName("a");
        adult2.setMiddleName("b");
        adult2.setLastName("c");

        MatchBirthDateAndName matchBirthDateAndName = new MatchBirthDateAndName();
        Boolean matched = matchBirthDateAndName.apply(adult1,adult2);

        Assert.assertTrue(matched);
    }

    @Test
    public void invalidWhenBirthDateAndNameAreNotSame() {
        Adult adult1 = new Adult();
        adult1.setBirthDay(8);
        adult1.setBirthMonth(8);
        adult1.setBirthYear(1988);
        adult1.setFirstName("x");
        adult1.setMiddleName("y");
        adult1.setLastName("z");

        Adult adult2 = new Adult();
        adult2.setBirthDay(22);
        adult2.setBirthMonth(2);
        adult2.setBirthYear(1991);
        adult2.setFirstName("a");
        adult2.setMiddleName("b");
        adult2.setLastName("c");

        MatchBirthDateAndName matchBirthDateAndName = new MatchBirthDateAndName();
        Boolean matched = matchBirthDateAndName.apply(adult1,adult2);

        Assert.assertFalse(matched);
    }

    @Test
    public void invalidWhenOnlyBirthDateIsNotSame() {
        Adult adult1 = new Adult();
        adult1.setBirthDay(8);
        adult1.setBirthMonth(8);
        adult1.setBirthYear(1988);
        adult1.setFirstName("a");
        adult1.setMiddleName("b");
        adult1.setLastName("c");

        Adult adult2 = new Adult();
        adult2.setBirthDay(22);
        adult2.setBirthMonth(2);
        adult2.setBirthYear(1991);
        adult2.setFirstName("a");
        adult2.setMiddleName("b");
        adult2.setLastName("c");

        MatchBirthDateAndName matchBirthDateAndName = new MatchBirthDateAndName();
        Boolean matched = matchBirthDateAndName.apply(adult1,adult2);

        Assert.assertFalse(matched);
    }

    @Test
    public void invalidWhenOnlyNameIsNotSame() {
        Adult adult1 = new Adult();
        adult1.setBirthDay(22);
        adult1.setBirthMonth(2);
        adult1.setBirthYear(1991);
        adult1.setFirstName("x");
        adult1.setMiddleName("y");
        adult1.setLastName("z");

        Adult adult2 = new Adult();
        adult2.setBirthDay(22);
        adult2.setBirthMonth(2);
        adult2.setBirthYear(1991);
        adult2.setFirstName("a");
        adult2.setMiddleName("b");
        adult2.setLastName("c");

        MatchBirthDateAndName matchBirthDateAndName = new MatchBirthDateAndName();
        Boolean matched = matchBirthDateAndName.apply(adult1,adult2);

        Assert.assertFalse(matched);
    }

    @Test
    public void validWhenChildBirthDateAndNameIsSame() {
        Child child1 = new Child();
        child1.setBirthDay(22);
        child1.setBirthMonth(2);
        child1.setBirthYear(1991);
        child1.setFirstName("a");
        child1.setMiddleName("b");
        child1.setLastName("c");

        Child child2 = new Child();
        child2.setBirthDay(22);
        child2.setBirthMonth(2);
        child2.setBirthYear(1991);
        child2.setFirstName("a");
        child2.setMiddleName("b");
        child2.setLastName("c");

        MatchBirthDateAndName matchBirthDateAndName = new MatchBirthDateAndName();
        Boolean matched = matchBirthDateAndName.apply(child1,child2);

        Assert.assertTrue(matched);
    }
}
