package com.example.etl_app.ui.screens.login

import androidx.lifecycle.ViewModel
import androidx.navigation.NavHostController
import com.example.etl_app.ui.util.Routes

class LoginViewModel: ViewModel() {

    fun doLogin(navController: NavHostController){
        navController.navigate(Routes.Home.route){
            popUpTo(Routes.Login.route){
                inclusive = true
            }
        }
    }
}