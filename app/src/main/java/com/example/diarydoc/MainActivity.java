package com.example.diarydoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //widgets
    private Button doctorBtn;
    private Button patientBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doctorBtn = findViewById(R.id.doctor_btn);
        patientBtn = findViewById(R.id.patient_btn);

        doctorBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this,DoctorHome.class);
                        startActivity(i);

                    }
                }
        );

        patientBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this,PatientHome.class);
                        startActivity(i);
                    }
                }
        );

    }
}
