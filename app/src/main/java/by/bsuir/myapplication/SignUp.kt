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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import by.bsuir.myapplication.ui.theme.PurpleAuth

@Preview
@Composable
fun MyViewPreview() {
    SignUp(helloClick = {},
        loginClick = {})
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUp(
    helloClick: () -> Unit,
    loginClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PurpleAuth),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Text(
            modifier = Modifier.padding(top = 34.dp),
            text = "Sign up to SocialFood!",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,

            )
        Button(
            onClick =
              helloClick
            ,
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
                    text = " Sign up with Google",
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
                text = "Or continue with Email",
                modifier = Modifier
                    .padding(start = 8.dp, end = 8.dp),
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
            )
            // Divider(color = Color.Black, modifier = Modifier.size(width = 82.dp, height = 2.dp ))
        }
        var name by remember { mutableStateOf(TextFieldValue("")) }
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 41.dp, end = 41.dp, top = 40.dp, bottom = 26.dp)
                .clip(shape = RoundedCornerShape(50.dp)),
            value = name,
            onValueChange = { newText ->
                name = newText
            },

            placeholder = {

                Text(text = "Enter your name")

            },

            )
        var username by remember { mutableStateOf(TextFieldValue("")) }
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 41.dp, end = 41.dp, bottom = 26.dp)
                .clip(shape = RoundedCornerShape(50.dp)),
            value = username,
            onValueChange = { newText ->
                username = newText
            },
            placeholder = {
                Text(
                    text = "Enter username",
                    fontSize = 15.sp
                )
            },
        )
        var email by remember { mutableStateOf(TextFieldValue("")) }
        TextField(
            modifier = Modifier
                .fillMaxWidth()

                .padding(start = 41.dp, end = 41.dp, bottom = 26.dp)
                .clip(shape = RoundedCornerShape(50.dp)),
            value = email,
            onValueChange = { newText ->
                email = newText
            },
            placeholder = {
                Text(
                    text = "Enter Email",
                    fontSize = 15.sp
                )
            },
        )
        var password by remember { mutableStateOf(TextFieldValue("")) }
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 41.dp, end = 41.dp)
                .clip(shape = RoundedCornerShape(50.dp)),
            value = password,
            onValueChange = { newText ->
                password = newText
            },
            placeholder = {
                Text(text = "Enter password")
            },
        )

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.CenterEnd
        ) {

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(top = 71.dp, end = 21.dp)
                    .size(width = 180.dp, height = 56.dp),
                colors = ButtonDefaults.buttonColors(Color.Black),
            ) {
                Text(
                    text = "Create Account",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                )
            }

        }
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.CenterEnd
        ) {
            Text(
                modifier = Modifier
                    .padding(end = 13.dp, top = 10.dp),
                text = "Already have an account?",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,


                )
        }
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.CenterEnd
        ) {
            Text(
                modifier = Modifier
                    .padding(end = 88.dp, top = 4.dp)
                    .clickable { loginClick() },
                text = "Login",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
            )
        }
    }
    Image(
        modifier = Modifier.fillMaxSize(),
        painter = painterResource(id = R.drawable.whoa1),
        contentDescription = "login Page",
    )
}

