package com.kat.androidwtest.screen

import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.kat.androidwtest.databinding.FragmentSplashBinding
import com.kat.androidwtest.screen.viewmodel.SplashViewModel
import com.kat.androidwtest.util.Constants
import com.kat.core.navigation.navigation.AppNavigation
import org.koin.android.ext.android.inject

class SplashFragment : Fragment() {

    private lateinit var binding: FragmentSplashBinding
    private val viewModel: SplashViewModel by viewModels()
    private val navigation: AppNavigation by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.downloadPostalCodes()

        object : CountDownTimer(Constants.COUNT_MILLIS_IN_FUTURE.toLong(), Constants.COUNT_INTERVAL.toLong()) {
            override fun onTick(millisUntilFinished: Long) {
                Log.d(SplashFragment::class.simpleName, "$millisUntilFinished")
            }

            override fun onFinish() {
                navigation.openHome(requireActivity())
            }
        }
    }

}