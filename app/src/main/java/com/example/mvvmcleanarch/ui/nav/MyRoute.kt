package com.example.mvvmcleanarch.ui.nav

sealed class MyRoute(val route: String) {
    object MainScreen: MyRoute("main_screen")
    object MyList : MyRoute("my_list")
}