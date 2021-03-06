package com.grappus.android.basemvvm.views.fragments.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.grappus.android.basemvvm.R
import com.grappus.android.basemvvm.views.fragments.BaseFragment

class LoginFragment : BaseFragment() {


    //Companion object if single instance of fragment is to be maintained
    companion object {
        fun newInstance(args: Bundle?): LoginFragment {
            val fragment = LoginFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun extractData() {
        //Extract data from intent received
    }

    override fun initComponents() {
        //Initialize all the view components
    }

    override fun inflateInitialViews(isVeryFirstRun: Boolean) {
        /************This method will be called every time fragment is shown on UI, *************
         *** boolean tells you whether fragment is attached for first time or from back stack *****/
    }
}