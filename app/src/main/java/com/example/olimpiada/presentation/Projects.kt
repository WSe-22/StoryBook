package com.example.olimpiada.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.olimpiada.ui.theme.OlimpiadaTheme

// Экран отображения проектов
class Projects : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OlimpiadaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ProjectList(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

// Composable функция для отображения экрана с проектами
@Composable
fun ProjectList(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .padding(32.dp)
    ) {
        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = "Проекты"
            )
        }

        Column(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        ) {
            Spacer(Modifier.height(40.dp))
            Card(
                onClick = { /* Do something */ },
                modifier = Modifier.size(width = 180.dp, height = 100.dp)
            ) {
                Box(Modifier.fillMaxSize()) {
                    Text(
                        "Мой первый проект",
                        Modifier.align(Alignment.Center)
                    )
                }
            }
            Button(
                onClick = {

                },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)

            ) {
                Text("Открыть")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview6() {
    OlimpiadaTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
            ) {
                ProjectList()
            }
        }
    }
}