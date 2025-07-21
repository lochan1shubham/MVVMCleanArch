package com.example.mvvmcleanarch.viewmodel

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.example.domain.repository.MyRepoDomain
import com.example.mvvmcleanarch.base.BaseViewModel
import com.example.mvvmcleanarch.ui.contractforstateandevent.MyListUiEvent
import com.example.mvvmcleanarch.ui.contractforstateandevent.MyListViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MyListViewModel @Inject constructor(
private val myRepoDomain: MyRepoDomain
) : BaseViewModel<MyListUiEvent, MyListViewState>( MyListViewState() ) {
    val coroutineException = CoroutineExceptionHandler { _, exception ->
        exception.message?.let { Log.d("Coroutine Exception::", it) }
        updateViewState { lsState ->
            lsState.copy(
                isShowProgress = false
            )
        }
    }

    override fun onUIEvent(uiEvent: MyListUiEvent) = null

    init {
        loadTodos()
    }

    private fun loadTodos() {
        viewModelScope.launch(coroutineException) {
            val todos = myRepoDomain.getTodo()
            if(todos.isNotEmpty()){
                updateViewState { lsState ->
                    lsState.copy(
                        isShowProgress = false,
                        myTodoModels = todos
                    )
                }
            }
        }
    }

}