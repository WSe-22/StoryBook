package com.example.olimpiada.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MenuAnchorType
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.olimpiada.ui.theme.OlimpiadaTheme

// Экран отображения создания проекта
class CreateProject : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OlimpiadaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CreateProjectUser(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// Composable функция для отображения экрана создания проекта
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateProjectUser(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .padding(32.dp)
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            text = "Создать проект"
        )

        Spacer(Modifier.height(20.dp))

        var text by rememberSaveable { mutableStateOf("") }

        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Выберите тип") },
        )

        Spacer(Modifier.height(20.dp))

        var textProject by rememberSaveable { mutableStateOf("") }

        TextField(
            value = textProject,
            onValueChange = { textProject = it },
            label = { Text("Название проекта") },
            placeholder = { Text("Введите имя") }
        )

        Spacer(Modifier.height(20.dp))

        var textDateStart by rememberSaveable { mutableStateOf("") }

        TextField(
            value = textDateStart,
            onValueChange = { textDateStart = it },
            label = { Text("Дата начала") },
            placeholder = { Text("--.--.----") }
        )

        Spacer(Modifier.height(20.dp))

        var textDateEnd by rememberSaveable { mutableStateOf("") }

        TextField(
            value = textDateEnd,
            onValueChange = { textDateEnd = it },
            label = { Text("Дата Окончания") },
            placeholder = { Text("--.--.----") }
        )

        Spacer(Modifier.height(20.dp))

        var textHer by rememberSaveable { mutableStateOf("") }

        TextField(
            value = textHer,
            onValueChange = { textHer = it },
            label = { Text("Кому") },
            placeholder = { Text("Выбрать кому") }
        )

        Spacer(Modifier.height(20.dp))

        var textDescription by rememberSaveable { mutableStateOf("") }

        TextField(
            value = textDescription,
            onValueChange = { textDescription = it },
            label = { Text("Источник описания") },
            placeholder = { Text("example.com") }
        )

        Spacer(Modifier.height(20.dp))

        var textCategory by rememberSaveable { mutableStateOf("") }

        TextField(
            value = textCategory,
            onValueChange = { textCategory = it },
            label = { Text("Категория") },
            placeholder = { Text("Выберите категорию") }
        )

        Spacer(Modifier.height(20.dp))

        Button(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            onClick = {}
        ) {
            Text(
                text = "Подтвердить"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview7() {
    OlimpiadaTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
            ) {
                CreateProjectUser()
            }
        }
    }
}