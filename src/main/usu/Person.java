package main.usu;

public class Person {
    Integer objectId;
    String firstName = null;
    String middleName = null;
    String lastName = null;
    Integer birthYear = null;
    Integer birthMonth = null;
    Integer birthDay = null;
    String gender = null;
    String stateFileNumber = null;
    String socialSecurityNumber = null;

    public Integer getObjectId() {
        return objectId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public Integer getBirthMonth() {
        return birthMonth;
    }

    public Integer getBirthDay() {
        return birthDay;
    }

    public String getGender() {
        return gender;
    }

    public String getStateFileNumber() {
        return stateFileNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public void setBirthMonth(Integer birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setBirthDay(Integer birthDay) {
        this.birthDay = birthDay;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setStateFileNumber(String stateFileNumber) {
        this.stateFileNumber = stateFileNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}