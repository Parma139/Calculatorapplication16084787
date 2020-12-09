package com.example.calculator_application_16084787;

import androidx.appcompat.app.AppCompatActivity;



import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;        //for View
import android.widget.ImageView; // for linking the ImageView object
import android.view.MotionEvent; //for touch and drag event
import android.widget.TextView;
import android.view.animation.AlphaAnimation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.view.animation.Animation;


import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hideStar();

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

        displayQ();
    }

    //code for ques nad resutl output
        MediaPlayer musicP, musicR, musicW;

        TextView myTextView;
        int result;
        Random r1 = new Random();
        int numb1 = r1.nextInt(4);

        Random r2 = new Random();
        int numb2 = r2.nextInt(4);

    public void displayQ(){
        numb1 = r1.nextInt(4);
        numb2 = r2.nextInt(4);

        myTextView = (TextView) findViewById(R.id.ques);
        myTextView.setText(String.valueOf("   " + numb1 + "  +  " + (numb2) + "  =  " ));

        myTextView = (TextView) findViewById(R.id.resultTest);
        myTextView.setText(String.valueOf("?"));
    }


    //code ned for ques and result

       View starView;
       View starView1;
       View starView2;
       View starView3;
       View playAgain;
       View showF;

    public void hideStar() {

       starView = (View) findViewById(R.id.star);
       starView.setVisibility(View.INVISIBLE);
       starView1 = (View) findViewById(R.id.img2);
       starView1.setVisibility(View.INVISIBLE);
       starView2 = (View) findViewById(R.id.img3);
       starView2.setVisibility(View.INVISIBLE);
       starView3 = (View) findViewById(R.id.star3);
       starView3.setVisibility(View.INVISIBLE);
       showF = (View) findViewById(R.id.showF);
       showF.setVisibility(View.INVISIBLE);
       playAgain = (View) findViewById(R.id.playAgain);
       playAgain.setVisibility(View.INVISIBLE);
       playAgain = (View) findViewById(R.id.bgChange);
       playAgain.setVisibility(View.INVISIBLE);
       starView = (View) findViewById(R.id.updir);
       starView.setVisibility(View.INVISIBLE);

    }

    public void showStar() {

        starView = (View) findViewById(R.id.star);
        starView.setVisibility(View.VISIBLE);
        starView1 = (View) findViewById(R.id.img2);
        starView1.setVisibility(View.VISIBLE);
        starView2 = (View) findViewById(R.id.img3);
        starView2.setVisibility(View.VISIBLE);
        starView3 = (View) findViewById(R.id.star3);
        starView3.setVisibility(View.VISIBLE);
        showF = (View) findViewById(R.id.showF);
        playAgain = (View) findViewById(R.id.playAgain);
        playAgain.setVisibility(View.VISIBLE);
        showF.setVisibility(View.VISIBLE);
        playAgain = (View) findViewById(R.id.bgChange);
        playAgain.setVisibility(View.VISIBLE);
        starView = (View) findViewById(R.id.updir);
        starView.setVisibility(View.VISIBLE);
    }


        ImageView star;
        ImageView star1;
        ImageView star2;
        ImageView star3;


    public void rotateStar(){

        ScaleAnimation scale;
        TranslateAnimation trans;
        RotateAnimation rotate;
        AlphaAnimation alpha;

        star = (ImageView) findViewById(R.id.star);
        scale = new ScaleAnimation(0, 1, 0, 1);
        scale.setDuration(6000);
        scale.setRepeatCount(Animation.INFINITE);
        star.startAnimation(scale);

        star = (ImageView) findViewById(R.id.img2);
        scale = new ScaleAnimation(0, 1, 0, 1);
        scale.setDuration(6000);
        scale.setRepeatCount(Animation.INFINITE);
        star.startAnimation(scale);

        star = (ImageView) findViewById(R.id.img3);
        scale = new ScaleAnimation(1, 0, 1, 0);
        scale.setDuration(6000);
        scale.setRepeatCount(Animation.INFINITE);
        star.startAnimation(scale);

        star3 = (ImageView) findViewById(R.id.star3);
        scale = new ScaleAnimation(1, 0, 1, 0);
        scale.setDuration(6000);
        scale.setRepeatCount(Animation.INFINITE);
        star3.startAnimation(scale);



    }

    public void stopRotation(){
        star = (ImageView) findViewById(R.id.star);
        star.clearAnimation();
        star1 = (ImageView) findViewById(R.id.img2);
        star1.clearAnimation();
        star2 = (ImageView) findViewById(R.id.img3);
        star2.clearAnimation();
        star3 = (ImageView) findViewById(R.id.star3);
        star3.clearAnimation();

    }

    public void playRans (){
        musicR = MediaPlayer.create(this, R.raw.rightanswer);
        musicR.start();
    }

    public void playWans (){
        musicW = MediaPlayer.create(this, R.raw.wronganswer);
        musicW.start();
    }

    public void playaAgainmusic (){
        musicP = MediaPlayer.create(this, R.raw.playagainbutton);
        musicP.start();
    }

    public void stopMusic(){
        musicR.stop();
    }



    int button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;

    public void button0Click(View v) {
        TextView output = findViewById(R.id.resultTest);
        output.setText( "0");
        button0 = 0;
        ansCheck();
    }

    public void button1Click(View v) {
        TextView output = findViewById(R.id.resultTest);
        output.setText( "1");
        button1 = 1;
        ansCheck();
    }

    public void button2Click(View v) {
        TextView output = findViewById(R.id.resultTest);
        output.setText("2");
        button2 = 2;
        ansCheck();
    }

    public void button3Click(View v) {
        TextView output = findViewById(R.id.resultTest);
        output.setText("3");
        button3 = 3;
        ansCheck();
    }

    public void button4Click(View v) {
        TextView output = findViewById(R.id.resultTest);
        output.setText("4");
        button4 = 4;
        ansCheck();
    }

    public void button5Click(View v){
        TextView output = findViewById(R.id.resultTest);
        output.setText("5");
        button5 = 5;
        ansCheck();
    }

    public void button6Click(View v) {
        TextView output = findViewById(R.id.resultTest);
        output.setText("6");
        button6 = 6;
        ansCheck();
    }

    public void button7Click(View v) {
        TextView output = findViewById(R.id.resultTest);
        output.setText("7");
        button7 = 7;
        ansCheck();
    }

    public void button8Click(View v) {
        TextView output = findViewById(R.id.resultTest);
        output.setText("8");
        button8 = 8;
        ansCheck();
    }

    public void button9Click(View v) {
        TextView output = findViewById(R.id.resultTest);
        output.setText("9");
        button9 = 9;
        ansCheck();
    }

    public void playAgain(View v) {
        playaAgainmusic();
        stopMusic();
        stopRotation();
        hideStar();
        displayQ();
    }


    public void ansCheck (){

        String checkS;
        int checkI;

        TextView outes = findViewById(R.id.resultTest);
        checkS = outes.getText().toString();
        checkI = Integer.parseInt(checkS);

        result = numb1 + numb2;

          if (checkI == result){
            myTextView = (TextView) findViewById(R.id.showF);
            myTextView.setText(String.valueOf("    "+ numb1 + " + " + (numb2) + " = "  + (result)));

              playRans();
              rotateStar();
              showStar();
          }
              else{
                TextView output = findViewById(R.id.resultTest);
                output.setText("?");
                playWans();


              }
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