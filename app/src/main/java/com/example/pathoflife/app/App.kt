package com.example.pathoflife.app

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.pathoflife.core.designsystem.components.topbar.AppTopBar
import com.example.pathoflife.app.navigation.AppNavHost
import com.example.pathoflife.core.designsystem.components.navigationbar.BottomBar
import com.example.pathoflife.core.designsystem.theme.background

@Composable
fun App() {
    val navController = rememberNavController()

    Scaffold(
        containerColor = background,
        topBar = {
            AppTopBar(
                onProfileClick = {
                }
            )
        },
        bottomBar = { BottomBar(navController) }
    ) { padding ->
        AppNavHost(
            navController = navController,
            modifier = Modifier.padding(padding)
        )
    }
}
