package com.example.tonyzone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signup extends AppCompatActivity {

    Button signup;
    EditText name, phno, email2, pass2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        signup = findViewById(R.id.signupid2);
        name = findViewById(R.id.nameid2);
        phno = findViewById(R.id.phid);
        email2 = findViewById(R.id.emailid2);
        pass2 = findViewById(R.id.pwdid2);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.cyan)));


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean isvalidate = validation();
                Boolean isvalidate2 = validation2();
                if (isvalidate && isvalidate2) {
                    Intent signuppage = new Intent(getApplicationContext(), signin.class);
                    startActivity(signuppage);
                }
            }
        });
    }

    private boolean validation() {
        if (name.length() == 0) {
            name.setError("Please enter your name");
            return false;
        }
        if (phno.length() != 10) {
            phno.setError("Enter a valid number");
            return false;
        }
        if (pass2.length() <= 8 || pass2.length() >= 20) {
            pass2.setError("Password length should be 8 or more");
            return false;
        }
        return true;
    }


    private boolean validation2() {
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        String val = email2.getText().toString();
        if (email2.length() == 0) {

            email2.setError("Please enter email-id");
            return false;
        }
        else if (!val.matches(emailPattern)) {
            email2.setError("Invalid email address");
            return false;
        }
        return true;
    }

}





