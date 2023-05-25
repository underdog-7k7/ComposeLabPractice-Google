package com.example.codelabs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.F
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.codelabs.ui.theme.CodelabsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodelabsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(verticalArrangement = Arrangement.Top) {
                        Image(painter = painterResource(id = R.drawable.bg_compose_background), contentDescription ="firstimage" )
                        Text(text = stringResource(id = R.string.heading1), fontFamily = FontFamily.SansSerif, fontSize = 30.sp, textAlign = TextAlign.Center, modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp))
                        Text(text = stringResource(id = R.string.intropara1),fontFamily = FontFamily.SansSerif, modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp), textAlign = TextAlign.Justify)
                        Text(text = stringResource(id = R.string.para1),fontFamily = FontFamily.SansSerif, modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp), textAlign = TextAlign.Justify)
                        
                    }

                }
            }
        }
    }
}

