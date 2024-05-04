package th.ac.kku.coe.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

   fun sendMessage(view: view){
    val editText = findViewById<EditText>(R.id.editTextTextPersonName)
       val message = editText.text.toString()
       val intent = Intent(this, ::class.java).apply {
           putExtra(EXTRA_MESSAGE, message
           )
       }
       startActivity(intent)
   }

}
