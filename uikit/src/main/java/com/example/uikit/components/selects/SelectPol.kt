package com.example.uikit.components.selects

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SelectPol(
    onclick: () -> Unit,
    text: String,
    modifier: Modifier
) {
    DropdownMenu(
        expanded = false,
        modifier = modifier
            .width(335.dp)
            .height(48.dp),
        onDismissRequest = onclick
    ) {
        Text(
            text = text
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TestPol() {
    SelectPol(
        onclick = TODO(),
        text = TODO(),
        modifier = TODO()
    )
}


