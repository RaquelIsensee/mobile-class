package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myapplication.ui.theme.Form1Screen
import com.example.myapplication.ui.theme.Form2Screen
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home"){
        composable("home"){
            HomeScreen(onNavigateForm1 = {
                navController.navigate("form1")
            })
        }
        composable("form1"){
            Form1Screen(
                onBack = {
                    navController.navigateUp()
                },
                onNavigateForm2 = {
                    navController.navigate("form2/${it}")
                }
            )
        }
        composable("form2/{name}",
                arguments = listOf(
                    navArgument("name") {type = NavType.StringType})
        ){
            val param = it.arguments?.getString("name")
            Form2Screen(param)
        }
    }
}

