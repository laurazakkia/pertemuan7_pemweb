package com.example.mobilepert7

import android.content.Context
import android.content.Intent
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class CustomViewPost(context: Context, attrs: AttributeSet?) : View(context, attrs) {


    private val xBounds = android.graphics.Rect(40, 30, 80, 90)

    private val paint = Paint().apply {
        color = Color.BLACK
        textSize = 60f
        isAntiAlias = true
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.drawText("X", 40f, 80f, paint)

        canvas.drawCircle(90f, 220f, 60f, paint)

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if (event?.action == MotionEvent.ACTION_DOWN) {
            val x = event.x.toInt()
            val y = event.y.toInt()

            if (xBounds.contains(x, y)) {
                val intent = Intent(context, MainActivity::class.java)
                context.startActivity(intent)
                return true
            }
        }
        return super.onTouchEvent(event)
    }
}
