package com.example.myapplication.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun Form2Screen(param : String?) {

    Scaffold(
        bottomBar={
        BottomNavigation() {
        BottomNavigationItem(
            selected = true,
            onClick = { /*TODO*/ },
            label={
               Text(text = "Tela 1")
           },
            Icon(Icons.Filled.AccountBox, contentDescription = "")
        }
    })
    {

    }

//    Column(modifier = Modifier
//        .fillMaxSize()
//        .background(color = androidx.compose.ui.graphics.Color.Green)){
//
//        Text(text = "Form 2", textAlign = TextAlign.Center)
//        Text(text = "Nome: $param", textAlign = TextAlign.Center)
//    }

}