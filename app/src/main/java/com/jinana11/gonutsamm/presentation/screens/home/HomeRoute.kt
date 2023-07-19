package com.jinana11.gonutsamm.presentation.screens.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.jinana11.gonutsamm.presentation.navigation.BottomBarScreen


private const val ROUTE = "home"

fun NavController.navigateToHomeScreen() {
    navigate("$ROUTE")
}

fun NavGraphBuilder.homeRoute() {
    composable(BottomBarScreen.Home.route) { HomeScreen() }
}