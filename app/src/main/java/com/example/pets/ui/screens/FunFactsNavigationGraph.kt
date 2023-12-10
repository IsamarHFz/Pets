package com.example.pets.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun FunFactsNavigationGraph(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = ""){
        composable(Routes.USER_INPUT_SCREEN){
            UserInputScreen(navController)
        }
        composable(Routes.WELCOME_SCREEN){
            WelcomeScreen()
        }
    }
}