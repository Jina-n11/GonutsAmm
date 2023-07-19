package com.jinana11.gonutsamm.presentation.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.jinana11.gonutsamm.presentation.theme.Black87
import com.jinana11.gonutsamm.presentation.theme.reduceNormal
import com.jinana11.gonutsamm.presentation.theme.shadowSize

@Composable
fun TextBox(text: String, backgroundColor: Color = Color.White) {
    Box(
        modifier = Modifier
            .shadow(elevation = 8.dp , shape =   RoundedCornerShape(reduceNormal))
            .background(color = backgroundColor , shape = RoundedCornerShape(12.dp))
            .padding(horizontal = 12.dp , vertical = 8.dp),

        ) {
        Text(text = text, style = MaterialTheme.typography.bodyLarge, color = Black87)
    }
}