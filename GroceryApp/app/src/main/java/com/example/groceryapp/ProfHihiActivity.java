package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ProfHihiActivity extends AppCompatActivity {

    ImageView backNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prof_hihi);
        backNav = findViewById(R.id.backNav);

        backNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(ProfHihiActivity.this, ProfileActivity.class);
                startActivity(i);

            }

        });
    }
}
