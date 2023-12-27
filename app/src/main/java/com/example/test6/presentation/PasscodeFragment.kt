package com.example.test6.presentation

import android.widget.Toast
import androidx.fragment.app.viewModels
import com.example.test6.R
import com.example.test6.databinding.FragmentPasscodeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PasscodeFragment : BaseFragment<FragmentPasscodeBinding>(FragmentPasscodeBinding::inflate) {
    private val viewModel: PasscodeFragmentViewModel by viewModels()
    private var inputPasscode: String = ""
    private val passcodeDots = with(binding) { listOf(firstNum, secondNum, thirdNum, fourthNum) }

    override fun setUp() {

    }

    override fun listeners() {

    }

    private fun onNumberButtonClick() {
        inputPasscode += binding.btn.text.toString()
        passcodeDots[inputPasscode.length - 1].setBackgroundColor(R.color.green)
        if (inputPasscode.length == 4) {
            if (viewModel.isCorrectPasscode(inputPasscode)) {
                Toast.makeText(requireContext(), getString(R.string.success), Toast.LENGTH_SHORT)
                    .show()
            } else {
                passcodeDots.forEach {
                    it.setBackgroundColor(R.color.gray)
                }
            }
        }
    }

    override fun bindObserves() {

    }
}