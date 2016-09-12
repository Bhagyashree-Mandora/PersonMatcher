package main.usu;

public class Person implements Comparable{
    int objectId;

    String firstName = null;
    String middleName = null;
    String lastName = null;
    int birthYear;
    int birthMonth;
    int birthDay;
    String stateFileNumber = null;
    String socialSecurityNumber = null;

    String phone1 = null;
    String phone2 = null;

    String NewbornScreeningNumber = null;
    String IsPartOfMultipleBirth = null;
    int BirthOrder;
    String BirthCounty = null;
    String MotherFirstName = null;
    String MotherMiddleName = null;
    String MotherLastName = null;

    public Person(String fn, String mn, String ln, String sfn, String ssn){
        firstName = fn;
        middleName = mn;
        lastName = ln;
        stateFileNumber = sfn;
        socialSecurityNumber = ssn;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}