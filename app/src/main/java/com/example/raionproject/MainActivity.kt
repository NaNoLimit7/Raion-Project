package com.example.raionproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.raionproject.ui.theme.RaionProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RaionProjectTheme {
            val navController: NavHostController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "app_screen"
                ){
                    composable("app_screen"){
                        AppScreen(navController)
                    }
                    composable("detail_screen/{name}"){
                        val name = it.arguments?.getString("name")
                        DetailScreen(
                            name = name.toString()
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RaionProjectTheme {
        Greeting("Android")
    }
}