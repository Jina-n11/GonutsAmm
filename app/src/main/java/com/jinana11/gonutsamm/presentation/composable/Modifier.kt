package com.jinana11.gonutsamm.presentation.composable

import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.jinana11.gonutsamm.presentation.theme.Black30


@Stable
fun Modifier.customShadow(shape: Shape) = then(
    this.shadow(
        elevation = 10.dp,
        shape = shape,
        ambientColor = Black30,
        spotColor = Black30
    )
)