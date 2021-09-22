package com.example.etl_app.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Watch
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LoginHome() {

    Surface(modifier = Modifier.fillMaxSize()) {

        var emailAddress by rememberSaveable {
            mutableStateOf("")
        }

        var password by rememberSaveable {
            mutableStateOf("")
        }

        var passwordVisibility by remember {
            mutableStateOf(false)
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.wrapContentHeight(align = Alignment.CenterVertically)
        ) {
            OutlinedTextField(
                value = emailAddress,
                onValueChange = {
                    emailAddress = it
                },
                label = {
                    Text(text = "Enter Email Address")
                },
                singleLine = true,
            )
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = password,
                onValueChange = {
                    password = it
                },
                label = {
                    Text(text = "Enter Password")
                },
                singleLine = true,
                visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
                leadingIcon = {
                    IconButton(
                        onClick = { passwordVisibility = !passwordVisibility }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Watch,
                            contentDescription = "Button to show password"
                        )
                    }
                }
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
//                    Toast.makeText(LocalContext.current, "Ruko zara sabr karo", Toast.LENGTH_SHORT)
//                        .show()
                }
            ) {
                Text(
                    text = "Login"
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewLoginHome() {
    LoginHome()
}