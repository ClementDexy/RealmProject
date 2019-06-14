package com.example.realmproject;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

public class RealmHelper {
    Realm realm;

    public RealmHelper(Realm realm){
        this.realm = realm;
    }

    public ArrayList<String> retrieve(){

        ArrayList<String> studentNames = new  ArrayList<>();
        RealmResults<Student> students = realm.where(Student.class).findAll();
        for (Student name: students){
            studentNames.add(name.getReg()+ " "+name.getFirstName()+" "+ name.getLastName());
        }
        return studentNames;
    }
}
