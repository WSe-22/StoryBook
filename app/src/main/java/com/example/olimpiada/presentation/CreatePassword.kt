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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.olimpiada.ui.theme.OlimpiadaTheme

class CreatePassword : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OlimpiadaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting2(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun CreatePasswordUser() {
    Column(
        modifier = Modifier
            .padding(32.dp)
    ) {
        Text(
            text = "Создание пароля \n"
        )

        Text(
            text = "Введите новый пароль \n"
        )

        var password by rememberSaveable { mutableStateOf("") }
        var passwordHidden by rememberSaveable { mutableStateOf(true) }
        TextField(
            value = password,
            onValueChange = { password = it },
            singleLine = true,
            label = { Text("Пароль") },
            visualTransformation =
                if (passwordHidden) PasswordVisualTransformation() else VisualTransformation.None,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            trailingIcon = {
                IconButton(onClick = { passwordHidden = !passwordHidden }) {
                    val visibilityIcon =
                        if (passwordHidden) Icons.Filled.Refresh else Icons.Filled.Refresh
                    // Please provide localized description for accessibility services
                    val description = if (passwordHidden) "Показать пароль" else "Скрыть пароль"
                    Icon(imageVector = visibilityIcon, contentDescription = description)
                }
            }
        )
        Spacer(Modifier.height(20.dp))

        var passwordConfirm by rememberSaveable { mutableStateOf("") }
        var passwordHiddenConfirm by rememberSaveable { mutableStateOf(true) }
        TextField(
            value = passwordConfirm,
            onValueChange = { passwordConfirm = it },
            singleLine = true,
            label = { Text("Пароль") },
            visualTransformation =
                if (passwordHiddenConfirm) PasswordVisualTransformation() else VisualTransformation.None,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            trailingIcon = {
                IconButton(onClick = { passwordHiddenConfirm = !passwordHiddenConfirm }) {
                    val visibilityIcon =
                        if (passwordHiddenConfirm) Icons.Filled.Refresh else Icons.Filled.Refresh
                    // Please provide localized description for accessibility services
                    val description = if (passwordHiddenConfirm) "Показать пароль" else "Скрыть пароль"
                    Icon(imageVector = visibilityIcon, contentDescription = description)
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    OlimpiadaTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
            ) {
                CreatePasswordUser()
            }
        }
    }
}