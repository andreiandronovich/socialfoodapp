package by.bsuir.myapplication

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun News() {
    Scaffold(
        topBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Color.Black
                    ),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,

                ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth(),

                    ) {

                    Text(
                        modifier = Modifier.weight(1f),
                        text = "SocialFood",
                        textAlign = TextAlign.Center,
                        color = Color.White,
                        fontSize = 44.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Image(
                        modifier = Modifier
                            .padding(end = 15.dp)
                            .size(35.dp)
                            .clip(CircleShape)
                            .clickable {
                                //TODO profile clicker
                            },
                        painter = painterResource(id = R.drawable.profile),
                        contentDescription = "My Profile",
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                ) {
                    Text(
                        modifier = Modifier.clickable {
                            // TODO My Friends clicker
                        },
                        text = "My friends",
                        fontSize = 15.sp,
                        color = Color.White,
                    )
                    Text(
                        modifier = Modifier.clickable {
                            //TODO discovery clicker
                        },
                        text = "Discovery",
                        fontSize = 15.sp,
                        color = Color.Gray,
                    )
                }
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(height = 5.dp, width = 0.dp)
                )
            }
        }
    ) {
        PostCard()
    }
}


@Composable
fun PostCard() {
    LazyColumn(
        modifier = Modifier
            .padding(top = 83.dp)
            .background(Color.Black)
    ) {
        items(count = 20) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Black),
                verticalAlignment = Alignment.CenterVertically,

                ) {
                Image(
                    modifier = Modifier
                        .padding(start = 16.dp, top = 6.dp, bottom = 6.dp, end = 8.dp)
                        .size(30.dp)
                        .clip(CircleShape),
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Profile",
                )
                Column {
                    Text(
                        text = "username",
                        fontSize = 15.sp,
                        color = Color.White,
                    )
                    Text(
                        text = "2:41:56 PM",
                        fontSize = 15.sp,
                        color = Color.Gray,
                    )


                }
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    modifier = Modifier.padding(end = 10.dp),
                    painter = painterResource(id = R.drawable.baseline_more_horiz_24),
                    contentDescription = "more horizontal",
                    tint = Color.Gray,
                )
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(height = 3.dp, width = 0.dp)
            )
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Black)
                    .clip(RoundedCornerShape(16.dp)),
                painter = painterResource(id = R.drawable.hazbik),
                contentDescription = "hazbik",
                contentScale = ContentScale.FillWidth,
            )
            Text(
                modifier = Modifier
                    .padding(start = 20.dp, top = 3.dp)
                    .clickable { //TODO add a comment
                    },
                text = "Add a comment...",
                fontSize = 15.sp,
                color = Color.Gray,

                )
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(height = 5.dp, width = 0.dp)
            )
        }
    }
}