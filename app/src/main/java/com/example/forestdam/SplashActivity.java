package com.example.forestdam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    final long tiempocarga = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    private void startLogin(){
        startActivity(new Intent(SplashActivity.this,LoginActivity.class));
        //cuando se cierra de memoria el activity
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        new Handler().postDelayed(() -> startLogin(),tiempocarga);
    }
}