package by.bsuir.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import by.bsuir.myapplication.ui.theme.PurpleAuth


@Composable
fun SignUp( onClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PurpleAuth),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Text(
            modifier = Modifier.padding(top = 64.dp),
            text = "Sign up to SocialFood!",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,

            )
        Button(
            onClick = onClick ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 43.dp, end = 43.dp, top = 17.dp)
                .size(width = 306.dp, height = 56.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically,

            ){
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
    }
}
