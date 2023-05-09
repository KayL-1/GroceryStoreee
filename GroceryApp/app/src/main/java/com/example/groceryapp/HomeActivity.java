package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    ImageView mesBut;
    ImageView notBut;

    ImageView cat1;
    ImageView cat2;
    ImageView cat3;
    ImageView cat4;
    ImageView cat5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mesBut = findViewById(R.id.mesBut1);
        notBut = findViewById(R.id.notBut1);
        cat1 = findViewById(R.id.categ1);
        cat2 = findViewById(R.id.categ2);
        cat3 = findViewById(R.id.categ3);
        cat4 = findViewById(R.id.categ4);
        cat5 = findViewById(R.id.categ5);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.bottom_home);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.bottom_home:
                    return true;
                case R.id.bottom_search:
                    startActivity(new Intent(getApplicationContext(), SearchActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;
                case R.id.bottom_profile:
                    startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;
                case R.id.bottom_cart:
                    startActivity(new Intent(getApplicationContext(), CartActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;
            }
            return false;
        });

        notBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(HomeActivity.this,NotificationActivity.class);
                startActivity(i);
            }

        });

        mesBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(HomeActivity.this,MessageActivity.class);
                startActivity(i);
            }

        });

        cat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(HomeActivity.this,CategoryActivity.class);
                startActivity(i);
            }

        });

        cat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(HomeActivity.this,CategoryActivity2.class);
                startActivity(i);
            }

        });

        cat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(HomeActivity.this,CategoryActivity3.class);
                startActivity(i);
            }

        });

        cat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(HomeActivity.this,CategoryActivity4.class);
                startActivity(i);
            }

        });

        cat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(HomeActivity.this,CategoryActivity5.class);
                startActivity(i);
            }

        });


    }

    public void productButton(View v) {
        Intent i = new Intent(HomeActivity.this, ProductActivity.class);
        startActivity(i);
    }

}