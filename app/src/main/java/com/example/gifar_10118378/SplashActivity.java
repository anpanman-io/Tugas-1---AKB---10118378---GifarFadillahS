package com.example.gifar_10118378;

//10118378 - Gifar Fadillah Suryana - IF9 - 8 April 2021
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {
    private int waktu_loading=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run () {
                //setelah loading maka akan langsung berpindah ke home activity
                Intent loginIntent =new Intent(SplashActivity.this, LoginActivity.class);

                startActivity(loginIntent);
                finish();
            }

        }, 3000);



    }
}