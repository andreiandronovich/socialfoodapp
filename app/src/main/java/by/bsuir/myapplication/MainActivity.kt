package by.bsuir.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import by.bsuir.myapplication.ui.theme.PurpleLogin
import by.bsuir.myapplication.ui.theme.SomeBlack

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloCompose()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HelloCompose(
    titleFirstLine: String = "Welcome To",
    titleSecondLine: String = "SocialFood!",
    content: String = "A place to share your food",

    ) {
    Column(
        modifier = Modifier
            .background(PurpleLogin)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    )
    {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 19.dp, top = 7.dp),
            text = titleFirstLine,
            color = Color.White,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 19.dp),
            text = titleSecondLine,
            color = Color.White,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,


            )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 19.dp, top = 9.dp),
            text = content,
            fontSize = 21.sp,
            color = SomeBlack,
            fontWeight = FontWeight.Bold

        )

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 53.dp, end = 53.dp, top = 300.dp, bottom = 8.dp)
                .size(height = 59.dp, width = 284.dp),

            colors = ButtonDefaults.buttonColors(Color.Black),
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(20.dp)

        ) {
            Text(

                text = "Sign up",
                color = Color.White,
                fontSize = 20.sp
            )

        }
        Row {
            Text(

                text = "Already have an account? ",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,


                )
            Text(
                text = "Login",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,

                )
        }

    }
    Image(
        modifier = Modifier.fillMaxSize().padding(),
        painter = painterResource(id = R.drawable.beginnings1),
        contentDescription = "new-beginning",
    )
}