package com.example.mvvmcleanarch.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

abstract class BaseViewModel<E : BaseUiEvent, VS : BaseViewState>(defaultViewState: VS) :
    ViewModel() {
//        ViewState to mutableStateFlow
    private val viewState = MutableStateFlow(defaultViewState)

    // Provide UI state as stateFlow
    val viewStateFlow: StateFlow<VS> = viewState

    protected fun updateViewState(state: (VS) -> VS){
        viewState.update(state)
    }

    abstract fun onUIEvent(uiEvent: E): Any?
}