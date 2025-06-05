package com.example.mvvmcleanarch.viewmodel

import androidx.lifecycle.viewModelScope
import com.example.domain.repository.MyRepoDomain
import com.example.mvvmcleanarch.base.BaseViewModel
import com.example.mvvmcleanarch.ui.contractforstateandevent.MyListUiEvent
import com.example.mvvmcleanarch.ui.contractforstateandevent.MyListViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MyListViewModel @Inject constructor(
private val myRepoDomain: MyRepoDomain
) : BaseViewModel<MyListUiEvent, MyListViewState>( MyListViewState() ) {

    override fun onUIEvent(uiEvent: MyListUiEvent) = null

    init {
        loadTodos()
    }

    private fun loadTodos() {
//        viewModelScope.launch {
//            val todos = myRepoDomain.getTodo()
//        }
    }

}