package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController


@Composable
fun HomeScreen(onNavigateForm1: ()-> Unit){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = androidx.compose.ui.graphics.Color.Gray)) {

        
        Text(text = "Home", textAlign = TextAlign.Center)
        Button(onClick = {
            onNavigateForm1()
        }) {
            Text(text = "Navigate to Form 1")
        }

    }
}



