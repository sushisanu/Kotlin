package th.ac.kku.coe.colormyviewver2

import android.R.color.holo_green_light
import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    
    private fun setListeners() {
        val box_one = findViewById<View>(R.id.box_one_text)
        val box_two = findViewById<View>(R.id.box_two_text)
        val box_three = findViewById<View>(R.id.box_three_text)
        val box_four = findViewById<View>(R.id.box_four_text)
        val box_five = findViewById<View>(R.id.box_five_text)
        val butt_red = findViewById<Button>(R.id.red_button)
        butt_red.setOnClickListener { view ->
            box_three.setBackgroundResource(R.color.my_red)
        }
        val butt_yellow = findViewById<Button>(R.id.yellow_button)
        butt_yellow.setOnClickListener { view ->
            box_four.setBackgroundResource(R.color.my_yellow)
        }
        val butt_green = findViewById<Button>(R.id.green_button)
        butt_green.setOnClickListener { view ->
            box_five.setBackgroundResource(R.color.my_green2)
        }

        val clickableViews: List<View> = listOf(box_one, box_two,
                box_three, box_four, box_five)
        for (item in clickableViews) {
            item.setOnClickListener{makeColor(it)}
        }
    }

    @SuppressLint("ResourceAsColor")
    private fun makeColor(view: View) {

        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundResource(R.color.my_green)
            R.id.box_four_text -> view.setBackgroundResource(R.color.dark_green)
            R.id.box_five_text -> view.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.GRAY)
        }
    }
}