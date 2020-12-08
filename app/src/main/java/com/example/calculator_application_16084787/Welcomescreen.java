package com.example.calculator_application_16084787;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Welcomescreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomescreen);

        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }
                catch(Exception e){
                        e.printStackTrace();
                }
                finally {
                    Intent intent = new Intent (Welcomescreen.this, MainActivity.class);
                    startActivity(intent);
                }

            }
        }; thread.start();
    }
}