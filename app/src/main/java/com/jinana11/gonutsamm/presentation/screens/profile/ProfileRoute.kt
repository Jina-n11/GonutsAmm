package com.jinana11.gonutsamm.presentation.screens.profile

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable


private const val ROUTE = "profile"

fun NavController.navigateToProfileScreen() {
    navigate("$ROUTE")
}

fun NavGraphBuilder.profileRoute(navController: NavHostController) {
    composable(
        route = "$ROUTE",
    ) {
        ProfileScreen(navController)
    }
}
