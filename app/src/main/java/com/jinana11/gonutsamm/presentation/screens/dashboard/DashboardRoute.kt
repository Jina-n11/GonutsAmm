package com.jinana11.gonutsamm.presentation.screens.dashboard

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable


private const val ROUTE = "dashboard"

fun NavController.navigateToDashboardScreen() {
    navigate("$ROUTE")
}

fun NavGraphBuilder.dashboardRoute() {
    composable(route = "$ROUTE",) {
        DashboardScreen()
    }
}
