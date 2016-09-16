package main.usu;

public class Child extends Person {

    String NewbornScreeningNumber = null;
    String IsPartOfMultipleBirth = null;
    Integer BirthOrder = null;
    String BirthCounty = null;
    String MotherFirstName = null;
    String MotherMiddleName = null;
    String MotherLastName = null;

    public String getNewbornScreeningNumber() {
        return NewbornScreeningNumber;
    }

    public String getIsPartOfMultipleBirth() {
        return IsPartOfMultipleBirth;
    }

    public Integer getBirthOrder() {
        return BirthOrder;
    }

    public String getBirthCounty() {
        return BirthCounty;
    }

    public String getMotherFirstName() {
        return MotherFirstName;
    }

    public String getMotherMiddleName() {
        return MotherMiddleName;
    }

    public String getMotherLastName() {
        return MotherLastName;
    }
}
