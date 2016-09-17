package usu.MatcherComponents;

import main.usu.Adult;
import main.usu.MatcherComponents.MatchPhoneNumberAndBirthDate;
import org.junit.Assert;
import org.junit.Test;

public class MatchPhoneNumberAndBirthDateTest {

    @Test
    public void validWhenBirthDateAndOnePhoneIsSame() {
        Adult adult1 = new Adult();
        adult1.setBirthDay(22);
        adult1.setBirthMonth(2);
        adult1.setBirthYear(1991);
        adult1.setPhone1("12345");

        Adult adult2 = new Adult();
        adult2.setBirthDay(22);
        adult2.setBirthMonth(2);
        adult2.setBirthYear(1991);
        adult2.setPhone1("12345");

        MatchPhoneNumberAndBirthDate matchPhoneNumberAndBirthDate = new MatchPhoneNumberAndBirthDate();
        Boolean matched = matchPhoneNumberAndBirthDate.apply(adult1,adult2);

        Assert.assertTrue(matched);
    }

    @Test
    public void validWhenBirthDateAndOtherPhoneIsSame() {
        Adult adult1 = new Adult();
        adult1.setBirthDay(22);
        adult1.setBirthMonth(2);
        adult1.setBirthYear(1991);
        adult1.setPhone2("12345");

        Adult adult2 = new Adult();
        adult2.setBirthDay(22);
        adult2.setBirthMonth(2);
        adult2.setBirthYear(1991);
        adult2.setPhone2("12345");

        MatchPhoneNumberAndBirthDate matchPhoneNumberAndBirthDate = new MatchPhoneNumberAndBirthDate();
        Boolean matched = matchPhoneNumberAndBirthDate.apply(adult1,adult2);

        Assert.assertTrue(matched);
    }

    @Test
    public void validWhenBirthDateAndEitherOnePhoneIsSame() {
        Adult adult1 = new Adult();
        adult1.setBirthDay(22);
        adult1.setBirthMonth(2);
        adult1.setBirthYear(1991);
        adult1.setPhone1("12");
        adult1.setPhone2("12345");

        Adult adult2 = new Adult();
        adult2.setBirthDay(22);
        adult2.setBirthMonth(2);
        adult2.setBirthYear(1991);
        adult2.setPhone1("123");
        adult2.setPhone2("12345");

        MatchPhoneNumberAndBirthDate matchPhoneNumberAndBirthDate = new MatchPhoneNumberAndBirthDate();
        Boolean matched = matchPhoneNumberAndBirthDate.apply(adult1,adult2);

        Assert.assertTrue(matched);
    }

    @Test
    public void invalidWhenOnlyPhoneIsNotSame() {
        Adult adult1 = new Adult();
        adult1.setBirthDay(22);
        adult1.setBirthMonth(2);
        adult1.setBirthYear(1991);
        adult1.setPhone1("12345");

        Adult adult2 = new Adult();
        adult2.setBirthDay(22);
        adult2.setBirthMonth(2);
        adult2.setBirthYear(1991);
        adult2.setPhone1("1");

        MatchPhoneNumberAndBirthDate matchPhoneNumberAndBirthDate = new MatchPhoneNumberAndBirthDate();
        Boolean matched = matchPhoneNumberAndBirthDate.apply(adult1,adult2);

        Assert.assertFalse(matched);
    }

    @Test
    public void invalidWhenOnlyBirthDateIsNotSame() {
        Adult adult1 = new Adult();
        adult1.setBirthDay(8);
        adult1.setBirthMonth(8);
        adult1.setBirthYear(1988);
        adult1.setPhone1("12345");

        Adult adult2 = new Adult();
        adult2.setBirthDay(22);
        adult2.setBirthMonth(2);
        adult2.setBirthYear(1991);
        adult2.setPhone1("12345");

        MatchPhoneNumberAndBirthDate matchPhoneNumberAndBirthDate = new MatchPhoneNumberAndBirthDate();
        Boolean matched = matchPhoneNumberAndBirthDate.apply(adult1,adult2);

        Assert.assertFalse(matched);
    }

    @Test
    public void invalidWhenBirthDateAndPhoneAreNotSame() {
        Adult adult1 = new Adult();
        adult1.setBirthDay(22);
        adult1.setBirthMonth(2);
        adult1.setBirthYear(1991);
        adult1.setPhone1("12345");

        Adult adult2 = new Adult();
        adult2.setBirthDay(8);
        adult2.setBirthMonth(8);
        adult2.setBirthYear(1988);
        adult2.setPhone1("12345");

        MatchPhoneNumberAndBirthDate matchPhoneNumberAndBirthDate = new MatchPhoneNumberAndBirthDate();
        Boolean matched = matchPhoneNumberAndBirthDate.apply(adult1,adult2);

        Assert.assertFalse(matched);
    }
}
