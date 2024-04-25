package com.example.tonyzone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signin extends AppCompatActivity {

    Button signin;
    EditText pass,email,email2,pass2;
    TextView otp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        signin = findViewById(R.id.signinid2);
        email = findViewById(R.id.emailid);
        pass = findViewById(R.id.pwdid);
        email2 = findViewById(R.id.emailid2);
        pass2 = findViewById(R.id.pwdid2);
        otp2=findViewById(R.id.otp1id);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.cyan)));

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean isvalidate2 = validation2();
                if (isvalidate2) {
                    Intent signinpage = new Intent(getApplicationContext(), homepage.class);
                    startActivity(signinpage);
                }
            }
        });
        otp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginpage = new Intent(getApplicationContext(),login.class);
                startActivity(loginpage);
            }
        });
    }
    private boolean validation2() {
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        String val = email.getText().toString();
        if (email.length() == 0) {

            email.setError("Please enter email-id");
            return false;
        }
        else if (!val.matches(emailPattern)) {
            email.setError("Invalid email address");
            return false;
        }

        if (pass.length() <= 8 || pass.length() >= 20) {
            pass.setError("Password length should be 8 or more");
            return false;
        }
        return true;
    }
}