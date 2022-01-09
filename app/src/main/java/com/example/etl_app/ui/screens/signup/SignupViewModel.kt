package com.example.etl_app.ui.screens.signup

import androidx.lifecycle.ViewModel
import androidx.navigation.NavHostController
import com.example.etl_app.ui.util.Routes

class SignupViewModel: ViewModel() {

    fun doSignup(navController: NavHostController){
        navController.navigate(Routes.Home.route){
            popUpTo(Routes.Signup.route){
                inclusive = true
            }
        }
    }
}