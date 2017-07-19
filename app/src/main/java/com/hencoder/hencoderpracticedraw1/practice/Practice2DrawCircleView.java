package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    int mWidth;
    int mHeight;

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight =h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        canvas.drawLine(0,mHeight/4,mWidth,mHeight/4,mPaint);
        canvas.drawLine(0,mHeight/4*2,mWidth,mHeight/4*2,mPaint);
        canvas.drawLine(0,mHeight/4*3,mWidth,mHeight/4*3,mPaint);

        canvas.drawLine(mWidth/4,0,mWidth/4,mHeight,mPaint);
        canvas.drawLine(mWidth/4*2,0,mWidth/4*2,mHeight,mPaint);
        canvas.drawLine(mWidth/4*3,0,mWidth/4*3,mHeight,mPaint);

        canvas.translate(mWidth/4,mHeight/4);
        canvas.drawCircle(0,0,100,mPaint);

        canvas.translate(mWidth/2,0);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(0,0,100,mPaint);

        canvas.translate(0,mHeight/2);
        mPaint.setStrokeWidth(10);
        canvas.drawCircle(0,0,100,mPaint);

        canvas.translate(-mWidth/2,0);
        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(0,0,100,mPaint);

    }
}
