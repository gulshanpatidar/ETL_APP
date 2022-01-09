package com.example.etl_app.ui.components

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.etl_app.ui.util.Constants
import com.example.etl_app.ui.util.Routes

@Composable
fun BottomBar(
    navController: NavHostController
) {
    BottomNavigation(
        backgroundColor = MaterialTheme.colors.primary
    ) {

        val navBackStackEntry by navController.currentBackStackEntryAsState()

        val currentRoute = navBackStackEntry?.destination?.route

        Constants.bottomNavItems.forEach { navItem ->

            BottomNavigationItem(selected = currentRoute == navItem.route,
                onClick = {
                    navController.navigate(navItem.route){

                        popUpTo(Routes.Home.route){
                            saveState = true
                        }

                        launchSingleTop = true

                        restoreState = true
                    }
                },
                icon = {
                    Icon(imageVector = navItem.icon, contentDescription = navItem.label)
                },
                label = {
                    Text(text = navItem.label)
                },
                alwaysShowLabel = false
            )
        }
    }
}