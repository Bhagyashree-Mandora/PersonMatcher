package main.usu;

public class Child extends Person {

    String newbornScreeningNumber = null;
    String isPartOfMultipleBirth = null;
    Integer birthOrder = null;
    String birthCounty = null;
    String motherFirstName = null;
    String motherMiddleName = null;
    String motherLastName = null;

    public String getNewbornScreeningNumber() {
        return newbornScreeningNumber;
    }

    public String getIsPartOfMultipleBirth() {
        return isPartOfMultipleBirth;
    }

    public Integer getBirthOrder() {
        return birthOrder;
    }

    public String getBirthCounty() {
        return birthCounty;
    }

    public String getMotherFirstName() {
        return motherFirstName;
    }

    public String getMotherMiddleName() {
        return motherMiddleName;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

    public void setNewbornScreeningNumber(String newbornScreeningNumber) {
        this.newbornScreeningNumber = newbornScreeningNumber;
    }

    public void setIsPartOfMultipleBirth(String isPartOfMultipleBirth) {
        this.isPartOfMultipleBirth = isPartOfMultipleBirth;
    }

    public void setBirthOrder(Integer birthOrder) {
        this.birthOrder = birthOrder;
    }

    public void setBirthCounty(String birthCounty) {
        this.birthCounty = birthCounty;
    }

    public void setMotherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
    }

    public void setMotherMiddleName(String motherMiddleName) {
        this.motherMiddleName = motherMiddleName;
    }

    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }
}
