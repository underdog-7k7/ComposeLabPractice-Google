package com.example.compose_quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_quadrant.ui.theme.ComposeQuadrantTheme
import com.example.compose_quadrant.ui.theme.col1
import com.example.compose_quadrant.ui.theme.col2
import com.example.compose_quadrant.ui.theme.col3
import com.example.compose_quadrant.ui.theme.col4

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                        quadrantui()
                }
            }
        }
    }
}

@Composable
fun quadrantui(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Red)) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(0.5f)
        ) {
            Column(modifier = Modifier
                .background(col1)
                .weight(0.5f)
                .padding(16.dp)
                .fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                Text(text = "Text Composable", modifier = Modifier.padding(bottom = 16.dp),fontWeight = FontWeight.Bold)
                Text(text = stringResource(id = R.string.quad1),textAlign = TextAlign.Center)

            }

            Column(modifier = Modifier
                .background(col2)
                .weight(0.5f)
                .padding(16.dp)
                .fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally,verticalArrangement = Arrangement.Center

            ) {
                Text(text ="Image Composable",modifier = Modifier.padding(bottom = 16.dp), fontWeight = FontWeight.Bold)
                Text(text = stringResource(id = R.string.quad2),textAlign = TextAlign.Center)
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(0.5f)

            ) {
            Column(modifier = Modifier
                .background(col3)
                .weight(0.5f)
                .padding(16.dp)
                .fillMaxHeight(),horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
                ) {
                Text(text = "Row Composable",modifier = Modifier.padding(bottom = 16.dp),fontWeight = FontWeight.Bold)
                Text(text = stringResource(id = R.string.quad3), textAlign = TextAlign.Center)
            }

            Column(modifier = Modifier
                .background(col4)
                .weight(0.5f)
                .padding(16.dp)
                .fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally,verticalArrangement = Arrangement.Center) {
                Text(text = "Column Composable",modifier = Modifier.padding(bottom = 16.dp),fontWeight = FontWeight.Bold)
                Text(text = stringResource(id = R.string.quad4),textAlign = TextAlign.Center)
            }
        }

    }
}

@Preview
@Composable
fun previewquadrantui(){
quadrantui()
}

