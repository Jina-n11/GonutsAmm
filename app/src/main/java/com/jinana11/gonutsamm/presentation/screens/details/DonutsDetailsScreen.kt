package com.jinana11.gonutsamm.presentation.screens.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import com.jinana11.gonutsamm.R
import com.jinana11.gonutsamm.presentation.composable.BoxIcon
import com.jinana11.gonutsamm.presentation.screens.LocalNavigationProvider
import com.jinana11.gonutsamm.presentation.screens.cart.navigateToCartScreen
import com.jinana11.gonutsamm.presentation.screens.details.components.BottomSheetDonuts
import com.jinana11.gonutsamm.presentation.theme.BackgroundLight
import com.jinana11.gonutsamm.presentation.theme.SecondlyBackgroundLight
import com.jinana11.gonutsamm.presentation.theme.SecondlyLight

@Composable
fun DonutsDetailsScreen(
//    navController: NavHostController,
//    viewModel: DonutsDetailsViewModel = hiltViewModel(),
) {
//    val state by viewModel.state.collectAsState()
    val navController = LocalNavigationProvider.current
    DonutsDetailsContent(
//        state = state, 
        onClickCart =  navController::navigateToCartScreen,
        onClickExit =  navController::navigateUp
    )
}



@Composable
fun DonutsDetailsContent(
//    state: DonutsDetailsUiState,
    onClickExit: () -> Unit,
    onClickCart: () -> Unit,
) {
    ConstraintLayout(modifier = Modifier
        .fillMaxSize()
        .background(color = SecondlyBackgroundLight)) {
        val (exit, donutsImage, details , favorite) = createRefs()
        val guideLine = createGuidelineFromTop(0.45f)

        Image(
            painter = painterResource(
                R.drawable.donuts2
            ),
            contentDescription = "",
            modifier = Modifier
                .aspectRatio(6f / 6f)
                .constrainAs(donutsImage) {
                    top.linkTo(parent.top)
                }.scale(0.7f, 0.8f),
            contentScale = ContentScale.Crop
        )

        Image(
            painter = painterResource(R.drawable.ic_round_arrow_back),
            contentDescription = "",
            modifier = Modifier
                .constrainAs(exit) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                }
                .padding(20.dp).clickable{onClickExit()},
            contentScale = ContentScale.Crop
        )



        BottomSheetDonuts(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
                .background(color = BackgroundLight)
                .background(Color.White)
                .fillMaxSize()
                .constrainAs(details) {
                    top.linkTo(guideLine)
                },
//            state,
            onClickCart = onClickCart,
        )


        Box(     modifier = Modifier.constrainAs(favorite) {
            top.linkTo(details.top)
            bottom.linkTo(details.top)
            end.linkTo(parent.end , margin = 40.dp)
        }.padding(12.dp),){
            BoxIcon(iconId = R.drawable.ic_favorite , onClick = {})
        }
    }
}