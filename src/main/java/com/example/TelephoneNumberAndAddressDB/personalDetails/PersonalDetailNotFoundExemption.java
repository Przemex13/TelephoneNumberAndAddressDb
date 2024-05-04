package com.example.TelephoneNumberAndAddressDB.personalDetails;

public class PersonalDetailNotFoundExemption extends Throwable {
    public PersonalDetailNotFoundExemption(int intID) {
        super("User" + intID + "cannot be found");
    }
}
