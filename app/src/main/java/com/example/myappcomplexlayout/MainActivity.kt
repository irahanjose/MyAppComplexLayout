package com.example.myappcomplexlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myappcomplexlayout.ui.theme.MyAppComplexLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppComplexLayoutTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyComplexLayout()
                }
            }
        }
    }
}

@Composable
fun MyComplexLayout(){
    Column(Modifier.fillMaxSize()) {
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan)){

        }
        Row (
            Modifier
                .fillMaxWidth()
                .weight(1f)){
            Box (modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Red))
            Box (modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Green), contentAlignment = Alignment.Center){
                Text(text = "Hola soy ISC")
            }

        }
        Box (
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Magenta)){

        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyAppComplexLayoutTheme {
        MyComplexLayout()
    }
}