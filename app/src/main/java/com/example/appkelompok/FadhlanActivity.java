package com.example.appkelompok;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FadhlanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fadhlan);
        Intent intent = getIntent();
        if (intent.getStringExtra(reza.EXTRA_MESSAGE) != null){
            String msg = intent.getStringExtra(reza.EXTRA_MESSAGE);
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
        }
    }
}