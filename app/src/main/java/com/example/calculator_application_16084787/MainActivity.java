package com.example.calculator_application_16084787;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;        //for View
import android.widget.ImageView; // for linking the ImageView object
import android.view.MotionEvent; //for touch and drag event


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView apple1 = (ImageView) findViewById(R.id.apple1);
        apple1.setOnTouchListener(handleTouch);

        ImageView apple2 = (ImageView) findViewById(R.id.apple2);
        apple2.setOnTouchListener(handleTouch);

        ImageView apple3 = (ImageView) findViewById(R.id.apple3);
        apple3.setOnTouchListener(handleTouch);

        ImageView apple4 = (ImageView) findViewById(R.id.apple4);
        apple4.setOnTouchListener(handleTouch);

        ImageView apple5 = (ImageView) findViewById(R.id.apple5);
        apple5.setOnTouchListener(handleTouch);

        ImageView apple6 = (ImageView) findViewById(R.id.apple6);
        apple6.setOnTouchListener(handleTouch);

        ImageView apple7 = (ImageView) findViewById(R.id.apple7);
        apple7.setOnTouchListener(handleTouch);

        ImageView apple8 = (ImageView) findViewById(R.id.apple8);
        apple8.setOnTouchListener(handleTouch);

        ImageView apple9 = (ImageView) findViewById(R.id.apple9);
        apple9.setOnTouchListener(handleTouch);

        ImageView apple10 = (ImageView) findViewById(R.id.apple10);
        apple10.setOnTouchListener(handleTouch);

    }

    private View.OnTouchListener handleTouch = new View.OnTouchListener() {
        float dX, dY;
        @Override
        public boolean onTouch(View view, MotionEvent event) {

            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    dX = view.getX() - event.getRawX();
                    dY = view.getY() - event.getRawY();
                    break;
                case MotionEvent.ACTION_MOVE:
                    view.animate()
                            .x(event.getRawX() + dX)
                            .y(event.getRawY() + dY)
                            .setDuration(0)
                            .start();
                    break;
                default:
                    return false;
            }
            return true;
        }
    };


}