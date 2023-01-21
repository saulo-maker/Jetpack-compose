package com.example.estudar

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Teste()
        }
    }
}

@Preview(showBackground = true)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Teste() {

    Scaffold() {
        Box(modifier = Modifier
            .padding(20.dp)
            .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column {
                TextFieldView()
            }
        }
    }


}

@Composable
fun TextFieldView() {

    var textState by remember {mutableStateOf(value = "")}
    var password by remember { mutableStateOf(value = "") }
    
    Column() {

        /*Image(
            painter = painterResource(id = R.drawable.logoinsta),
            contentDescription = null
        )*/

        TextField(
            value = textState,
            onValueChange = {textState = it},
            placeholder = {
                Text(text = "Your first name")
            },
            modifier = Modifier.fillMaxWidth().padding(10.dp)
        )

        TextField(
            value = password,
            onValueChange = {password = it},
            label = {
                Text(text = "Your password")
            },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier.fillMaxWidth().padding(10.dp)
        )
    }

}