package com.example.mvvmcleanarch.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.mvvmcleanarch.ui.nav.MyTopAppBarScaffold
import com.example.mvvmcleanarch.ui.nav.MyRoute

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .padding(16.dp)
    ) {
        Text(text = "Main Screen")
        Button(
            onClick = { navController.navigate(MyRoute.MyList.route) }
        ) {
            Text("Click")
        }
    }
}