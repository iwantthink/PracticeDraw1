package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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
        canvas.translate(mWidth/4,mHeight/4);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        canvas.drawArc(-200,-100,200,100,0,90,true,mPaint);
        mPaint.setColor(Color.RED);
        canvas.drawArc(-200,-100,200,100,90,90,false,mPaint);
        mPaint.setColor(Color.GREEN);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(-200,-100,200,100,180,90,false,mPaint);
        mPaint.setColor(Color.BLUE);
    }
}
