package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    int mWidth;
    int mHeight;


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(Color.GREEN);
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        canvas.translate(mWidth / 2, mHeight / 2);
        canvas.drawArc(-200, -200, 200, 200, 0, 30, true, mPaint);
        canvas.rotate(15);
        canvas.translate(200, 0);
        canvas.drawCircle(0, 0, 5, mPaint);
        canvas.drawLine(0, 0, 50, 0, mPaint);
        canvas.translate(50, 0);
        canvas.rotate(-15);
        canvas.drawLine(0, 0, 50, 0, mPaint);

    }
}
