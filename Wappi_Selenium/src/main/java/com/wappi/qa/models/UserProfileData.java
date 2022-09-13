package com.wappi.qa.models;

public class UserProfileData {
    private String name;
    private String lastName;
    private String dateOfBirth;
    private String country;
    private String sex;

    public UserProfileData(String name, String lastName, String dateOfBirth, String country, String sex) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getCountry() {
        return country;
    }
    public String getSex() {
        return sex;
    }
}
