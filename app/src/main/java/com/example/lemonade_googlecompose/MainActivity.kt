package com.example.lemonade_googlecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MonotonicFrameClock
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade_googlecompose.ui.theme.Lemonade_GoogleComposeTheme
import androidx.compose.runtime.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lemonade()
        }
    }
}

@Composable
fun Lemonade(){
    var stepcount by remember {
        mutableStateOf(0)
    }
    var random = (2..5).random()
    Row(modifier = Modifier
        .background(Color.Yellow)
        .fillMaxWidth(), horizontalArrangement = Arrangement.Center,) {
        Text(text = "Lemonade", fontSize = 36.sp, modifier = Modifier.padding(32.dp), fontWeight = FontWeight.Bold)
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)) {
        when(stepcount){
            0->{
                Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                    Image(painter = painterResource(id = R.drawable.lemon_tree), contentDescription = "lemontree", modifier = Modifier
                        .background(shape = RoundedCornerShape(20.dp), color = Color.Green)
                        .clickable {stepcount++ })
                    Text(text = stringResource(id = R.string.tap), modifier = Modifier.padding(24.dp), fontSize = 16.sp)
                }
            }
            1->{
                Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                    Image(painter = painterResource(id = R.drawable.lemon_squeeze), contentDescription = "lemontree", modifier = Modifier
                        .background(shape = RoundedCornerShape(20.dp), color = Color.Green)
                        .clickable {stepcount++ })
                    Text(text = stringResource(id = R.string.keeptapping), modifier = Modifier.padding(24.dp), fontSize = 16.sp)
            }
        }
            random->{
                Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                    Image(painter = painterResource(id = R.drawable.lemon_squeeze), contentDescription = "lemontree", modifier = Modifier
                        .background(shape = RoundedCornerShape(20.dp), color = Color.Green)
                        .clickable {stepcount++ })
                    Text(text = stringResource(id = R.string.keeptapping), modifier = Modifier.padding(24.dp), fontSize = 16.sp)
            }}
            random+1->{
                Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                    Image(painter = painterResource(id = R.drawable.lemon_drink), contentDescription = "lemontree", modifier = Modifier
                        .background(shape = RoundedCornerShape(20.dp), color = Color.Green)
                        .clickable {stepcount++ })
                    Text(text = stringResource(id = R.string.taponlemonade), modifier = Modifier.padding(24.dp), fontSize = 16.sp)
            }
            }
        }








}}

