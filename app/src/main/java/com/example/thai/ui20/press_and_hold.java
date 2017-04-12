package com.example.thai.ui20;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.ImageView;
import android.os.Vibrator;

public class press_and_hold extends WearableActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_press_and_hold);
        final ImageView hold_button = (ImageView) findViewById(R.id.hold_button);
        hold_button.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                Vibrator vibrate_button = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrate_button.vibrate(100);
                Intent intent = new Intent(press_and_hold.this, day_calendar.class);
                startActivity(intent);
                return false;
            }
        });
    }

    public void backToMenu(View v) {

        Intent openMainActivity = new Intent(press_and_hold.this, MainActivity.class);
        openMainActivity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(openMainActivity);
        finish();
    }

/*    public void day_calendar(View v) {
        Intent intent = new Intent(this, day_calendar.class);
        startActivity(intent);

    }*/
}
