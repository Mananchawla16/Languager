package com.example.deeksha.mycheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ImageView;

public class FrenchOptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_options);
        ImageView basic1 = (ImageView)findViewById(R.id.basic1);
        ImageView phrase1 = (ImageView)findViewById(R.id.phrase1);
        ImageView animal1 = (ImageView)findViewById(R.id.animal1);
        ImageView color1 = (ImageView)findViewById(R.id.color1);
        ImageView food1 = (ImageView)findViewById(R.id.food1);

        basic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        getApplicationContext(),
                        "Basics",
                        Toast.LENGTH_SHORT
                ).show();
//                Intent i = new Intent(FrenchOptions.this, FrenchBasics.class);
//                startActivity(i);
            }
        });

        phrase1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        getApplicationContext(),
                        "Phrases",
                        Toast.LENGTH_SHORT
                ).show();
                Intent i = new Intent(FrenchOptions.this, FrenchPhrases.class);
                startActivity(i);
            }
        });

        animal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        getApplicationContext(),
                        "Animals",
                        Toast.LENGTH_SHORT
                ).show();
//                Intent i = new Intent(FrenchOptions.this, FrenchAnimals.class);
//                startActivity(i);
            }
        });

        color1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        getApplicationContext(),
                        "Colors",
                        Toast.LENGTH_SHORT
                ).show();
//                Intent i = new Intent(FrenchOptions.this, FrenchColors.class);
//                startActivity(i);
            }
        });

        food1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        getApplicationContext(),
                        "Food",
                        Toast.LENGTH_SHORT
                ).show();
//                Intent i = new Intent(FrenchOptions.this, FrenchFood.class);
//                startActivity(i);
            }
        });
    }
}
