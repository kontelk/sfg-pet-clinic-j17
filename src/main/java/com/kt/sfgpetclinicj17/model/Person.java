package com.kt.sfgpetclinicj17.model;

import lombok.Getter;

/**
 * Created by kontelk on 8/15/23.
 */
public class Person {

    private String firstName;
    private String lastName;

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}