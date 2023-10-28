package by.bsuir.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import by.bsuir.myapplication.ui.theme.PurpleAuth
@Preview
@Composable
fun MyViewPre() {
    LogIn(helloClick = {},
        signUpClick = {})
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LogIn(
    helloClick: () -> Unit,
    signUpClick: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PurpleAuth),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Text(
            modifier = Modifier.padding(top = 34.dp),
            text = "Log in to SocialFood!",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,

            )
        Button(
            onClick =  helloClick,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 41.dp, end = 41.dp, top = 17.dp, bottom = 26.dp)
                .size(width = 306.dp, height = 56.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,

                ) {
                Image(
                    modifier = Modifier.size(15.dp),
                    painter = painterResource(id = R.drawable.icongoogle),
                    contentDescription = "Google icon"
                )
                Text(
                    text = " Log in with Google",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,

                    )
            }
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            //Divider(color = Color.Black, modifier = Modifier.size(width = 82.dp, height = 2.dp ))
            Text(
                text = "Or log in with Email",
                modifier = Modifier
                    .padding(start = 8.dp, end = 8.dp,  bottom = 51.dp),
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
            )
            // Divider(color = Color.Black, modifier = Modifier.size(width = 82.dp, height = 2.dp ))
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 42.dp,),
            contentAlignment = Alignment.CenterStart){
            Text(text = "Username or Email",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,)
        }
        var name by remember { mutableStateOf(TextFieldValue("")) }
        TextField(value = name,
            onValueChange = { newText ->
            name = newText
                            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, start = 42.dp, end = 42.dp)
                .size(306.dp, 49.dp)
                .clip(shape = RoundedCornerShape(50.dp)),
        )
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = "Password",
                modifier = Modifier.padding(start = 45.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,

            )
            Text(text = "Forgot?",
                modifier = Modifier.padding(end = 49.dp),
                fontSize = 15.sp,)
        }
        var password by remember { mutableStateOf(TextFieldValue("")) }
        TextField(value = password,
            onValueChange = { newText -> password = newText },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, start = 42.dp, end = 42.dp)
                .size(306.dp, 49.dp)
                .clip(shape = RoundedCornerShape(50.dp)),)
        Text(text = "Don’t have an account?",
            color = Color.White,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp, top = 92.dp)
        )
        Box(modifier = Modifier.fillMaxWidth()){
            Text(text = "Sign up",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(start = 102.dp, top = 6.dp)
                    .clickable { signUpClick() }
            )
        }

    }
    Image(modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillWidth,

        painter = painterResource(id = R.drawable.reflecting1),
        contentDescription = "Log In Page")
}