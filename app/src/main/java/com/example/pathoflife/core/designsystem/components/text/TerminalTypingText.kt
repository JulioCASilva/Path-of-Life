package com.example.pathoflife.core.designsystem.components.text

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import kotlinx.coroutines.delay
import androidx.compose.runtime.mutableIntStateOf

@Composable
fun TerminalTypingText(
    fullText: String,
    modifier: Modifier = Modifier,
    style: TextStyle = MaterialTheme.typography.titleMedium,
    color: Color = Color(0xFF00BCD4),
    charDelayMs: Long = 28L,
    showCursor: Boolean = true
) {
    var visibleCount by remember(fullText) { mutableIntStateOf(0) }
    var cursorOn by remember { mutableStateOf(true) }

    // Digitação
    LaunchedEffect(fullText) {
        visibleCount = 0
        while (visibleCount < fullText.length) {
            delay(charDelayMs)
            visibleCount++
        }
    }

    // Cursor piscando
    LaunchedEffect(showCursor) {
        if (!showCursor) return@LaunchedEffect
        while (true) {
            delay(450)
            cursorOn = !cursorOn
        }
    }

    val typed = fullText.take(visibleCount)
    val cursor = if (showCursor && cursorOn) "█" else ""

    Text(
        text = typed + cursor,
        style = style,
        color = color,
        modifier = modifier
    )
}
