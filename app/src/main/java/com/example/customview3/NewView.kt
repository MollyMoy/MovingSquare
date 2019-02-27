package com.example.customview3

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.provider.Settings.Global.getString
import android.util.AttributeSet
import android.view.View
import android.widget.TextView


class NewView (context: Context, attrs: AttributeSet) : View(context, attrs) {

   // val text: TextView = findViewById(R.id.loader)


    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private var rect1Color = Color.BLACK
    private var startingPoint = 200f



    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
//white background
        canvas.drawRGB(255, 255, 255);
//border's properties
        paint.color = rect1Color
        paint.setStrokeWidth(0f)
        paint.style = Paint.Style.STROKE
        canvas.drawRect(startingPoint, 200f, startingPoint+200, 400f, paint)

        startingPoint++

        invalidate()

    }

}

