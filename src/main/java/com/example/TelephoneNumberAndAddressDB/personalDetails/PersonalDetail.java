package com.example.TelephoneNumberAndAddressDB.personalDetails;

import jakarta.persistence.*;

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
//    @Enumerated(EnumType.STRING)
//    private Voivodeship voivodeship;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPeselNumber() {
        return peselNumber;
    }

    public void setPeselNumber(String peselNumber) {
        this.peselNumber = peselNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        street = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

//    public Voivodeship getVoivodship() {
//        return voivodeship;
//    }
//
//    public void setVoivodship(Voivodeship voivodeship) {
//        this.voivodeship = voivodeship;
//    }
}
