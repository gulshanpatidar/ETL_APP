package com.example.etl_app.ui.util

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import com.example.etl_app.ui.models.BottomNavItem
import com.example.etl_app.ui.models.DrawerItem

object Constants {

    val bottomNavItems = listOf(
        BottomNavItem(
            label = "Home",
            icon = Icons.Default.Home,
            route = Routes.Home.route
        ),
        BottomNavItem(
            label = "Offers",
            icon = Icons.Default.LocalOffer,
            route = Routes.Offers.route
        ),
        BottomNavItem(
            label = "Notifications",
            icon = Icons.Default.Notifications,
            route = Routes.Notifications.route
        ),
        BottomNavItem(
            label = "Profile",
            icon = Icons.Default.Person,
            route = Routes.Profile.route
        )
    )

    val drawerItems = listOf(
        DrawerItem(
            text = "Orders",
            icon = Icons.Default.History,
            route = Routes.Orders.route
        ),
        DrawerItem(
            text = "Wishlist",
            icon = Icons.Default.FavoriteBorder,
            route = Routes.Wishlist.route
        ),
        DrawerItem(
            text = "Profile",
            icon = Icons.Default.Person,
            route = Routes.Profile.route
        ),
        DrawerItem(
            text = "Helpline",
            icon = Icons.Default.ContactSupport,
            route = Routes.Helpline.route
        )
    )
}