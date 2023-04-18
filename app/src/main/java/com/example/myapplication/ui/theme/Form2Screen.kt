package com.example.myapplication.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BottomNavigation
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun Form2Screen(param : String?) {

    Scaffold(
        bottomBar={
        BottomNavigation() {

        }
    }) {

    }

//    Column(modifier = Modifier
//        .fillMaxSize()
//        .background(color = androidx.compose.ui.graphics.Color.Green)){
//
//        Text(text = "Form 2", textAlign = TextAlign.Center)
//        Text(text = "Nome: $param", textAlign = TextAlign.Center)
//    }

}