package com.example.kick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashkick extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashkick);
        new Handler() .postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splashkick.this,MainActivity.class);
                startActivity(i);

                finish();
            }
        },4000);
    }
}
