package com.example.etl_app.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.SpaceAround
import androidx.compose.foundation.layout.Arrangement.SpaceBetween
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.parseWidget
import com.example.etl_app.R
import com.example.etl_app.ui.screens.home.HomeViewModel
import com.example.etl_app.ui.util.Constants

@Composable
fun NavigationDrawer(
    viewModel: HomeViewModel?,
    closeDrawer: () -> Unit
) {

    ConstraintLayout(modifier = Modifier.fillMaxSize()) {

        val (titleTextBox, mainColumn) = createRefs()

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .background(MaterialTheme.colors.primary)
                .constrainAs(titleTextBox) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                }
        ) {
            Text(
                text = "ETL APP",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                color = Color.White
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(mainColumn) {
                    top.linkTo(titleTextBox.bottom)
                    start.linkTo(parent.start)
                },
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(50.dp))
            Divider(Modifier.height(1.dp))
            Constants.drawerItems.forEach { item ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {

                        },
                    verticalAlignment = CenterVertically
                ) {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.text,
                        modifier = Modifier.padding(start = 16.dp)
                    )
                    Text(
                        text = item.text,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 18.sp,
                        modifier = Modifier
                            .padding(16.dp)
                    )
                }
                Divider(Modifier.height(1.dp))
            }
        }
    }
}

@Preview
@Composable
fun PreviewDrawer() {
    NavigationDrawer(viewModel = null) {

    }
}