package com.shawaz0149.hometask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button log,sign;
        log=findViewById(R.id.login);
        sign=findViewById(R.id.signup);
        log.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),Login.class);
            startActivity(intent);
        });
        sign.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),Signup.class);
            startActivity(intent);
        });
    }
}