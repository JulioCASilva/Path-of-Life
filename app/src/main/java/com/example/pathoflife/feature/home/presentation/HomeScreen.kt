package com.example.pathoflife.feature.home.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pathoflife.core.designsystem.components.text.TerminalTypingText
import com.example.pathoflife.core.utils.getFormattedToday

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ){
        Spacer(modifier = Modifier.height(16.dp))

        TerminalTypingText(
            fullText = getFormattedToday()
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}