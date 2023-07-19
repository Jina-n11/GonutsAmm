package com.jinana11.gonutsamm.presentation.screens.favorite

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable


private const val ROUTE = "favorite"

fun NavController.navigateToFavoriteScreen() {
    navigate("$ROUTE")
}

fun NavGraphBuilder.favoriteRoute(navController: NavHostController) {
    composable(
        route = "$ROUTE",
    ) {
        FavoriteScreen(navController)
    }
}
