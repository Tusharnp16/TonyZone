package com.example.tonyzone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class stationery extends AppCompatActivity {

    Button btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stationery);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.cyan)));

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent page5 = new Intent(getApplicationContext(), errorpage.class);
                startActivity(page5);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent page5 = new Intent(getApplicationContext(), errorpage.class);
                startActivity(page5);
            }
        });
    }
}