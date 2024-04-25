package com.example.tonyzone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homepage extends AppCompatActivity {

    Button feed,clothes,stationery,electronic,kitchen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        feed = findViewById(R.id.cbtnid7);
        clothes = findViewById(R.id.cbtnid2);
        stationery = findViewById(R.id.cbtnid3);
        electronic = findViewById(R.id.cbtnid4);
        kitchen = findViewById(R.id.cbtnid5);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.cyan)));



        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent feedback = new Intent(getApplicationContext(), feedback.class);
                startActivity(feedback);
            }
        });
        clothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent page1 = new Intent(getApplicationContext(), clothes.class);
                startActivity(page1);
            }
        });
        stationery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent page2 = new Intent(getApplicationContext(), stationery.class);
                startActivity(page2);
            }
        });
        electronic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent page3 = new Intent(getApplicationContext(), electronics.class);
                startActivity(page3);
            }
        });
        kitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent page3 = new Intent(getApplicationContext(), kitchen.class);
                startActivity(page3);
            }
        });
    }
}