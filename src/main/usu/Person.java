package main.usu;

public class Person {
    int objectId;

    String _firstName = null;
    String _middleName = null;
    String _lastName = null;
    int _birthYear;
    int _birthMonth;
    int _birthDay;
    String _stateFileNumber = null;
    String _socialSecurityNumber = null;

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
        _firstName = fn;
        _middleName = mn;
        _lastName = ln;
        _stateFileNumber = sfn;
        _socialSecurityNumber = ssn;
    }
}