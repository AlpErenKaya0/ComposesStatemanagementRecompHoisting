package com.alperen.composes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OtherScreen() {
    Surface(color = Color.Blue) {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            var myString = remember { mutableStateOf("Adi neydi") }
            var myInteger = remember{ mutableStateOf(10) }

            TextField(value = myString.value , onValueChange = {
                myString.value = it
                println(myString.value)
            })

            Spacer(modifier = Modifier.padding(20.dp))

            var textString = remember { mutableStateOf("Hello") }

            Text(
                text = textString.value,
                fontSize = 30.sp,
                color = Color.Yellow
            )

            Spacer(modifier = Modifier.padding(7.dp))

            Button(onClick = {
                textString.value = "Android"
            }) {
                Text("Button Adi")
                Text("adad")
            }

            Spacer(modifier = Modifier.padding(7.dp))

            Image(modifier = Modifier.size(80.dp,80.dp), bitmap = ImageBitmap.imageResource(id = R.drawable.atam), contentDescription ="Marshall Mustafa Kemal's Photo" )
        }

    }
}
