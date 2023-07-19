package com.jinana11.gonutsamm.presentation.screens.notifaction

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable


private const val ROUTE = "notification"

fun NavController.navigateToNotificationScreen() {
    navigate("$ROUTE")
}

fun NavGraphBuilder.notificationRoute(navController: NavHostController) {
    composable(
        route = "$ROUTE",
    ) {
        NotificationScreen(navController)
    }
}
