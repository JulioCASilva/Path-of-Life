package com.example.pathoflife.app.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.rounded.*


sealed class BottomNavItem(
    val route: String,
    val icon: ImageVector,
    val label: String? = null
) {

    object Routine : BottomNavItem(
        route = "routine",
        icon = Icons.Rounded.CalendarToday,
        label = "Rotina"
    )

    object Expenses : BottomNavItem(
        route = "expenses",
        icon = Icons.Rounded.Payments,
        label = "Gastos"
    )

    object Home : BottomNavItem(
        route = "home",
        icon = Icons.Rounded.Home
    )

    object Training : BottomNavItem(
        route = "training",
        icon = Icons.Rounded.FitnessCenter,
        label = "Treinos"
    )

    object Habits : BottomNavItem(
        route = "habits",
        icon = Icons.Rounded.TrackChanges,
        label = "Hábitos"
    )
}
