package com.example.thai.ui20;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;

public class HeartRateOnly extends WearableActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_rate_only);
    }

    public void backToMenu(View v) {
        Intent openMainActivity = new Intent(HeartRateOnly.this, MainActivity.class);
        openMainActivity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(openMainActivity);

        finish();
    }

    public void threebuttons(View v) {
        Intent intent = new Intent(this, threebuttons.class);
        startActivity(intent);

    }
}
