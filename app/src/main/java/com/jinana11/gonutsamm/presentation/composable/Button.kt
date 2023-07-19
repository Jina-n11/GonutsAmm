package com.jinana11.gonutsamm.presentation.composable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.jinana11.gonutsamm.presentation.theme.PrimaryLight

@Composable
fun ButtonAmm(text: String, onClick: () -> Unit , color: Color  = PrimaryLight , colorText: Color  = Color.White)  {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(color),
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            color = colorText,
            modifier = Modifier.padding(vertical = 8.dp),

        )
    }
}