package by.bsuir.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import by.bsuir.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "screen_1"
                ) {
                    composable("screen_1") {
                        Hello(
                            signUpClick = { navController.navigate("screen_2") },
                            logInClick = { navController.navigate("screen_3") }
                        )
                    }
                    composable("screen_2") {
                        SignUp(
                            helloClick = {
                                navController.navigate("screen_1") {
                                    popUpTo("screen_1") {
                                        inclusive = true
                                    }
                                }
                            },
                            loginClick = { navController.navigate("screen_3") }
                        )
                    }
                    composable("screen_3") {
                        LogIn(
                            helloClick = {
                                navController.navigate("screen_1") {
                                    popUpTo("screen_1") {
                                        inclusive = true
                                    }
                                }
                            },
                            signUpClick = {
                                navController.navigate("screen_2") {
                                    popUpTo("screen_2") {
                                        inclusive = true
                                    }
                                }
                            }
                        )


                    }
                }
            }
        }
    }
}


