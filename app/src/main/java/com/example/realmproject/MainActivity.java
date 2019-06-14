package com.example.realmproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {
    EditText reg,firstName,lastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reg = findViewById(R.id.reg);
        firstName = findViewById(R.id.first);
        lastName = findViewById(R.id.last);
    }

    public void Save(View view){
        Realm realm = Realm.getDefaultInstance();
        int reg1;
        String firstNam, lastNam;
        reg1 = Integer.parseInt(reg.getText().toString());
        firstNam = firstName.getText().toString();
        lastNam = lastName.getText().toString();

        realm.beginTransaction();
        Student student = realm.createObject(Student.class);
        student.setReg(reg1);
        student.setFirstName(firstNam);
        student.setLastName(lastNam);
        realm.commitTransaction();
        Toast.makeText(getApplicationContext(), "succesfull saved",Toast.LENGTH_SHORT).show();
    }

    public void View (View view){

        startActivity(new Intent(this,Main2Activity.class));
    }
}
