package com.example.olimpiada.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.olimpiada.ui.theme.OlimpiadaTheme

class CreateEichPassword : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OlimpiadaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
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

@Composable
fun CreateEichPasswordUser(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .padding(32.dp)
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            text = "Создайте пароль"
        )

        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            text = "Для защиты ваших персональных данных"
        )

        Spacer(Modifier.height(56.dp))

        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        ) {
            Button(
                onClick = {},
            ) {
                Text("1")
            }
            Spacer(Modifier.width(12.dp))
            Button(
                onClick = {},
            ) {
                Text("2")
            }
            Spacer(Modifier.width(12.dp))
            Button(
                onClick = {},
            ) {
                Text("3")
            }
        }

        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        ) {
            Button(
                onClick = {},
            ) {
                Text("4")
            }
            Spacer(Modifier.width(12.dp))
            Button(
                onClick = {},
            ) {
                Text("5")
            }
            Spacer(Modifier.width(12.dp))
            Button(
                onClick = {},
            ) {
                Text("6")
            }
        }

        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        ) {
            Button(
                onClick = {},
            ) {
                Text("7")
            }
            Spacer(Modifier.width(12.dp))
            Button(
                onClick = {},
            ) {
                Text("8")
            }
            Spacer(Modifier.width(12.dp))
            Button(
                onClick = {},
            ) {
                Text("9")
            }
        }

        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        ) {
            Button(
                onClick = {},
            ) {
                Text("0")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    OlimpiadaTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
            ) {
                CreateEichPasswordUser()
            }
        }
    }
}