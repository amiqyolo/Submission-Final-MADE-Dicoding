package com.aplen.setting.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.aplen.core.ui.ViewModelFactory
import com.aplen.movieaplen.MyApplication
import com.aplen.movieaplen.ui.main.MainActivity
import com.aplen.movieaplen.ui.main.MainViewModel
import com.aplen.setting.databinding.FragmentSettingBinding
import com.aplen.setting.di.DaggerSettingComponent
import javax.inject.Inject

class SettingFragment : Fragment() {

    @Inject
    lateinit var factory: ViewModelFactory

    private var _binding: FragmentSettingBinding? = null
    private val binding get() = _binding

    private val viewModel: SettingViewModel by viewModels { factory }

    private val mainViewModel: MainViewModel by viewModels({ activity as MainActivity }) { factory }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSettingBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        val appComponent = (requireActivity().application as MyApplication).appComponent
        DaggerSettingComponent.factory().create(appComponent).inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            mainViewModel.themeSetting.observe(viewLifecycleOwner) { isDarkActive ->
                if (isDarkActive) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                    binding?.switchTheme?.isChecked = true
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                    binding?.switchTheme?.isChecked = false
                }

                binding?.switchTheme?.setOnCheckedChangeListener { _: CompoundButton?, isChecked: Boolean ->
                    viewModel.saveThemeSetting(isChecked)
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}