package com.example.mvvmcleanarch.ui.contractforstateandevent

import androidx.compose.runtime.Immutable
import com.example.domain.model.MyTodoModel
import com.example.mvvmcleanarch.base.BaseUiEvent
import com.example.mvvmcleanarch.base.BaseViewState

@Immutable
data class MyListViewState (
    val isShowProgress: Boolean = true,
    val items : List<MyTodoModel>? = null
) : BaseViewState

sealed interface MyListUiEvent: BaseUiEvent{
    object LoadList : MyListUiEvent
}