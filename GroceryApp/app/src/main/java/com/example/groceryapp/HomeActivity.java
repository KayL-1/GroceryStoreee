package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    ImageView notifBut;
    ImageView messageBut;
    ImageView prodBut1;
    ImageView prodBut2;
    ImageView prodBut3;
    ImageView prodBut4;
    ImageView prodBut5;

    ImageView categBut1;
    ImageView categBut2;
    ImageView categBut3;
    ImageView categBut4;
    ImageView categBut5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        notifBut = findViewById(R.id.NotifButton1);
        messageBut = findViewById(R.id.messageButton1);

        prodBut1 = findViewById(R.id.prod1);
        prodBut2 = findViewById(R.id.prod2);
        prodBut3 = findViewById(R.id.prod3);
        prodBut4 = findViewById(R.id.prod4);
        prodBut5 = findViewById(R.id.prod5);

        categBut1 = findViewById(R.id.categ1);
        categBut2 = findViewById(R.id.categ2);
        categBut3 = findViewById(R.id.categ3);
        categBut4 = findViewById(R.id.categ4);
        categBut5 = findViewById(R.id.categ5);

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

        categBut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(HomeActivity.this,CategoryActivity.class);
                startActivity(i);

            }

        });

        categBut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(HomeActivity.this,CategoryActivity.class);
                startActivity(i);

            }

        });

        categBut3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(HomeActivity.this,CategoryActivity.class);
                startActivity(i);

            }

        });

        categBut4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(HomeActivity.this,CategoryActivity.class);
                startActivity(i);

            }

        });

        categBut5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(HomeActivity.this,CategoryActivity.class);
                startActivity(i);

            }

        });

        prodBut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(HomeActivity.this,ProductActivity.class);
                startActivity(i);

            }

        });

        prodBut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(HomeActivity.this,ProductActivity.class);
                startActivity(i);

            }

        });

        prodBut3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(HomeActivity.this,ProductActivity.class);
                startActivity(i);

            }

        });

        prodBut4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(HomeActivity.this,ProductActivity.class);
                startActivity(i);

            }

        });

        prodBut5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(HomeActivity.this,ProductActivity.class);
                startActivity(i);

            }

        });

        notifBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(HomeActivity.this,NotificationActivity.class);
                startActivity(i);

            }

        });

        messageBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(HomeActivity.this,MessageActivity.class);
                startActivity(i);

            }

        });


    }
}