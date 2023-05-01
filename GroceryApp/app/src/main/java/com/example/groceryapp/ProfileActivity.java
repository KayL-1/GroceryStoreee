package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileActivity extends AppCompatActivity {

    ImageView profileButton1;
    ImageView profileButton2;
    ImageView profileButton3;
    ImageView profileButton4;
    ImageView profileButton5;
    ImageView profileButton6;
    ImageView profileButton7;
    ImageView profileButton8;
    ImageView profileButton9;
    Button profileButton10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        profileButton1 = findViewById(R.id.arrowButton1);
        profileButton2 = findViewById(R.id.arrowButton2);
        profileButton3 = findViewById(R.id.arrowButton3);
        profileButton4 = findViewById(R.id.arrowButton4);
        profileButton5 = findViewById(R.id.arrowButton5);
        profileButton6 = findViewById(R.id.arrowButton6);
        profileButton7 = findViewById(R.id.arrowButton7);
        profileButton8 = findViewById(R.id.arrowButton8);
        profileButton9 = findViewById(R.id.arrowButton9);
        profileButton10 = findViewById(R.id.arrowButton10);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.bottom_profile);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.bottom_home:
                    startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                case R.id.bottom_search:
                    startActivity(new Intent(getApplicationContext(), SearchActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;
                case R.id.bottom_profile:
                    return true;
                case R.id.bottom_cart:
                    startActivity(new Intent(getApplicationContext(), CartActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;
            }
            return false;
        });

        profileButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(ProfileActivity.this,ProfHeheActivity.class);
                startActivity(i);
            }

        });
        profileButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(ProfileActivity.this,ProfHihiActivity.class);
                startActivity(i);
            }

        });
        profileButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(ProfileActivity.this,ProfHohoActivity.class);
                startActivity(i);
            }

        });
        profileButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(ProfileActivity.this,ProfHahaActivity.class);
                startActivity(i);
            }

        });
        profileButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(ProfileActivity.this,ProfGegeActivity.class);
                startActivity(i);
            }

        });
        profileButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(ProfileActivity.this,ProfGigiActivity.class);
                startActivity(i);
            }

        });
        profileButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(ProfileActivity.this,ProfJejeActivity.class);
                startActivity(i);
            }

        });
        profileButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(ProfileActivity.this,ProfJijiActivity.class);
                startActivity(i);
            }

        });
        profileButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(ProfileActivity.this,ProfJujuActivity.class);
                startActivity(i);
            }

        });
        profileButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(ProfileActivity.this,ProfMyShopActivity.class);
                startActivity(i);
            }

        });











    }
}