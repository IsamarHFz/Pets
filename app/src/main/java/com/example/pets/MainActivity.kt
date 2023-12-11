package com.example.pets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pets.ui.screens.FunFactsNavigationGraph
import com.example.pets.ui.screens.Routes
import com.example.pets.ui.screens.UserInputScreen
import com.example.pets.ui.screens.WelcomeScreen
import com.example.pets.ui.theme.PetsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PetsTheme {
                PetsApp()
            }
        }
    }
    @Composable
    fun PetsApp(){
        FunFactsNavigationGraph()
    }

}
