package com.example.etl_app.ui.models

import androidx.compose.ui.graphics.vector.ImageVector

// this is a item in the navigation drawer
data class DrawerItem(
    val text: String,
    val icon: ImageVector,
    val route: String
)
