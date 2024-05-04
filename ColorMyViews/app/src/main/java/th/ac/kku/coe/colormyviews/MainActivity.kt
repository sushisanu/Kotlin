package th.ac.kku.coe.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
    }

    private fun setListener() {
        val box1 = findViewById<TextView>(R.id.box_one)
        val box2 = findViewById<TextView>(R.id.box_two)
        val box3= findViewById<TextView>(R.id.box_three)
        val box4 = findViewById<TextView>(R.id.box_four)
        val box5 = findViewById<TextView>(R.id.box_five)

        val constraint_layout = findViewById<ConstraintLayout>(R.id.constraint_layout)

        val bt1 = findViewById<Button>(R.id.button1)
        val bt2 = findViewById<Button>(R.id.button2)
        val bt3 = findViewById<Button>(R.id.button3)

        val clickableViews: List<View> = listOf(box1, box2, box3, box4, box5, constraint_layout, bt1, bt2, bt3)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        val box3= findViewById<TextView>(R.id.box_three)
        val box4 = findViewById<TextView>(R.id.box_four)
        val box5 = findViewById<TextView>(R.id.box_five)

        when (view.id) {
            R.id.box_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two -> view.setBackgroundColor(Color.GRAY)

            R.id.box_three -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.button1 -> box3.setBackgroundResource(R.color.red)
            R.id.button2 -> box4.setBackgroundResource(R.color.yellow)
            R.id.button3 -> box5.setBackgroundResource(R.color.green)

            else ->view.setBackgroundColor(Color.LTGRAY)
        }
    }

}