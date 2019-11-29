package com.example.logincw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;


public class HomeScreen extends AppCompatActivity {
    String[] Journeys = {
            "Derry",
            "Belfast",
            "Coleraine",
            "Larne",
            "portadown"

    };
    Button firstButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,Journeys);
        AutoCompleteTextView textView = (AutoCompleteTextView)findViewById(R.id.autoCompleteEditText);

        AutoCompleteTextView textView1 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView2);
        textView.setThreshold(2);
        textView1.setThreshold(2);
        textView.setAdapter(adapter);
        textView1.setAdapter(adapter);

        firstButton = findViewById(R.id.BtnToSecond);
        firstButton.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, OutputScreen.class);
                startActivity(intent);

            }
        });

    }
}
