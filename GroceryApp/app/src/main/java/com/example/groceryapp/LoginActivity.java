package com.example.groceryapp;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {

    Button logButton1;
    TextView regButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        logButton1 = findViewById(R.id.loginButton);
        regButton1 = findViewById(R.id.signupText);

        logButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(LoginActivity.this,HomeActivity.class);
                startActivity(i);

            }
        });

        regButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(i);

            }

        });




    }

}

