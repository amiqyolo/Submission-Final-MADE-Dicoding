package com.aplen.setting.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aplen.core.domain.usecase.MovieUseCase
import com.aplen.setting.di.SettingAppScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@SettingAppScope
class SettingViewModel @Inject constructor(private val useCase: MovieUseCase) : ViewModel() {
    fun saveThemeSetting(isDarkModeActive: Boolean) {
        viewModelScope.launch(Dispatchers.Main) {
            useCase.saveThemeSetting(isDarkModeActive)
        }
    }
}