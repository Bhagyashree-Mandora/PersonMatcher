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
}