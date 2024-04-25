package com.example.tonyzone;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;

public class errorpage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_errorpage);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.cyan)));
    }
}