package com.example.deeksha.mycheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class FrenchBuffer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_buffer);
        ImageView imageView2 = (ImageView)findViewById(R.id.imageView2);

        imageView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(
                        getApplicationContext(),
                        "We're Progressing!!!!...",
                        Toast.LENGTH_SHORT
                ).show();
                Intent i = new Intent(FrenchBuffer.this, FrenchOptions.class);
                startActivity(i);
            }
        });
    }
}
