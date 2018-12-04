package com.example.graci.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.graphics.Canvas;

public class MyCanvas extends View {

    Paint paint;
    Rect rect;


    public MyCanvas(Context context) {
        super(context);

        paint = new Paint();
        rect = new Rect();
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        paint.setColor(Color.WHITE);

        canvas.drawRect(0, 0, getWidth()/2, getHeight()/2, paint);

    }
}
