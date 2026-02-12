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
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.AssistChip
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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

// Экран главной страницы
class Glavnya : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OlimpiadaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GlavnyaSearch(
                        modifier = Modifier.padding(innerPadding)
                    )
                    GlavnyaCarts(
                        modifier = Modifier.padding(innerPadding)
                    )
                    GlavnyaDescriptionChips(
                        modifier = Modifier.padding(innerPadding)
                    )
                    GlavnyaFooterTabBar(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// Composable функция для отображения поиска описания
@Composable
fun GlavnyaSearch(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .padding(32.dp)
    ) {
        var text by rememberSaveable { mutableStateOf("") }

        TextField(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            value = text,
            onValueChange = { text = it },
            label = { Text("Искать описания") },
            leadingIcon = { Icon(Icons.Filled.Search, contentDescription = null) },
        )
    }
}

// Composable функция для отображения карточек товаров
@Composable
fun GlavnyaCarts(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .padding(32.dp)
    ) {
        Row() {
            Card(
                onClick = { /* Do something */ },
                modifier = Modifier.size(width = 180.dp, height = 100.dp)
            ) {
                Box(Modifier.fillMaxSize()) {
                    Text(
                        "Шорты вторник",
                        Modifier.align(Alignment.Center)
                    )
                }
            }
            Card(
                onClick = { /* Do something */ },
                modifier = Modifier.size(width = 180.dp, height = 100.dp)
            ) {
                Box(Modifier.fillMaxSize()) { Text("Any item", Modifier.align(Alignment.Center)) }
            }
        }
        Spacer(Modifier.height(20.dp))
    }
}

// Composable функция для отображения Chips
@Composable
fun GlavnyaDescriptionChips(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .padding(32.dp)
    ) {
        Text(
            text = "Каталог описаний"
        )

        Spacer(Modifier.height(16.dp))

        Row() {
            AssistChip(
                onClick = { /* Do something! */ },
                label = { Text("Все") },
            )

            Spacer(Modifier.width(12.dp))

            AssistChip(
                onClick = { /* Do something! */ },
                label = { Text("Женщинам") },
            )

            Spacer(Modifier.width(12.dp))

            AssistChip(
                onClick = { /* Do something! */ },
                label = { Text("Мужчинам") },
            )
        }
    }
}

// Composable функция для отображения карточек товаров
@Composable
fun GlavnyaCartsItems(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .padding(32.dp)
    ) {
        Card(
            onClick = { /* Do something */ },
            modifier = Modifier.size(width = 180.dp, height = 100.dp)
        ) {
            Box(Modifier.fillMaxSize()) {
                Text(
                    "Рубашка Воскресенье для машинного вязания",
                    Modifier.align(Alignment.Center)
                )
            }
        }

        Card(
            onClick = { /* Do something */ },
            modifier = Modifier.size(width = 180.dp, height = 100.dp)
        ) {
            Box(Modifier.fillMaxSize()) {
                Text(
                    "Рубашка Воскресенье для машинного вязания",
                    Modifier.align(Alignment.Center)
                )
            }
        }
        Spacer(Modifier.height(10.dp))
        Button(
            onClick = {},
            modifier = Modifier
                .align(Alignment.CenterHorizontally)

        ) {
            Text("Добавить")
        }
    }
}

// Composable функция для отображения нижнего AppBar
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GlavnyaFooterTabBar(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .padding(32.dp)
    ) {
        BottomAppBar(
            actions = {
                IconButton(onClick = { /* doSomething() */ }) {
                    Icon(
                        Icons.Filled.Home,
                        contentDescription = "Localized description")
                }

                Spacer(Modifier.width(32.dp))

                IconButton(onClick = { /* doSomething() */ }) {
                    Icon(
                        Icons.Filled.Edit,
                        contentDescription = "Localized description",
                    )
                }

                Spacer(Modifier.width(32.dp))


                IconButton(onClick = { /* doSomething() */ }) {
                    Icon(
                        Icons.Filled.ShoppingCart,
                        contentDescription = "Localized description",
                    )
                }

                Spacer(Modifier.width(32.dp))


                IconButton(onClick = { /* doSomething() */ }) {
                    Icon(
                        Icons.Filled.Person,
                        contentDescription = "Localized description",
                    )
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    OlimpiadaTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
            ) {
                GlavnyaSearch()
                GlavnyaCarts()
                GlavnyaDescriptionChips()
                GlavnyaCartsItems()
                GlavnyaFooterTabBar()
            }
        }
    }
}