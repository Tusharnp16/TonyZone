package com.example.tonyzone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class electronics extends AppCompatActivity {

    Button btn7,btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics);

        btn7=findViewById(R.id.button10);
        btn8=findViewById(R.id.button9);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.cyan)));

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent page5 = new Intent(getApplicationContext(), errorpage.class);
                startActivity(page5);


            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent page5 = new Intent(getApplicationContext(), errorpage.class);
                startActivity(page5);


            }
        });
    }
}