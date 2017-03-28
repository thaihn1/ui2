package com.example.thai.ui20;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;

public class threebuttons extends WearableActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threebuttons);
    }

    public void backToMenu(View v) {
        Intent openMainActivity = new Intent(threebuttons.this, MainActivity.class);
        openMainActivity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(openMainActivity);

        finish();
    }

    public void press_and_hold(View v) {
        Intent intent = new Intent(this, press_and_hold.class);
        startActivity(intent);
    }

    public void day_calendar(View v) {
        Intent intent = new Intent(this, day_calendar.class);
        startActivity(intent);
    }
}
