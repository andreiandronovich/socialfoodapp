package by.bsuir.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = "screen_1"
            ) {
                composable("screen_1") {
                    Hello {
                        navController.navigate("screen_2")
                    }
                }
                composable("screen_2") {
                    SignUp {
                        navController.navigate("screen_1"){
                            popUpTo("screen_1"){
                                inclusive = true
                            }
                        }
                    }

                }
            }

        }
    }
}


