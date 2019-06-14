package com.example.realmproject;

import io.realm.RealmObject;

public class Student extends RealmObject {

    private int          reg;
    private String       firstName;
    private String       lastName;


    public int getReg() {
        return reg;
    }

    public void setReg(int reg) {
        this.reg = reg;
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

    public Student() {
    }
}
