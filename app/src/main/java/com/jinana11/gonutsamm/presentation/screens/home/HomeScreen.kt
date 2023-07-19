package com.jinana11.gonutsamm.presentation.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.jinana11.gonutsamm.R
import com.jinana11.gonutsamm.presentation.composable.BoxIcon
import com.jinana11.gonutsamm.presentation.composable.CardDonuts
import com.jinana11.gonutsamm.presentation.composable.CardOffers
import com.jinana11.gonutsamm.presentation.composable.ScaffoldAmm
import com.jinana11.gonutsamm.presentation.composable.SpacerHorizontal16
import com.jinana11.gonutsamm.presentation.composable.SpacerHorizontal24
import com.jinana11.gonutsamm.presentation.composable.SpacerHorizontal32
import com.jinana11.gonutsamm.presentation.composable.SpacerHorizontal8
import com.jinana11.gonutsamm.presentation.composable.SpacerVertical12
import com.jinana11.gonutsamm.presentation.composable.SpacerVertical16
import com.jinana11.gonutsamm.presentation.composable.SpacerVertical24
import com.jinana11.gonutsamm.presentation.composable.SpacerVertical32
import com.jinana11.gonutsamm.presentation.composable.SpacerVertical4
import com.jinana11.gonutsamm.presentation.composable.SpacerVertical8
import com.jinana11.gonutsamm.presentation.navigation.BottomBar
import com.jinana11.gonutsamm.presentation.screens.LocalNavigationProvider
import com.jinana11.gonutsamm.presentation.screens.dashboard.navigateToDashboardScreen
import com.jinana11.gonutsamm.presentation.screens.details.navigateToDonutsDetailsScreen
import com.jinana11.gonutsamm.presentation.theme.BackgroundCard1Light
import com.jinana11.gonutsamm.presentation.theme.BackgroundCard2Light
import com.jinana11.gonutsamm.presentation.theme.BackgroundLight
import com.jinana11.gonutsamm.presentation.theme.Black60
import com.jinana11.gonutsamm.presentation.theme.Black87
import com.jinana11.gonutsamm.presentation.theme.PrimaryLight

@Composable
fun HomeScreen(){
    val navController = LocalNavigationProvider.current
    HomeContent(
        onClickSearchButton = navController::navigateToDashboardScreen,
        onClickDonutsOffers = navController::navigateToDonutsDetailsScreen,
    )
}


@Composable
private fun HomeContent(
    onClickSearchButton : () -> Unit = {},
    onClickDonutsOffers: () -> Unit = {}){
    val navController = LocalNavigationProvider.current

    ScaffoldAmm(
       content = { modifier ->

           Column(modifier = modifier
               .fillMaxSize()
               .background(color = BackgroundLight)
               .verticalScroll(rememberScrollState())
               .padding(bottom = 24.dp)) {


               Row(
                   horizontalArrangement = Arrangement.SpaceBetween,
                   verticalAlignment = Alignment.CenterVertically,
                   modifier = Modifier
                       .padding(horizontal = 20.dp, vertical = 16.dp)
                       .fillMaxWidth()

               ) {

                   Column() {
                       Text(text = "Let’s Gonuts!", style = MaterialTheme.typography.headlineLarge,
                           color = PrimaryLight)
                       SpacerVertical4()
                       Text(text = "Order your favourite donuts from here", style = MaterialTheme.typography.bodyMedium,
                           color = Black60)
                   }

                   BoxIcon(iconId = R.drawable.ic_round_search , onClick = onClickSearchButton )

               }

               SpacerVertical16()
               Text(text = "Today Offers", style = MaterialTheme.typography.titleLarge,
                   color = Black87, modifier=  Modifier.padding(horizontal = 20.dp))
               SpacerVertical8()
               LazyRow(
                   contentPadding = PaddingValues(horizontal = 20.dp),
               ){
                   items(4){
                       CardOffers(onClickCard =  onClickDonutsOffers  , imageId= if (it % 2 == 0) R.drawable.donut_offers_1 else  R.drawable.donuts2  , onClickFavorite = {} ,
                           backgroundColor = if (it % 2 == 0) BackgroundCard1Light else  BackgroundCard2Light)
                       SpacerHorizontal16()
                   }
               }

               SpacerVertical16()
               Text(text = "Donuts", style = MaterialTheme.typography.titleLarge,
                   color = Black87, modifier=  Modifier.padding(horizontal = 20.dp))
               SpacerVertical32()
               LazyRow(
                   contentPadding = PaddingValues(horizontal = 20.dp),
               ){
                   items(4){
                       CardDonuts(onClickCard = {} , imageId= if (it % 2 == 0) R.drawable.donut_2 else  R.drawable.donut_1 )
                       SpacerHorizontal8()
                   }
               }
           }


       },
        bottomBar = {
            BottomBar(navController = navController)
        }
    )

}