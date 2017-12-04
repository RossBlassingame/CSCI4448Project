package org.csci4448.controllers;

public class Person {
    private String firstName;
    private String lastName;
    public void setFirstName(String f){
        firstName = f;
    }
    public void setLastName(String l){
        lastName = l;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}
