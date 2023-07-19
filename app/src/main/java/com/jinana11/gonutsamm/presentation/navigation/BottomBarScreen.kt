package com.jinana11.gonutsamm.presentation.navigation

import com.jinana11.gonutsamm.R

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: Int,
    val selectedIcon: Int,
) {

    object Home : BottomBarScreen(
        route = "home",
        title = "Home",
        icon = R.drawable.ic_home,
        selectedIcon = R.drawable.home_selected
    )

    object Favorite : BottomBarScreen(
        route = "favorite",
        title = "Favorite",
        icon = R.drawable.ic_heart,
        selectedIcon = R.drawable.heart_selected
    )

    object Notification : BottomBarScreen(
        route = "notification",
        title = "Notification",
        icon = R.drawable.ic_notification,
        selectedIcon = R.drawable.notification_selected
    )

    object Cart : BottomBarScreen(
        route = "cart",
        title = "Cart",
        icon = R.drawable.ic_buy,
        selectedIcon = R.drawable.buy_selected
    )

    object Profile : BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = R.drawable.ic_profile,
        selectedIcon = R.drawable.profile_selected
    )
}