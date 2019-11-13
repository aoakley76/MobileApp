package com.example.logincw;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper db;
    EditText editEmail, editPassword;
    Button btnLogin, btnRegister, btnForgottenPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DatabaseHelper(this);

        editEmail = (EditText) findViewById(R.id.editEmail);
        editPassword = (EditText) findViewById(R.id.editPassword);

        btnRegister = (Button) findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override

            // opens register screen
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RegisterScreen.class));
            }
        });

        btnForgottenPassword = (Button) findViewById(R.id.btnForgottenPW);
        btnForgottenPassword.setOnClickListener(new View.OnClickListener() {
            @Override

            // opens login screen
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ForgottenPassword.class));
            }
        });
    }}