package com.jinana11.gonutsamm.presentation.screens.details.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jinana11.gonutsamm.R
import com.jinana11.gonutsamm.presentation.composable.BoxIcon
import com.jinana11.gonutsamm.presentation.composable.ButtonAmm
import com.jinana11.gonutsamm.presentation.composable.SpacerHorizontal16
import com.jinana11.gonutsamm.presentation.composable.SpacerHorizontal24
import com.jinana11.gonutsamm.presentation.composable.SpacerVertical16
import com.jinana11.gonutsamm.presentation.composable.SpacerVertical24
import com.jinana11.gonutsamm.presentation.composable.SpacerVertical8
import com.jinana11.gonutsamm.presentation.composable.TextBox
import com.jinana11.gonutsamm.presentation.theme.Black38
import com.jinana11.gonutsamm.presentation.theme.Black60
import com.jinana11.gonutsamm.presentation.theme.Black87
import com.jinana11.gonutsamm.presentation.theme.PrimaryLight

@Composable
fun BottomSheetDonuts(
    modifier: Modifier = Modifier,
//    state: DonutsDetailsUiState,
    onClickCart: () -> Unit,
) {
    Column(
        modifier = modifier.padding(20.dp),
    ) {

        Text(
            text = "Strawberry Wheel",
            style = MaterialTheme.typography.headlineLarge,
            color = PrimaryLight,
        )
        SpacerVertical16()

        Text(
            text = "About Gonut",
            style = MaterialTheme.typography.titleLarge,
            color = Black87,
        )
        SpacerVertical8()
        Text(
            text = "These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
            style = MaterialTheme.typography.bodyMedium,
            color = Black38,
        )

        SpacerVertical16()
        Text(
            text = "Quantity",
            style = MaterialTheme.typography.titleLarge,
            color = Black87,
        )
        SpacerVertical8()
        Row(horizontalArrangement = Arrangement.SpaceBetween) {
            BoxIcon(iconId = R.drawable.ic_remove, onClick = {})
            SpacerHorizontal16()
            TextBox(text = "1")
            SpacerHorizontal16()
            BoxIcon(iconId = R.drawable.ic_add, onClick = {})
        }
        SpacerVertical24()

        Row(horizontalArrangement = Arrangement.SpaceBetween) {

            Text(
                text = "$16",
                style = MaterialTheme.typography.headlineLarge,
                color = Black87,
            )
            SpacerHorizontal24()
            ButtonAmm(text = "Add to Cart", onClick = { })

        }

    }
}