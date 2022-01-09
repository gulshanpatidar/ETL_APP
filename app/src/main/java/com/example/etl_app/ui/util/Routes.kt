package com.example.etl_app.ui.util

sealed class Routes(val route: String) {

    object Home: Routes("home_screen")
    object Login: Routes("login_screen")
    object Signup: Routes("signup_screen")
    object Splash: Routes("splash_screen")
    object Notifications: Routes("notification_screen")
    object Profile: Routes("profile_screen")
    object Orders: Routes("order_screen")
    object Offers: Routes("offer_screen")
    object Wishlist: Routes("wishlist_screen")
    object Helpline: Routes("helpline_screen")
}