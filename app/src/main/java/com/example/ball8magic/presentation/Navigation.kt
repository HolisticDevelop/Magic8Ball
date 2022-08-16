package com.example.ball8magic.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ball8magic.presentation.ui.magic_ball.MagicBallScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MagicBallScreen.route){
        composable(route = Screen.MagicBallScreen.route) {
            MagicBallScreen(navController = navController)
        }
    }
}