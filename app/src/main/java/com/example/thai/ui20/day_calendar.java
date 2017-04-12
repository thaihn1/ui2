package com.example.thai.ui20;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ViewFlipper;

public class day_calendar extends WearableActivity {

    ViewFlipper viewFlipper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_calendar);

        viewFlipper = (ViewFlipper) this.findViewById(R.id.viewFlipper);
        //viewFlipper.addView();
        //viewFlipper.setOnClickListener(this);
    }

    public void writeSummary(){

    }

    public void onButtonDown (View v){
        viewFlipper.setInAnimation(this, R.anim.low_to_high_enter);
        viewFlipper.setOutAnimation(this,R.anim.low_to_high_out);
        viewFlipper.showNext();
    }

    public void onButtonUp (View v){
        viewFlipper.setInAnimation(this, R.anim.high_to_low_enter);
        viewFlipper.setOutAnimation(this,R.anim.high_to_low_out);
        viewFlipper.showPrevious();
    }

/*
    public boolean onTouchEvent(MotionEvent event){
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                // Getting initial by event action down
                initialX = event.getY();
                break;

            case MotionEvent.ACTION_UP:

                // On action up the flipper will start and showing next item
                float finalX = event.getY();
                if (initialX > finalX) {

                    // Show items are 4
                    if (viewFlipper.getDisplayedChild() == 2)
                        break;

                    // Flip show next will show next item
                    viewFlipper.showNext();
                } else {

                    // If flip has no items more then it will display previous item
                    if (viewFlipper.getDisplayedChild() == 0)
                        break;
                    viewFlipper.showPrevious();
                }
                break;
        }
        return false;
    }
*/

    public void backToMenu(View v) {
        Intent openMainActivity = new Intent(day_calendar.this, MainActivity.class);
        openMainActivity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(openMainActivity);

        finish();
    }


}
