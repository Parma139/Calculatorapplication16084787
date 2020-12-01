package com.example.calculator_application_16084787;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;        //for View
import android.widget.ImageView; // for linking the ImageView object
import android.view.MotionEvent; //for touch and drag event
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;




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

        Random r1 = new Random();
        int numb1 = r1.nextInt(4);

        Random r2 = new Random();
        int numb2 = r2.nextInt(4);

        String symbol1 = "+";
        String symbol2 = "=";


        TextView myTextView;


          myTextView = (TextView)findViewById(R.id.ques1);
          myTextView.setText( String.valueOf(numb1) );

         myTextView = (TextView)findViewById(R.id.symbol1);
         myTextView.setText(symbol1);

          myTextView = (TextView)findViewById(R.id.ques2);
        myTextView.setText( String.valueOf(numb2) );


         myTextView = (TextView)findViewById(R.id.symbol2);
        myTextView.setText( symbol2 );

        // code for ques1 and ques2
    }


//code for button
    int button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    TextView myTextView;

    public void button0Click(View v) {
        TextView output = findViewById(R.id.resultTest);
        output.setText("0");
        button0 = 0;
        display();
    }

    public void button1Click(View v) {
        TextView output = findViewById(R.id.resultTest);
        output.setText("1");
        button1 = 1;
        display();
    }

    public void button2Click(View v) {
        TextView output = findViewById(R.id.resultTest);
        output.setText("2");
        button2 = 2;
        display();
    }

    public void button3Click(View v) {
        TextView output = findViewById(R.id.resultTest);
        output.setText("3");
        button3 = 3;
        display();
    }

    public void button4Click(View v) {
        TextView output = findViewById(R.id.resultTest);
        output.setText("4");
        button4 = 4;
        display();
    }

    public void button5Click(View v){
        TextView output = findViewById(R.id.resultTest);
        output.setText("5");
        button5 = 5;
        display();
    }

    public void button6Click(View v) {
        TextView output = findViewById(R.id.resultTest);
        output.setText("6");
        button6 = 6;
        display();
    }

    public void button7Click(View v) {
        TextView output = findViewById(R.id.resultTest);
        output.setText("7");
        button7 = 7;
        display();
    }

    public void button8Click(View v) {
        TextView output = findViewById(R.id.resultTest);
        output.setText("8");
        button8 = 8;
        display();
    }

    public void button9Click(View v) {
        TextView output = findViewById(R.id.resultTest);
        output.setText("9");
        button9 = 9;
        display();
    }



    //end code for button

    //function that check answer is right or wrong

    public void display (){

        String checkS;
        int checkI;

        String checkq1S;
        int checkq1I;

        String checkq2S;
        int checkq2I;

        int result = 0;
        TextView outes = findViewById(R.id.resultTest);
        checkS = outes.getText().toString();
        checkI = Integer.parseInt(checkS);

        TextView outq1 = findViewById(R.id.ques1);
        checkq1S = outq1.getText().toString();
        checkq1I = Integer.parseInt(checkq1S);


        TextView outq2 = findViewById(R.id.ques2);
        checkq2S = outq2.getText().toString();
        checkq2I = Integer.parseInt(checkq2S);

        result = checkq1I + checkq2I;

        if (checkI == result){
            Toast.makeText(this, "This is correct answer",Toast.LENGTH_SHORT).show();
        }else
        {
            Toast.makeText(this, "This is wrong answer",Toast.LENGTH_SHORT).show();
        }

    }
    // end function that check answer is right or wrong


    //function that check listen touch listener
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

    // end function that check listen touch listener


}