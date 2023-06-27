package com.example.tip_calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tip_calculator.ui.theme.Tip_CalculatorTheme
import com.example.tip_calculator.ui.theme.myfont
import androidx.compose.runtime.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            tipcalc()
        }
    }
}


@Preview
@Composable
fun tipcalc(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black), horizontalAlignment = Alignment.CenterHorizontally) {
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
                Text(text = "Tip Calculator", fontFamily = myfont, color = Color.White, modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp), fontSize = 36.sp, textAlign = TextAlign.Center)
            }
            Row(modifier = Modifier

                .background(Color.White, RoundedCornerShape(40.dp))
                .padding(16.dp,), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
                OutLineTextFieldSample("Bill Amount")
            }
        Spacer(modifier = Modifier.height(10.dp))
            Row(modifier = Modifier

                .background(Color.White, RoundedCornerShape(40.dp))
                .padding(16.dp,), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
            OutLineTextFieldSample("Discount Percentage")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.White)) {
            Text(text = "Calculate", color = Color.Black, fontFamily = myfont)
        }
        Row(){
            Text(text = "The calculated tip for the Given amount is: ")
        }


    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OutLineTextFieldSample(parameters:String) {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(
        value = text,
        label = { Text(text = "Enter the $parameters") },
        onValueChange = {
            text = it
        }
    )
}

