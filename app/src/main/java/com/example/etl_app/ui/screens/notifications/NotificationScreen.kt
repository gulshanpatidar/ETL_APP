package com.example.etl_app.ui.screens.notifications

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.etl_app.ui.components.ScaffoldUse

@Composable
fun NotificationScreen(navController: NavHostController) {
    ScaffoldUse(title = "Notifications", navController = navController, viewModel = null,hasDrawer = true) {
        Text(text = "Hello world")
    }
}