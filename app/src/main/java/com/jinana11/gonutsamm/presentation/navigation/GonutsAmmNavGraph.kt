package com.jinana11.gonutsamm.presentation.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jinana11.gonutsamm.presentation.screens.LocalNavigationProvider
import com.jinana11.gonutsamm.presentation.screens.dashboard.dashboardRoute
import com.jinana11.gonutsamm.presentation.screens.details.donutsDetailsRoute
import com.jinana11.gonutsamm.presentation.screens.home.homeRoute

@Composable
fun GonutsAmmNavGraph() {
    val navController = LocalNavigationProvider.current

    NavHost(navController = navController, startDestination = Screen.Dashboard.route) {
        homeRoute()
        composable(route = BottomBarScreen.Favorite.route) { }
        composable(route = BottomBarScreen.Notification.route) { }
        composable(route = BottomBarScreen.Cart.route) { }
        composable(route = BottomBarScreen.Profile.route) { }
        dashboardRoute()
        donutsDetailsRoute()
    }
}

sealed class Screen(val route: String) {
    object Dashboard : Screen("dashboard")
}