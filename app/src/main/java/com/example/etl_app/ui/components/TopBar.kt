package com.example.etl_app.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun TopBar(title: String,isHomeScreen: Boolean,navController: NavHostController, onMenuClicked: () -> Unit) {

    TopAppBar(
        title = {
            Text(text = title, color = Color.White)
        },
        navigationIcon = {
            Icon(
                imageVector = if (isHomeScreen) Icons.Default.Menu else Icons.Default.ArrowBack,
                contentDescription = "Menu",
                modifier = Modifier
                    .padding(start = 4.dp)
                    .clickable {
                        if (isHomeScreen){
                            onMenuClicked()
                        }else{
                            navController.navigateUp()
                        }
                    },
                tint = Color.White
            )
        }
    )
}