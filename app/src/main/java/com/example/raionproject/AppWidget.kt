package com.example.raionproject

import android.webkit.WebSettings.TextSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
@Preview
fun AppWidget(
    appEntity: AppEntity = AppObject.nike,
    onClick: (appEntity: AppEntity) -> Unit = {}
){
    Row (modifier = Modifier
        .fillMaxWidth()
        .background(Color.White)
        .height(265.dp)
        .padding(8.dp),
        verticalAlignment = Alignment.Top
    )
    {


        Box (modifier = Modifier
            .fillMaxHeight()
            .padding(16.dp)
        ){
//            val count = remember { mutableIntStateOf(0) }
//            Button(onClick = {count.intValue += 1}) {
            Card(modifier = Modifier
                .width(165.dp)
                .height(245.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Column (modifier = Modifier.fillMaxSize()) {
                    AsyncImage(
                        model = appEntity.imageURL,
                        contentDescription = appEntity.name,
                        modifier = Modifier.fillMaxWidth().height(155.dp)
                    )
                    Text(appEntity.name,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        modifier = Modifier.padding(start = 8.dp)
                        )

                    Text(appEntity.rating.toString()+"  Stars",
                        fontSize = 12.sp,
                        modifier = Modifier.padding(8.dp))
                    }
//                }
            }
        }
    }
}
