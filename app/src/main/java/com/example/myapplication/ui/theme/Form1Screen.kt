package com.example.myapplication.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun Form1Screen(onNavigateForm2: (name: String) -> Unit,
    onBack: () -> Unit) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = androidx.compose.ui.graphics.Color.Blue)) {
        val name = remember{
            mutableStateOf("Raquel")
        }

        Text(text = "Form 1", textAlign = TextAlign.Center)
        OutlinedTextField(value = name.value, onValueChange = {
            name.value=it
        }
        )
        Button(onClick = { onBack() }) {
            Text(text = "Back")
        }
        Button(onClick = { onNavigateForm2(name.value)}) {
            Text(text = "Form 2")
        }



    }
}