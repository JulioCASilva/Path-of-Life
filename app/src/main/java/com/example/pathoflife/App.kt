package com.example.pathoflife

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.pathoflife.navigation.BottomBar
import com.example.pathoflife.navigation.AppNavHost
import com.example.pathoflife.ui.theme.background

@Composable
fun App() {
    val navController = rememberNavController()

    Scaffold(
        containerColor = background,
        bottomBar = { BottomBar(navController) }
    ) { padding ->
        AppNavHost(
            navController = navController,
            modifier = Modifier.padding(padding)
        )
    }
}
