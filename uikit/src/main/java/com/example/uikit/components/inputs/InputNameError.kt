package com.example.uikit.components.inputs

import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun InputNameError(
    modifier: Modifier = Modifier
) {
    TextField(
        state = rememberTextFieldState(),
        label = { Text(text = "Введите имя") },
    )
}

@Preview(showBackground = false)
@Composable
fun testInputNameError() {
    InputNameError(
    )
}