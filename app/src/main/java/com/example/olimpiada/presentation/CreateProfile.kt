package com.example.olimpiada.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.olimpiada.ui.theme.OlimpiadaTheme

class CreateProfile : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OlimpiadaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CreateProfileUser(
                        modifier = Modifier.padding(innerPadding)
                    )
                    SelectsButtons(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CreateProfileUser(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .padding(32.dp)
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            text = "Создание профиля \n"
        )

        Text(
            text = "Без профиля вы не сможете создавать проекты."
        )

        Text(
            text = "В профиле будут храниться результаты проектов и ваши описания."
        )
    }
}

@Composable
fun SelectsButtons(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        var text by rememberSaveable { mutableStateOf("") }

        TextField(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            value = text,
            onValueChange = { text = it },
            label = { Text("Имя") },
        )

        TextField(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            value = text,
            onValueChange = { text = it },
            label = { Text("Отчество") },
        )

        TextField(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            value = text,
            onValueChange = { text = it },
            label = { Text("Фамилия") },
        )

        TextField(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            value = text,
            onValueChange = { text = it },
            label = { Text("Дата Рождения") },
        )

        TextField(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            value = text,
            onValueChange = { text = it },
            label = { Text("Пол") },
        )

        TextField(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            value = text,
            onValueChange = { text = it },
            label = { Text("Почта") },
        )

        Button(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            onClick = { /* Do something! */ },
            contentPadding = ButtonDefaults.ButtonWithIconContentPadding
        ) {

            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text("Далее")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    OlimpiadaTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
            ) {
                CreateProfileUser()
                SelectsButtons()
            }
        }
    }
}