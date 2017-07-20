package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    int mWidth;
    int mHeight;
    int count = 5;
    int gap;
    Paint mTxtPaint = new TextPaint();


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
        gap = mWidth / 10 * 8 / count;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        mTxtPaint.setTextAlign(Paint.Align.CENTER);
        mPaint.setColor(Color.WHITE);
        canvas.drawLine(mWidth / 10, mHeight / 10, mWidth / 10, mHeight / 10 * 9, mPaint);
        canvas.drawLine(mWidth / 10, mHeight / 10 * 9, mWidth / 10 * 9, mHeight / 10 * 9, mPaint);
        canvas.translate(mWidth / 10, mHeight / 10 * 9);
        canvas.drawCircle(0, 0, 10, mPaint);
        mPaint.setColor(Color.GREEN);
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                canvas.translate(gap / 2, 0);
            } else {
                canvas.translate(gap, 0);
            }
            canvas.drawCircle(0, 0, 10, mPaint);
            canvas.drawRect(-gap / 2 + 10, -new Random().nextInt(500), gap / 2 - 10, 0, mPaint);
            canvas.drawText("Jack", 0, 20, mTxtPaint);
        }

    }
}
