package com.example.smartniece;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class DrawingShapes extends View{

	public DrawingShapes(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		
		
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		
		Rect jRect = new Rect();
		jRect.set(100, 200, 200, 100);
		
		Rect jRect2 = new Rect();
		jRect.set(250, 350, 100, 100);
		
		Paint jblue = new Paint();
		jblue.setColor(Color.BLUE);
		jblue.setStyle(Paint.Style.FILL);
		
		Paint jRed = new Paint();
		jblue.setColor(Color.RED);
		jblue.setStyle(Paint.Style.FILL);
		
		canvas.drawRect(jRect, jblue);
		canvas.drawRect(jRect2, jRed);
		
		
		
		
	}

}
