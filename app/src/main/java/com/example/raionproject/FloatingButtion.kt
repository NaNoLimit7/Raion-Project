package com.example.raionproject

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.FloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FloatingButton()
{
    Box(modifier = Modifier.fillMaxSize()){
        FloatingActionButton(
            onClick = {     }) {
        }
    }
}

@Preview(showBackground = true)
@Composable
 fun DefaultPreview(){
     FloatingButton()
 }