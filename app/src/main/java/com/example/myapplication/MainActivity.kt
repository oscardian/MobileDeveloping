package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigation()
                }
            }
        }
    }
}






@Composable
internal fun AppNavigation() {
    //Подсмотрел с чат-бота, ибо не смог найти решение по передачи индекса
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.MainScreen.screenName) {
        composable(Screens.MainScreen.screenName) { MainScreen(navController = navController) }
        composable(
            "${Screens.ChatScreen.screenName}/{chatIndex}",
            arguments = listOf(navArgument("chatIndex") { type = NavType.IntType })
        ) { backStackEntry ->
            val chatIndex = backStackEntry.arguments?.getInt("chatIndex") ?: 0
            ChatScreen(navController = navController, chatIndex = chatIndex)
        }
    }
}