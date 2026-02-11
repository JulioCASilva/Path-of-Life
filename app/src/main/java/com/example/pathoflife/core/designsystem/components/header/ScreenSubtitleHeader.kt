package com.example.pathoflife.core.designsystem.components.header

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.dp



@Composable
fun ScreenSubtitleHeader(
    subtitle: String,
    modifier: Modifier = Modifier,
    color: Color = Color(0xFF00BCD4)
){
    Text(
        text = subtitle,
        style = MaterialTheme.typography.titleMedium,
        color = color,
        modifier = modifier.padding(vertical = 12.dp)
    )
}