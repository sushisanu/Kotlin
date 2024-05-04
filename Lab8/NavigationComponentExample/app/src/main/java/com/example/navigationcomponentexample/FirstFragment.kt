package com.example.navigationcomponentexample

import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.CompoundButton
import android.widget.RelativeLayout
import android.widget.ToggleButton
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_first.view.*
import timber.log.Timber

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        Timber.i("onCreate Called")

    }
    

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        Timber.i("onCreateView Called")

        val toggle = view.findViewById<ToggleButton>(R.id.tgl_butt)
        toggle.setOnCheckedChangeListener{Button, isChecked: Boolean ->
            if(isChecked) {
                view.fragmentFirstButton.setOnClickListener{

                    view.findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
                }
            } else {
                view.fragmentFirstButton.setOnClickListener{
                    view.findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
                }
            }
        }

        view.fragmentFirstButton.setOnClickListener{


            view.findNavController().navigate(R.id.action_firstFragment_to_secondFragment)

        }

        setHasOptionsMenu(true)
        return view
    }

    private fun navigateByActionId(view: View) {
        view.findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
    }

    private fun navigateByDirection(view: View) {
        val direction = FirstFragmentDirections.actionFirstFragmentToSecondFragment(
            message = "Kapow moo sub",
            number = 45
        )
        view.findNavController().navigate(direction)
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
                ||super.onOptionsItemSelected(item)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Timber.i("onViewCreated Called")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Timber.i("onAttach Called")
    }

    override fun onStart() {
        super.onStart()
        Timber.i("onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Timber.i("onResume Called")
    }
    override fun onPause() {
        super.onPause()
        Timber.i("onPause Called")
    }
    override fun onStop() {
        super.onStop()
        Timber.i("onStop Called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Timber.i("onDestroyView Called")
    }



    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FirstFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FirstFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}