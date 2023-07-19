package com.jinana11.gonutsamm.presentation.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.jinana11.gonutsamm.R
import com.jinana11.gonutsamm.presentation.composable.ButtonAmm
import com.jinana11.gonutsamm.presentation.composable.SpacerVertical16
import com.jinana11.gonutsamm.presentation.composable.SpacerVertical24
import com.jinana11.gonutsamm.presentation.composable.SpacerVertical8
import com.jinana11.gonutsamm.presentation.screens.LocalNavigationProvider
import com.jinana11.gonutsamm.presentation.screens.home.navigateToHomeScreen
import com.jinana11.gonutsamm.presentation.theme.PrimaryLight
import com.jinana11.gonutsamm.presentation.theme.SecondlyBackgroundLight

@Composable
fun DashboardScreen(
) {
    val navController = LocalNavigationProvider.current
    DashboardContent(
        onClickButton = navController::navigateToHomeScreen
    )
}


@Composable
private fun DashboardContent(onClickButton: () -> Unit) {

    val systemUiController = rememberSystemUiController()
    systemUiController.setStatusBarColor(color = SecondlyBackgroundLight, darkIcons = true)

    ConstraintLayout(modifier = Modifier
        .fillMaxSize()
        .background(color = SecondlyBackgroundLight)) {
        val (donutsGroup, donutsAmm, content , d0 , donutsGroupTop , donutsCenter) = createRefs()
        SpacerVertical8()

        Image(
            painter = painterResource(id = R.drawable.donuts_group_top), contentDescription = "",
            modifier = Modifier
                .constrainAs(donutsGroupTop) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start, margin = (-70).dp)
                }
                .size(width = 250.dp ,98.dp)
                .scale(1.2f, 1.4f),

            )

        Image(
            painter = painterResource(id = R.drawable.donuts_center), contentDescription = "",
            modifier = Modifier
                .constrainAs(donutsCenter) {
                    top.linkTo(donutsGroup.top ,  margin = (50).dp)
                    bottom.linkTo(donutsGroup.bottom)
                    start.linkTo(donutsGroup.start, margin = (50).dp)
                }.size(width = 60.dp ,64.dp)
                .scale(1.2f, 1.2f),
            )

        Image(
            painter = painterResource(id = R.drawable.d0), contentDescription = "",
            modifier = Modifier
                .constrainAs(d0) {
                    top.linkTo(donutsGroupTop.bottom , margin = (-60).dp  )
                    start.linkTo(donutsGroup.start,)
                    end.linkTo(donutsGroup.end, margin = (-26).dp)
                }.size(width = 230.dp ,88.dp)
                .scale(1.1f, 1.3f),

        )

        Image(
            painter = painterResource(id = R.drawable.dount_group), contentDescription = "",
            modifier = Modifier
                .scale(1.9f, 1.9f)
                .fillMaxWidth()
                .constrainAs(donutsGroup) {
                    top.linkTo(donutsGroupTop.bottom , margin = (-20).dp)
                    start.linkTo(parent.start, margin = (-40).dp)
                    end.linkTo(parent.end, margin = (-40).dp)
                },
        )

        SpacerVertical16()

        Column(
            modifier = Modifier
                .background(color = SecondlyBackgroundLight)
                .padding(horizontal = 40.dp)
                .constrainAs(content) {
                    top.linkTo(donutsGroup.bottom)
                },

            ) {

            Text(
                text = "Gonuts\nwith\nDonuts", style = MaterialTheme.typography.displayLarge,
                color = PrimaryLight
            )
            SpacerVertical8()
            Text(
                text = "Gonuts with Donuts is a Sri Lanka dedicated food outlets for specialize manufacturing of Donuts in Colombo, Sri Lanka.",
                style = MaterialTheme.typography.bodyLarge,
                color = Color(0xFFFF9494)
            )

            SpacerVertical24()
            ButtonAmm(
                text = "Get Started",
                onClick =  onClickButton ,
                color = Color.White,
                colorText = Color.Black
            )

        }


        Image(
            painter = painterResource(id = R.drawable.donuts_eat), contentDescription = "",
            modifier = Modifier
                .constrainAs(donutsAmm) {
                    end.linkTo(donutsGroup.end,  margin = (-90).dp)
                    top.linkTo(content.top,  margin = (16).dp)
                }.size(width = 230.dp ,88.dp)
                .scale(1.9f, 1.9f),

            )
    }

}