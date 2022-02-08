package com.company;

public class User {

    public String firstName;
    public String lastName;
    public String email;
    public int contactNumber;
    public long id;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public long getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void introduce(){
        System.out.println("Hello my name is " + getFirstName() + " " + getLastName() + ".");
    }

    public void provideContact(){
        System.out.println("You may contact me at " + getContactNumber() + " or you may email me at " + getEmail());
    }
}
