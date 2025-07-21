package com.example.mvvmcleanarch.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.domain.model.MyTodoModel
import com.example.mvvmcleanarch.ui.nav.MyTopAppBarScaffold
import com.example.mvvmcleanarch.viewmodel.MyListViewModel

@Composable
fun MyList(
    navController: NavHostController,
    onBackClick: () -> Unit,
    viewModel: MyListViewModel = hiltViewModel()
) {
    val uiState = viewModel.viewStateFlow.collectAsState().value

    MyTopAppBarScaffold(
        title = "My List",
        onBackClick = onBackClick
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            Text(
                text = "My List",
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold
            )
            if (uiState.isShowProgress){
               ShowProgress()
            }
            else {
                uiState.myTodoModels?.let {
                    ListContent(uiState.myTodoModels)
                }
            }

        }
    }
}

@Composable
fun ListContent(myTodoModels: List<MyTodoModel>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        item {
            Text(
                text = "My List",
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold
            )
        }
        items(myTodoModels){
            myTodo -> ListItem(myTodo)
        }
    }
}

@Composable
fun ListItem(myTodo: MyTodoModel) {
    Text(
        text = myTodo.title
    )
}

@Composable
fun ShowProgress() {
    CircularProgressIndicator(
        modifier = Modifier.width(50.dp)
    )
}
