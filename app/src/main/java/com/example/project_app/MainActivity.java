package com.example.project_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button One = findViewById(R.id.bnt_1);
        One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changScreen ();
            }
        });
    }
    public void changScreen(){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
