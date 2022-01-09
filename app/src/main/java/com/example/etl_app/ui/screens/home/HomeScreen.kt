package com.example.etl_app.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.etl_app.ui.components.ScaffoldUse

@Composable
fun HomeScreen(viewModel: HomeViewModel, navController: NavHostController) {
    ScaffoldUse(
        title = "Home",
        navController = navController,
        viewModel = viewModel,
        hasDrawer = true
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.surface)
        ) {
            Text(
                text = "Welcome to ETL App",
                style = MaterialTheme.typography.h3,
                modifier = Modifier.align(
                    Alignment.Center
                )
            )
        }
    }
}