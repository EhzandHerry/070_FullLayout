package com.example.activity4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
import com.example.activity4.ui.theme.Activity4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Activity4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    Activity4Theme {
        HomeScreen()

    }
}

@Composable
fun HomeScreen(){
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
        .fillMaxSize()
        .padding(15.dp)) {
        Text(text = "WEATHER APP",
            fontSize = 25.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.padding(13.dp))
        Box1()
        Spacer(modifier = Modifier.padding(13.dp))
        LocationTemp()
        Spacer(modifier = Modifier.padding(13.dp))
        Box2()
    }
}

@Composable
fun Box1(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(25.dp))
        .background(color = Color.Cyan)) {
        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(id = R.drawable.Wheather),
                contentDescription = null, modifier = Modifier.size(200.dp))
            Text(text = "Hot")
        }

    }
}

@Composable
fun LocationTemp(){
    Text(text = "21 C", fontWeight = FontWeight.Bold, fontSize = 64.sp)
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(painter = painterResource(id = R.drawable.baseline_location_on_24), contentDescription = null )
        Spacer(modifier = Modifier.padding(3.dp))
        Text(text = "Kasihan, Bantul, Daerah Istimewa Yogyakarta",
            fontSize = 14.sp, color = Color.Gray)


    }

}
@Composable
fun Box2() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(25.dp))
            .background(color = Color.Cyan)) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(3.dp)) {
                    Text(
                        text = "Humidity")
                    Text(
                        text = "98%",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp)

                    Spacer(modifier = Modifier.padding(30.dp))

                    Text(
                        text = "Sunrise")
                    Text(
                        text = "05.00 AM",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp)
                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(3.dp)) {
                    Text(
                        text = "UV Index")
                    Text(
                        text = "9 / 10",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp)

                    Spacer(modifier = Modifier.padding(30.dp))

                    Text(
                        text = "Sunset")
                    Text(
                        text = "05.40 PM",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp)
                }
            }
        }
    }
}

    


