package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CheckoutCartActivity extends AppCompatActivity {

    Button placeorderButton1;

    ImageView backNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout_cart);
        backNav = findViewById(R.id.backNav);

        placeorderButton1 = findViewById(R.id.placeorderButton1);

        backNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(CheckoutCartActivity.this, CartActivity.class);
                startActivity(i);

            }

        });
        placeorderButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(CheckoutCartActivity.this,PlaceorderCartActivity.class);
                startActivity(i);
            }

        });
    }
}

