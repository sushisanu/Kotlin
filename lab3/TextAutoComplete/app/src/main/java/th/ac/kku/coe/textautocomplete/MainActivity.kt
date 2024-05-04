package th.ac.kku.coe.textautocomplete

import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val country = findViewById<AutoCompleteTextView>(R.id.autocomplete_country)
        val firstName = findViewById<EditText>(R.id.edit_firstName)
        val lastName = findViewById<EditText>(R.id.edit_lastName)
        findViewById<EditText>(R.id.edit_firstName).setOnEditorActionListener { v, actionId, event ->
            return@setOnEditorActionListener when (actionId) {
                EditorInfo.IME_ACTION_SEND -> {
                    val message = firstName.text.toString()
                    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
                    true
                }
                else -> false
            }
        }

        val countries: Array<out String> = resources.getStringArray(R.array.countries_array)
        ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries).also { adapter ->
            country.threshold=0
            country.setAdapter(adapter)
        }
    }



    private val COUNTRIES = arrayOf(
        "Belgium", "France", "Italy", "Germany", "Spain"
    )
}