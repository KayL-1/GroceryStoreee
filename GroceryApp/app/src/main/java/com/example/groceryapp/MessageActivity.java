package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MessageActivity extends AppCompatActivity {

    ImageView backNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        backNav = findViewById(R.id.backNav);

        backNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(MessageActivity.this,HomeActivity.class);
                startActivity(i);

            }

        });

    }

    public void mesButton(View v) {
        Intent i = new Intent(MessageActivity.this, MessageNewAct.class);
        startActivity(i);
    }
}