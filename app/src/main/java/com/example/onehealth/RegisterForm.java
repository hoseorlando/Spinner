package com.example.onehealth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RegisterForm extends AppCompatActivity {

    private Spinner id, gender, blood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_form);


        id = findViewById(R.id.id);
        gender = findViewById(R.id.gender);
        blood = findViewById(R.id.blood);

        final List<String> idlist = new ArrayList<String>();
        idlist.add("Social Security ID");
        idlist.add("Driving License");
        idlist.add("Passport");

        final List<String> genderlist = new ArrayList<String>();
        genderlist.add("Male");
        genderlist.add("Female");

        final List<String> bloodlist = new ArrayList<String>();
        bloodlist.add("A");
        bloodlist.add("B");
        bloodlist.add("AB");
        bloodlist.add("O");

        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, idlist);
        id.setAdapter(dataAdapter1);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        id.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(RegisterForm.this, "Selected: " + idlist.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, genderlist);
        gender.setAdapter(dataAdapter2);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        gender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(RegisterForm.this, "Selected: " + genderlist.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, bloodlist);
        blood.setAdapter(dataAdapter3);
        dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        blood.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(RegisterForm.this, "Selected: " + bloodlist.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}