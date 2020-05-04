package com.rfussell;

/**
 * Assignment2, COMP 268
 * Class: AddressBook.java
 * Purpose: Represent/model a person name with names, contact and social info
 * @author: Robin Fussell
 * Date:  October 1, 2019
 * Version 1.0
 * */

public class AddressBook {

    //Variable Instances
    public String firstName;
    public String middleName;
    public String lastName;
    private String homeAddress;
    private String businessPhone;
    private String homePhone;
    private String cellPhone;
    private String skypeId;
    private String faceBookId;
    private String personalWebsite;


    public AddressBook () {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.businessPhone = businessPhone;
        this.homePhone = homePhone;
        this.cellPhone = cellPhone;
        this.skypeId = skypeId;
        this.faceBookId = faceBookId;
        this.personalWebsite = personalWebsite;
    }



    //setters and getters

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName () {
        return middleName;
    }

    public void setMiddleName (String middleName) {
        this.middleName = middleName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public String getHomeAddress () {
        return homeAddress;
    }

    public void setHomeAddress (String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getBusinessPhone () {
        return businessPhone;
    }

    public void setBusinessPhone (String businessPhone) {
        this.businessPhone = businessPhone;
    }

    public String getHomePhone () {
        return homePhone;
    }

    public void setHomePhone (String homePhone) {
        this.homePhone = homePhone;
    }

    public String getCellPhone () {
        return cellPhone;
    }

    public void setCellPhone (String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getSkypeId () {
        return skypeId;
    }

    public void setSkypeId (String skypeId) {
        this.skypeId = skypeId;
    }

    public String getFaceBookId () {
        return faceBookId;
    }

    public void setFaceBookId (String faceBookId) {
        this.faceBookId = faceBookId;
    }

    public String getPersonalWebsite () {
        return personalWebsite;
    }

    public void setPersonalWebsite (String personalWebsite) {
        this.personalWebsite = personalWebsite;
    }


    public String compareNames (String name1, String name2) {
        if (firstName.equals(name1) && middleName.equals(name1) && lastName.equals(name1))
            return "FirstName M." + name1 + " LastName: " + lastName;
        else if (firstName.equals(name2) && middleName.equals(name2) && lastName.equals(name2))
            return "FirstName M." + name2 + " LastName: " + lastName;
        return "Unknown Contact";

    }

    public String toString () {
        return getFirstName() + "\n" + getMiddleName() + "\n" + getLastName() + "\n" + getHomeAddress()
                + "\n" + getBusinessPhone() + "\n" + getHomePhone() + "\n" + getCellPhone()
                + "\n" + getSkypeId() + "\n" + getFaceBookId() + "\n" + getPersonalWebsite() + "\n";
    }
}
