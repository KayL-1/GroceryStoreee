package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ShopHome extends AppCompatActivity {
    Button homeBut;
    Button prodBut;
    Button revBut;
    ImageView backNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_home);
        backNav = findViewById(R.id.backNav);
        homeBut = findViewById(R.id.homeBut);
        prodBut = findViewById(R.id.prodBut);
        revBut = findViewById(R.id.revBut);

        prodBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(ShopHome.this, ProfMyShopActivity.class);
                startActivity(i);

            }

        });

        backNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ShopHome.this, ProfileActivity.class);
                startActivity(i);
            }
        });

        revBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(ShopHome.this, ShopReview.class);
                startActivity(i);

            }

        });
    }


    public void productButton(View v) {
        Intent i = new Intent(ShopHome.this, ProductActivity.class);
        startActivity(i);
    }
}