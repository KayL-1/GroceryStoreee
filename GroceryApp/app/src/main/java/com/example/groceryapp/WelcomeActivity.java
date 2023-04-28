package com.example.groceryapp;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
public class WelcomeActivity extends AppCompatActivity {

    Button logBtn;
    Button regBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        logBtn = findViewById(R.id.logButton);
        regBtn = findViewById(R.id.regButton);

        logBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(WelcomeActivity.this,LoginActivity.class);
                startActivity(i);

            }

        });

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(WelcomeActivity.this,RegisterActivity.class);
                startActivity(i);

            }

        });
    }

}