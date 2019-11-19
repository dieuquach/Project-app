package com.example.project_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button One = findViewById(R.id.btn_c1);
        One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changScreen ();
            }
        });
    }
    public void changScreen(){
        Intent intent = new Intent(SecondActivity.this, ResultActivity.class);
        startActivity(intent);
    }

}





