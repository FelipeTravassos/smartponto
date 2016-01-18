package com.smartponto.fst.smartponto;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private final int SPLASH_TIME = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {

            new CountDownTimer(this.SPLASH_TIME, 1000) {
                public void onTick(long millisUntilFinished) {

                }

                public void onFinish() {
                    Intent intent = new Intent(MainActivity.this, SmartPonto.class);

                    startActivity(intent);
                    finish();
                    // this.cancel();
                }
            }.start();
        }

    }
}
