package com.example.groceryapp;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;

public class RegisterActivity extends AppCompatActivity {

    Button regNow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        regNow = findViewById(R.id.registerButton);

        regNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(RegisterActivity.this,MainActivity.class);
                startActivity(i);

            }

        });
    }
}
