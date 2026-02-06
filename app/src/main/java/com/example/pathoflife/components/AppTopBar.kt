package com.example.pathoflife.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import com.example.pathoflife.R
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.layout.height

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(
    onProfileClick: () -> Unit = {}
){
    Column {
        TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color(0xFF09090B)
            ),
            title = {
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = null,
                    modifier = Modifier.height(15.dp),
                    contentScale = ContentScale.FillHeight
                )
            },
            actions = {
                IconButton(onClick = onProfileClick){
                    Icon(
                        imageVector = Icons.Filled.AccountCircle,
                        contentDescription = "Perfil",
                        modifier = Modifier
                            .size(60.dp),
                        tint = Color.White
                    )
                }
            }
        )
        HorizontalDivider(
            thickness = 1.dp,
            color = Color(0xFF2A2A2A)
        )
    }
}