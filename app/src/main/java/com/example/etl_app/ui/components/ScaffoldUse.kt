package com.example.etl_app.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.DrawerValue
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberDrawerState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.etl_app.ui.screens.home.HomeViewModel
import kotlinx.coroutines.launch

@Composable
fun ScaffoldUse(
    title: String,
    navController: NavHostController,
    viewModel: HomeViewModel?,
    hasDrawer: Boolean = false,
    content: @Composable () -> Unit
) {
    val scaffoldState =
        rememberScaffoldState(rememberDrawerState(initialValue = DrawerValue.Closed))

    val coroutineScope = rememberCoroutineScope()

    if (hasDrawer){
        Scaffold(
            scaffoldState = scaffoldState,
            topBar = {
                TopBar(title = title, isHomeScreen = hasDrawer, navController = navController) {
                    coroutineScope.launch {
                        scaffoldState.drawerState.open()
                    }
                }
            },
            bottomBar = {
                BottomBar(navController = navController)
            },
            drawerContent = {
                NavigationDrawer(viewModel = viewModel) {
                    coroutineScope.launch {
                        scaffoldState.drawerState.close()
                    }
                }
            }
        ) { innerPadding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ) {
                content()
            }
        }
    }
    else{
        Scaffold(
            scaffoldState = scaffoldState,
            topBar = {
                TopBar(title = title, isHomeScreen = hasDrawer, navController = navController) {
                    coroutineScope.launch {
                        scaffoldState.drawerState.open()
                    }
                }
            },
            bottomBar = {
                BottomBar(navController = navController)
            }
        ) { innerPadding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ) {
                content()
            }
        }
    }
}