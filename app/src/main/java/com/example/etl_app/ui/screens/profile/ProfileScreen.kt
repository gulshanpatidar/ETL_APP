package com.example.etl_app.ui.screens.profile

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.etl_app.ui.components.ScaffoldUse

@Composable
fun ProfileScreen(navController: NavHostController) {
    ScaffoldUse(title = "Profile", navController = navController, viewModel = null, hasDrawer = true) {
        Text(text = "this is profile screen")
    }
}