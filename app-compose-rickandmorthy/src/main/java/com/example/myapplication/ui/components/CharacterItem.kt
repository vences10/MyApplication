package com.example.myapplication.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun CharacterItem(nombre:String) {
    Row {
        Image(imageVector = Icons.Default.Home, contentDescription = "i")

        Column {
            Text(text = nombre)
            Text(text = "descripcion")
        }
    }
}

