package th.ac.kku.coe.fragmentstutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        passValues()
    }

    private fun passValues() {
        val data = "KKU"
        val bundle = Bundle().apply {
            putString("EXTRA_KEY", data)
        }
        val fragment = MainFragment().apply {
            arguments = bundle
        }

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
            .commit()
    }
}