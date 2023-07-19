package com.jinana11.gonutsamm.presentation.screens

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.jinana11.gonutsamm.presentation.navigation.GonutsAmmNavGraph
import com.jinana11.gonutsamm.presentation.theme.GonutsAmmTheme


val LocalNavigationProvider = staticCompositionLocalOf<NavHostController> {
    error("No navigation host controller provided.")
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun GonutsAmmApp() {
    CompositionLocalProvider(LocalNavigationProvider provides rememberNavController()) {
        GonutsAmmTheme {
            GonutsAmmNavGraph()
        }
    }
}