package com.example.deeksha.mycheck;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        ImageView imageView2 = (ImageView)findViewById(R.id.imageView2);

        imageView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(
                        getApplicationContext(),
                        "LET'S LEARN...",
                        Toast.LENGTH_SHORT
                ).show();
                Intent i = new Intent(HomePage.this, FrenchBuffer.class);
                startActivity(i);
            }
        });
    }
//        EditText editText1 = (EditText)findViewById(R.id.editText1);
//        editText1.setText("How do you say "+Constants.FRENCH.BASICS.basics1+" in French", TextView.BufferType.EDITABLE);
//        Log.i("language", Constants.FRENCH.BASICS.basics1);
//        Log.i("translation", Constants.Translations.BASICS.basics1);
}


