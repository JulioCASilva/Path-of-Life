package com.example.pathoflife.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.pathoflife.navigation.BottomNavItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.ui.unit.Dp

@Composable
fun BottomBar(navController: NavController) {

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    val items = listOf(
        BottomNavItem.Routine,
        BottomNavItem.Expenses,
        BottomNavItem.Home,
        BottomNavItem.Training,
        BottomNavItem.Habits
    )

    val homeInactive = Color(0xFF202024)
    val active = Color(0xFF00BCD4)
    val inactive = Color(0xFF7A8683)

    val homeSelected = currentRoute == BottomNavItem.Home.route

    val fabScale by animateFloatAsState(
        targetValue = if (homeSelected) 1.08f else 1.0f,
        animationSpec = spring(stiffness = 500f),
        label = "fabScale"
    )

    Box {
        Column {
            HorizontalDivider(
                thickness = 1.dp,
                color = Color(0xFF2A2A2A)
            )

            NavigationBar(
                containerColor = Color(0xFF09090b),
                modifier = Modifier.height(88.dp)
            ) {
                items.forEach { item ->
                    val selected = currentRoute == item.route

                    val itemColor = when {
                        item == BottomNavItem.Home && !selected -> homeInactive
                        selected -> active
                        else -> inactive
                    }

                    NavigationBarItem(
                        selected = selected,
                        onClick = {
                            navController.navigate(item.route) {
                                popUpTo(navController.graph.startDestinationId) { saveState = true }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },
                        icon = {
                            NavIcon(
                                imageVector = item.icon,
                                contentDescription = item.label,
                                selected = selected,
                                tint = itemColor,
                            )
                        },
                        label = {
                            Text(
                                text = item.label ?: "",
                                color = itemColor
                            )
                        },
                        alwaysShowLabel = true,
                        colors = NavigationBarItemDefaults.colors(
                            indicatorColor = Color.Transparent
                        )
                    )
                }
            }
        }

        FloatingActionButton(
            onClick = {
                navController.navigate(BottomNavItem.Home.route) {
                    popUpTo(navController.graph.startDestinationId) { saveState = true }
                    launchSingleTop = true
                    restoreState = true
                }
            },
            containerColor = if (homeSelected) active else homeInactive,
            contentColor = Color.Black,
            shape = CircleShape,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = (-14).dp)
                .size(56.dp)
                .scale(fabScale)
                .shadow(
                    elevation = if (homeSelected) 12.dp else 6.dp,
                    shape = CircleShape,
                    clip = false
                ),
            elevation = FloatingActionButtonDefaults.elevation(defaultElevation = 0.dp)
        ) {
            Icon(
                imageVector = BottomNavItem.Home.icon,
                contentDescription = BottomNavItem.Home.label ?: "Home",
                modifier = Modifier.size(36.dp)
            )
        }
    }
}

@Composable
private fun NavIcon(
    imageVector: ImageVector,
    contentDescription: String?,
    selected: Boolean,
    tint: Color,
    size: Dp = 36.dp
) {
    val scale by animateFloatAsState(
        targetValue = if (selected) 1.18f else 1.0f,
        animationSpec = spring(stiffness = 500f),
        label = "navIconScale"
    )

    Box(
        modifier = Modifier
            .size(size)
            .scale(scale)
            .clip(CircleShape)
            .shadow(
                elevation = if (selected) 10.dp else 0.dp,
                shape = CircleShape,
                clip = false
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = imageVector,
            contentDescription = contentDescription,
            tint = tint
        )
    }
}
