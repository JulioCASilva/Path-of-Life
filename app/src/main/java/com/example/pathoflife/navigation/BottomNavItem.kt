package com.example.pathoflife.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AttachMoney
import androidx.compose.material.icons.filled.Checklist
import androidx.compose.material.icons.filled.FitnessCenter
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    val route: String,
    val icon: ImageVector,
    val label: String? = null
) {

    object Routine : BottomNavItem(
        route = "routine",
        icon = Icons.Default.Schedule,
        label = "Rotina"
    )

    object Expenses : BottomNavItem(
        route = "expenses",
        icon = Icons.Default.AttachMoney,
        label = "Gastos"
    )

    object Home : BottomNavItem(
        route = "home",
        icon = Icons.Default.Home
    )

    object Training : BottomNavItem(
        route = "training",
        icon = Icons.Default.FitnessCenter,
        label = "Treinos"
    )

    object Habits : BottomNavItem(
        route = "habits",
        icon = Icons.Default.Checklist,
        label = "Hábitos"
    )
}
