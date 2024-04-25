package com.example.tonyzone;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class login extends AppCompatActivity {

    EditText otp;
    EditText number;
    Button signin;
    TextView get;
    int val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        otp = findViewById(R.id.pwdid10);
        signin = findViewById(R.id.signinid10);
        number = findViewById(R.id.mblid);
        get = findViewById(R.id.otp11);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.cyan)));

        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Boolean isvalidate3 = validation3();
                    if(isvalidate3){
                        Random random = new Random();

                        val = random.nextInt(9000)+1000;
                        otp.setText(Integer.toString(val));
                    }
                }
        });


        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean isvalidate2 = validation2();

                if(isvalidate2 )
                {
                        Intent signinpage = new Intent(getApplicationContext(), homepage.class);
                        startActivity(signinpage);
                }
            }
        });
}

    private boolean validation2() {
        if (number.length() != 10) {
            number.setError("Enter a valid number");
            return false;
        }
        return true;
    }
    private boolean validation3()
    {
        if(number.length() != 10)
        {
            number.setError("Enter valid number to get OTP");
            return false;
        }
        return true;
    }
}

