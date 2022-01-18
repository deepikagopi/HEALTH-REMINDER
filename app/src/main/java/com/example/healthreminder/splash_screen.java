package com.example.healthreminder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.healthreminder.addmedicine.AddMedicineActivity;
import com.example.healthreminder.medicine.MedicineActivity;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        int secondsDelayed = 10;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(getApplicationContext(), MedicineActivity.class));             //after 500 milliseconds this block calls the mainActivity
                finish();
            }
        }, secondsDelayed * 500);
    }
}










