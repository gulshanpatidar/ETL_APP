package com.example.etl_app.ui.screens.offer

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.etl_app.ui.components.ScaffoldUse

@Composable
fun OfferScreen(navController: NavHostController) {
    ScaffoldUse(title = "Offers", navController = navController, viewModel = null, hasDrawer = true) {
        Text(text = "This is offer screen")
    }
}