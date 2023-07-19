package com.jinana11.gonutsamm.presentation.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.jinana11.gonutsamm.R
import com.jinana11.gonutsamm.presentation.theme.PrimaryLight

@Composable
fun FavoriteIcon(onClick: ()-> Unit) {
    Box(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 4.dp)
            .background( color = White , shape =  CircleShape )
            .clip(CircleShape)
        .clickable { onClick() },
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_favorite),
            contentDescription = null,
            modifier = Modifier.padding(4.dp),
            tint = PrimaryLight,
        )
    }
}


@Composable
fun BoxIcon(iconId:Int , backgroundColor: Color = White , iconColor:Color = PrimaryLight , onClick: ()-> Unit) {
    Box(
        modifier = Modifier
            .shadow(elevation = 8.dp , shape =   RoundedCornerShape(12.dp))
            .background(color = backgroundColor , shape = RoundedCornerShape(12.dp))
            .clickable { onClick() }
            .padding(8.dp),

    ) {
        Icon(
            painter = painterResource(id = iconId),
            contentDescription = null,
            tint = iconColor
        )
    }
}