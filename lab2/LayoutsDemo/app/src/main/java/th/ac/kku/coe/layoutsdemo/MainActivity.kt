package th.ac.kku.coe.layoutsdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changeAct(view: View) {
        val main = findViewById<LinearLayout>(R.id.activity_main)
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

}