package com.example.raionproject

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Preview
@Composable
fun AppScreen(
    navController: NavController = rememberNavController()
) {
    val appList = listOf(
        AppObject.nike,
        AppObject.aero,
        AppObject.ip16,
        AppObject.delson,
        AppObject.rog,
        AppObject.loq,
        AppObject.logitech,
        AppObject.prada
    )
    LazyVerticalGrid(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        columns = GridCells.Fixed(2)){
        items(appList){ appEntity ->
            AppWidget(appEntity){
                navController.navigate("appDetail/${appEntity.id}")
            }
        }
    }
}