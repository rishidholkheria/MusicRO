package com.rishidholkheria.musicro;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashIntent = new Intent(MainActivity.this,first_screen.class);
                startActivity(splashIntent);
                finish();
            }
        },SPLASH_TIME_OUT);

    }


}
