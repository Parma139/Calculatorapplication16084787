package com.example.calculator_application_16084787;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;        //for View
import android.widget.ImageView; // for linking the ImageView object
import android.view.MotionEvent; //for touch and drag event
import android.widget.Button;
import android.widget.TextView;



public class MainActivity<numb1, numb2> extends AppCompatActivity {

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




        // code for number

        int numb1 = 3;
        int numb2 = 2;
        TextView myTextView;
        int check;

       // load the question
        myTextView = (TextView)findViewById(R.id.ques);
        myTextView.setText( String.valueOf(numb1) + "  +  " + String.valueOf(numb2) + "  =  " );
        // end for loading the question
/**
        int result = numb1 + numb2;
        TextView output = findViewById(R.id.resultTest);
        check = output.getText().length();
         if (check == result){
             myTextView = (TextView)findViewById(R.id.check);
             myTextView.setText( "hey it is correct" );

         }else
          {
              myTextView = (TextView)findViewById(R.id.check);
              myTextView.setText( "answer is wrong" );
         }

****/

        //code for number
    }


//code for button
    int button5;
    public void button5Click(View v){
        TextView output = findViewById(R.id.resultTest);
        output.setText("5");
        button5 = 5;

        int numb1 = 2;
        int numb2 = 3;
        
        int result = numb1 + numb2;
       // TextView inuput = findViewById(R.id.resultTest);
       // int check = inuput.getText().length();   //these two lines to find out how convert textview into string
        TextView myTextView;
        if (button5 == result){
            myTextView = (TextView)findViewById(R.id.check);
            myTextView.setText( "hey it is correct" + "check = " + button5  );

        }else
        {
            myTextView = (TextView)findViewById(R.id.check);
            myTextView.setText( "answer is wrong" );
        }

           }
    // end code for button




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