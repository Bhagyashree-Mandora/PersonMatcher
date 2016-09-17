package usu.MatcherComponents;

import main.usu.Adult;
import main.usu.MatcherComponents.MatchPhoneNumberAndAnyUniqueId;
import org.junit.Assert;
import org.junit.Test;

public class MatchPhoneNumberAndAnyUniqueIdTest {
    @Test
    public void validWhenPhoneAndAllIdAreSame() {
        Adult adult1 = new Adult();
        adult1.setPhone1("12345");
        adult1.setPhone2("6789");
        adult1.setSocialSecurityNumber("A123");
        adult1.setStateFileNumber("Z123");

        Adult adult2 = new Adult();
        adult2.setPhone1("12345");
        adult2.setPhone2("6789");
        adult2.setSocialSecurityNumber("A123");
        adult2.setStateFileNumber("Z123");

        MatchPhoneNumberAndAnyUniqueId matchPhoneNumberAndAnyUniqueId = new MatchPhoneNumberAndAnyUniqueId();
        Boolean matched = matchPhoneNumberAndAnyUniqueId.apply(adult1,adult2);

        Assert.assertTrue(matched);
    }

    @Test
    public void validWhenOnePhoneIsNotSame() {
        Adult adult1 = new Adult();
        adult1.setPhone1("12345");
        adult1.setPhone2("000");
        adult1.setSocialSecurityNumber("A123");
        adult1.setStateFileNumber("Z123");

        Adult adult2 = new Adult();
        adult2.setPhone1("12345");
        adult2.setPhone2("6789");
        adult2.setSocialSecurityNumber("A123");
        adult2.setStateFileNumber("Z123");

        MatchPhoneNumberAndAnyUniqueId matchPhoneNumberAndAnyUniqueId = new MatchPhoneNumberAndAnyUniqueId();
        Boolean matched = matchPhoneNumberAndAnyUniqueId.apply(adult1,adult2);

        Assert.assertTrue(matched);
    }

    @Test
    public void validWhenOtherPhoneIsNotSame() {
        Adult adult1 = new Adult();
        adult1.setPhone1("0000");
        adult1.setPhone2("6789");
        adult1.setSocialSecurityNumber("A123");
        adult1.setStateFileNumber("Z123");

        Adult adult2 = new Adult();
        adult2.setPhone1("12345");
        adult2.setPhone2("6789");
        adult2.setSocialSecurityNumber("A123");
        adult2.setStateFileNumber("Z123");

        MatchPhoneNumberAndAnyUniqueId matchPhoneNumberAndAnyUniqueId = new MatchPhoneNumberAndAnyUniqueId();
        Boolean matched = matchPhoneNumberAndAnyUniqueId.apply(adult1,adult2);

        Assert.assertTrue(matched);
    }

    @Test
    public void validWhenOnlyOneIdIsNotSame() {
        Adult adult1 = new Adult();
        adult1.setPhone1("12345");
        adult1.setPhone2("6789");
        adult1.setSocialSecurityNumber("A000");
        adult1.setStateFileNumber("Z123");

        Adult adult2 = new Adult();
        adult2.setPhone1("12345");
        adult2.setPhone2("6789");
        adult2.setSocialSecurityNumber("A123");
        adult2.setStateFileNumber("Z123");

        MatchPhoneNumberAndAnyUniqueId matchPhoneNumberAndAnyUniqueId = new MatchPhoneNumberAndAnyUniqueId();
        Boolean matched = matchPhoneNumberAndAnyUniqueId.apply(adult1,adult2);

        Assert.assertTrue(matched);
    }

    @Test
    public void validWhenOnlyOtherIdIsNotSame() {
        Adult adult1 = new Adult();
        adult1.setPhone1("12345");
        adult1.setPhone2("6789");
        adult1.setSocialSecurityNumber("A123");
        adult1.setStateFileNumber("Z000");

        Adult adult2 = new Adult();
        adult2.setPhone1("12345");
        adult2.setPhone2("6789");
        adult2.setSocialSecurityNumber("A123");
        adult2.setStateFileNumber("Z123");

        MatchPhoneNumberAndAnyUniqueId matchPhoneNumberAndAnyUniqueId = new MatchPhoneNumberAndAnyUniqueId();
        Boolean matched = matchPhoneNumberAndAnyUniqueId.apply(adult1,adult2);

        Assert.assertTrue(matched);
    }

    @Test
    public void invalidWhenNoIdAreSame() {
        Adult adult1 = new Adult();
        adult1.setPhone1("12345");
        adult1.setPhone2("6789");
        adult1.setSocialSecurityNumber("A000");
        adult1.setStateFileNumber("Z000");

        Adult adult2 = new Adult();
        adult2.setPhone1("12345");
        adult2.setPhone2("6789");
        adult2.setSocialSecurityNumber("A123");
        adult2.setStateFileNumber("Z123");

        MatchPhoneNumberAndAnyUniqueId matchPhoneNumberAndAnyUniqueId = new MatchPhoneNumberAndAnyUniqueId();
        Boolean matched = matchPhoneNumberAndAnyUniqueId.apply(adult1,adult2);

        Assert.assertFalse(matched);
    }

    @Test
    public void invalidWhenNoPhoneAreSame() {
        Adult adult1 = new Adult();
        adult1.setPhone1("0000");
        adult1.setPhone2("0000");
        adult1.setSocialSecurityNumber("A123");
        adult1.setStateFileNumber("Z123");

        Adult adult2 = new Adult();
        adult2.setPhone1("12345");
        adult2.setPhone2("6789");
        adult2.setSocialSecurityNumber("A123");
        adult2.setStateFileNumber("Z123");

        MatchPhoneNumberAndAnyUniqueId matchPhoneNumberAndAnyUniqueId = new MatchPhoneNumberAndAnyUniqueId();
        Boolean matched = matchPhoneNumberAndAnyUniqueId.apply(adult1, adult2);

        Assert.assertFalse(matched);
    }
}
