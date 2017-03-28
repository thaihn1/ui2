package com.example.thai.ui20;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;


public class MainActivity extends WearableActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {     // Starts actively taking heart rate (heartratedata)
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void heart_rate_only(View v) {
        Intent intent = new Intent(this, HeartRateOnly.class);
        startActivity(intent);

    }


}

