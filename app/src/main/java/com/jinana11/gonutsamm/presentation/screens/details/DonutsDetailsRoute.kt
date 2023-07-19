package com.jinana11.gonutsamm.presentation.screens.details

import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument


private const val ROUTE = "donutsDetails"

fun NavController.navigateToDonutsDetailsScreen() {
    navigate("$ROUTE")
}

fun NavGraphBuilder.donutsDetailsRoute() {
    composable(route = ROUTE) {
        DonutsDetailsScreen()
    }
}
//fun NavGraphBuilder.donutsDetailsRoute(navController: NavHostController) {
//    composable(
//        route = "$ROUTE/${DonutsDetailsArgs.DONUTS_ID}",
//        arguments = listOf(
//            navArgument(name = DonutsDetailsArgs.DONUTS_ID) {
//                NavType.IntType
//            }
//        )
//    ) {
//        DonutsDetailsScreen(navController)
//    }
//}
//
//
//class DonutsDetailsArgs(savedStateHandle: SavedStateHandle) {
//    val donutsId: String = checkNotNull(savedStateHandle[DONUTS_ID])
//
//    companion object {
//        const val DONUTS_ID = "donutsId"
//    }
//}
