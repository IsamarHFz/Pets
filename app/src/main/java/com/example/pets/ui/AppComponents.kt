package com.example.pets.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TopBar(){
Row (modifier = Modifier.fillMaxWidth()){
    Text(
        text = "Hi there"
    )
}
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview(){
    TopBar()
}
