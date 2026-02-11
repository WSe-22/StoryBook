package com.example.olimpiada

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withLink
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.olimpiada.presentation.CreateProfile
import com.example.olimpiada.ui.theme.OlimpiadaTheme
import com.example.uikit.components.BigPrimaryBtn
import com.example.uikit.components.TestBigPrimaryBtn
import com.example.uikit.components.inputs.InputName
import com.example.uikit.components.inputs.InputNameError
import com.example.uikit.components.selects.SelectPol

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OlimpiadaTheme() {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    ) {
                        SignIn(
                            modifier = Modifier.padding(innerPadding)
                        )
                        AnySignIn(
                            modifier = Modifier.padding(innerPadding)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun SignIn(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(32.dp)
    ) {
        Text(
            text = "Добро пожаловать\n"
        )
        Text(
            text = "Войдите, чтобы пользоваться функциями приложения \n"
        )

        var text by rememberSaveable { mutableStateOf("") }

        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Вход по E-mail") },
            placeholder = { Text("example@gmail.com") }
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

        Button(
            onClick = {

            },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        ) {
            Text("Далее")
        }

        val url = ""

        val linkColor = MaterialTheme.colorScheme.primary
        val linkStyle = SpanStyle(color = linkColor, textDecoration = TextDecoration.Underline)

        val annotatedString = buildAnnotatedString {
            withLink(LinkAnnotation.Url(url = url, styles = TextLinkStyles(style = linkStyle))) {
                append("Зарегистрироваться")
            }
        }
        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            text = annotatedString
        )

    }
}

@Composable
fun AnySignIn(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .padding(32.dp),
    ) {
        Text(
            modifier = Modifier,
            text = "Или войдите с помощью",
        )

        Button(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            onClick = { /* Do something! */ },
            contentPadding = ButtonDefaults.ButtonWithIconContentPadding
        ) {
            Icon(
                Icons.Filled.Favorite,
                contentDescription = "Localized description",
                modifier = Modifier.size(ButtonDefaults.IconSize)
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text("Войти с VK")
        }

        Button(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            onClick = { /* Do something! */ },
            contentPadding = ButtonDefaults.ButtonWithIconContentPadding
        ) {
            Icon(
                Icons.Filled.Favorite,
                contentDescription = "Localized description",
                modifier = Modifier.size(ButtonDefaults.IconSize)
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text("Войти с Yandex")
        }
    }
}

@Preview(showBackground = false)
@Composable
fun TestAll() {
    OlimpiadaTheme() {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
            ) {
                SignIn()
                AnySignIn()

            }
        }
    }
}