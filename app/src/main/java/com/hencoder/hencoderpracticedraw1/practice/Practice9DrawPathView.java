package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        Path path = new Path();
        mPaint.setColor(Color.RED);
        mPaint.setStyle(Paint.Style.STROKE);
        path.moveTo(280, 191);
        path.cubicTo(336, 61, 548, 251, 280, 387);
        canvas.drawPath(path, mPaint);
        canvas.translate(600, 200);
        path = new Path();
        path.moveTo(0, 0);
//        path.addCircle(0, 0, 5, Path.Direction.CW);
//        path.addRect(0, -50, 100, 0, Path.Direction.CW);
        path.addArc(0, -50, 100, 50, 0, -225);
        path.lineTo(100, (float) ((Math.sqrt(2) + 1) * 50));
//        path.addCircle(100,(float) ((Math.sqrt(2) + 1) * 50),55, Path.Direction.CW);

//        path.addRect(100, -50, 200, 0, Path.Direction.CW);
        path.addArc(100, -50, 200, 50, 180, 225);
        path.lineTo(100, (float) ((Math.sqrt(2) + 1) * 50));
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawPath(path, mPaint);
        canvas.drawLine(100, -200, 100, 200, mPaint);
    }
}
