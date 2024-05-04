package th.ac.kku.coe.fragmentstutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.commit

public final class ExampleFragment : Fragment(R.layout.example_fragment) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val View = inflater?.inflate(
            R.layout.main_fragment,
            container, false
        )

        val button = View.findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val editText = view?.findViewById<EditText>(R.id.editText)
            val resultText = view?.findViewById<TextView>(R.id.textView)
            resultText?.text = editText?.text.toString()
        }
        return View
    }
}