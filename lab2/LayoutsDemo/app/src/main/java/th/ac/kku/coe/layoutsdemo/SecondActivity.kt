package th.ac.kku.coe.layoutsdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun changeAct2(view: View) {
        val main = findViewById<LinearLayout>(R.id.activity_main)
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}