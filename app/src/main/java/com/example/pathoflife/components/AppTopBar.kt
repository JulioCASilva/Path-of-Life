package com.example.pathoflife.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    onProfileClick: () -> Unit = {}
){
    TopAppBar(
        title = {
            Text(
                text = "Path of Life"
            )
        },
        actions = {
            IconButton(onClick = onProfileClick){
                Icon(
                    imageVector = Icons.Filled.AccountCircle,
                    contentDescription = "Perfil"
                )
            }
        }
    )
}