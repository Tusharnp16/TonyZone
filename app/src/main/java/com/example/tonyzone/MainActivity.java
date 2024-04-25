package com.example.tonyzone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.graphics.drawable.*;

public class MainActivity extends AppCompatActivity {

    Button signup,signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signup=findViewById(R.id.signupid);
        signin=findViewById(R.id.signinid);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.cyan)));

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signinpage=new Intent(getApplicationContext(),signin.class);
                startActivity(signinpage);

            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signuppage = new Intent(getApplicationContext(), signup.class);
                startActivity(signuppage);

            }
        });

        }
    }
