package com.example.etl_app.ui

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.etl_app.ui.screens.home.HomeScreen
import com.example.etl_app.ui.screens.home.HomeViewModel
import com.example.etl_app.ui.screens.login.LoginScreen
import com.example.etl_app.ui.screens.login.LoginViewModel
import com.example.etl_app.ui.screens.notifications.NotificationScreen
import com.example.etl_app.ui.screens.offer.OfferScreen
import com.example.etl_app.ui.screens.profile.ProfileScreen
import com.example.etl_app.ui.screens.signup.SignupScreen
import com.example.etl_app.ui.screens.signup.SignupViewModel
import com.example.etl_app.ui.screens.splash.SplashScreen
import com.example.etl_app.ui.util.Routes

@Composable
fun AppNavigation(navController: NavHostController,viewModel: HomeViewModel) {

    NavHost(navController = navController, startDestination = Routes.Splash.route){
        //splash screen
        composable(Routes.Splash.route){
            SplashScreen(navController = navController)
        }
        //login screen
        composable(Routes.Login.route){
            val loginViewModel = viewModel(modelClass = LoginViewModel::class.java)
            LoginScreen(navController = navController,loginViewModel)
        }
        //signup screen
        composable(Routes.Signup.route){
            val signupViewModel = viewModel(modelClass = SignupViewModel::class.java)
            SignupScreen(navController = navController,signupViewModel)
        }
        //home screen
        composable(Routes.Home.route){
            HomeScreen(viewModel = viewModel,navController = navController)
        }
        //offer screen
        composable(Routes.Offers.route){
            OfferScreen(navController = navController)
        }
        //notifications screen
        composable(Routes.Notifications.route){
            NotificationScreen(navController = navController)
        }
        //profile screen
        composable(Routes.Profile.route){
            ProfileScreen(navController = navController)
        }
    }
}