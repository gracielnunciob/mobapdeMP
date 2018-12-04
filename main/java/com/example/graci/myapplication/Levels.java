package com.example.graci.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Levels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyCanvas canvas = new MyCanvas(this);
        canvas.setBackgroundColor(Color.BLACK);

        setContentView(canvas);

    }

}