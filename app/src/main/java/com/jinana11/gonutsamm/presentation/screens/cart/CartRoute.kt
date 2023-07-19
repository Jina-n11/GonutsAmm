package com.jinana11.gonutsamm.presentation.screens.cart

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable


private const val ROUTE = "cart"

fun NavController.navigateToCartScreen() {
    navigate("$ROUTE")
}

fun NavGraphBuilder.cartRoute(navController: NavHostController) {
    composable(
        route = "$ROUTE",
    ) {
        CartScreen(navController)
    }
}
