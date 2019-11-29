package com.example.logincw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OutputScreen extends AppCompatActivity {
    Button SecondButton;
    Button RouteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output_screen);
        SecondButton= findViewById(R.id.BtnToFirst);
        RouteButton = findViewById(R.id.buttonRoute);
        SecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent (OutputScreen.this,HomeScreen.class);
                startActivity(intent);
            }
        });
        RouteButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent= new Intent (OutputScreen.this, MapsActivity.class);
                startActivity(intent);
            }
        });
    }
}
// test commit
