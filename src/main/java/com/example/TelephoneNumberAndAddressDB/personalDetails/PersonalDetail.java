package com.example.TelephoneNumberAndAddressDB.personalDetails;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table (name = "personal_details")
public class PersonalDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 45, name = "first_name")
    private String name;
    @Column(length = 45, name = "last_name")
    private String surname;
    @Column(length = 11, name = "pesel_number")
    private String peselNumber;
    @Column(length = 15, name = "telephone_number")
    private String telephoneNumber;
    @Column(length = 45, name = "email")
    private String email;
    @Column(length = 25, name = "street_and_house_number")
    private String street;
    @Column(length = 9, name = "city_postcode")
    private String postcode;
    @Column(length = 20, name = "city")
    private String city;


}
