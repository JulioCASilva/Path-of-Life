package com.example.pathoflife.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.pathoflife.screens.home.HomeScreen
import com.example.pathoflife.screens.training.TrainingScreen
import com.example.pathoflife.screens.habits.HabitsScreen
import com.example.pathoflife.screens.expenses.ExpensesScreen
import com.example.pathoflife.screens.routine.RoutineScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = BottomNavItem.Home.route,
        modifier = modifier
    ) {
        composable(BottomNavItem.Home.route) { HomeScreen() }
        composable(BottomNavItem.Training.route) { TrainingScreen() }
        composable(BottomNavItem.Habits.route) { HabitsScreen() }
        composable(BottomNavItem.Expenses.route) { ExpensesScreen() }
        composable(BottomNavItem.Routine.route) { RoutineScreen() }
    }
}
