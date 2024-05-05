package com.example.TelephoneNumberAndAddressDB.personalDetails;

public class PersonalDetailNotFoundExemption extends Throwable {
    public PersonalDetailNotFoundExemption(int intID) {
        super("Person " + intID + " cannot be found");
    }
}
