package com.example.mvvmcleanarch.ui.nav

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvmcleanarch.ui.view.MainScreen
import com.example.mvvmcleanarch.ui.view.MyList
import com.example.mvvmcleanarch.viewmodel.MyListViewModel

@Composable
fun MyNavController() {
    val navController = rememberNavController()
    val onBackClick: () -> Unit = { navController.navigateUp() }

    NavHost(navController = navController, startDestination = MyRoute.MainScreen.route) {
        composable(route = MyRoute.MainScreen.route) {
            MainScreen(
                navController = navController
            )
        }
        composable(route = MyRoute.MyList.route) {
            MyList(
                navController = navController,
                onBackClick = onBackClick
            )
        }
    }

}
// Init navigation Controller Object "rememberNavController()"
// NavHost (navController, startDestination)) {many composable}
// navController.navigate (route)