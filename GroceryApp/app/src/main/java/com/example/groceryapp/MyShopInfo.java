package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MyShopInfo extends AppCompatActivity {

    LinearLayout backNav;

    LinearLayout arrowButton1;
    LinearLayout arrowButton2;
    LinearLayout arrowButton3;
    LinearLayout arrowButton4;
    LinearLayout arrowButton5;
    LinearLayout arrowButton6;
    LinearLayout arrowButton7;
    LinearLayout arrowButton8;

    ImageView mesBut;
    ImageView notBut;
    Button myshopBut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_shop_info);
        backNav = findViewById(R.id.backNav);
        mesBut = findViewById(R.id.mesBut1);
        notBut = findViewById(R.id.notBut1);
        myshopBut = findViewById(R.id.myshopBut);

        arrowButton1 = findViewById(R.id.arrowButton1);
        arrowButton2 = findViewById(R.id.arrowButton2);
        arrowButton3 = findViewById(R.id.arrowButton3);
        arrowButton4 = findViewById(R.id.arrowButton4);
        arrowButton5 = findViewById(R.id.arrowButton5);
        arrowButton6 = findViewById(R.id.arrowButton6);

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

        arrowButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(MyShopInfo.this,MyProfAct1.class);
                startActivity(i);
            }

        });

        arrowButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(MyShopInfo.this,MyProfAct2.class);
                startActivity(i);
            }

        });

        arrowButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(MyShopInfo.this,MyProfAct3.class);
                startActivity(i);
            }

        });

        arrowButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(MyShopInfo.this,MyProfAct4.class);
                startActivity(i);
            }

        });

        arrowButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(MyShopInfo.this,MyProfAct5.class);
                startActivity(i);
            }

        });

        arrowButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(MyShopInfo.this,MyProfAct6.class);
                startActivity(i);
            }

        });




        backNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(MyShopInfo.this,ProfileActivity.class);
                startActivity(i);
            }

        });

        myshopBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(MyShopInfo.this,ShopHome.class);
                startActivity(i);
            }

        });

        notBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(MyShopInfo.this,NotificationActivity.class);
                startActivity(i);
            }

        });

        mesBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(MyShopInfo.this,MessageActivity.class);
                startActivity(i);
            }

        });

    }
}