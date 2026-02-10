package com.example.uikit.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BigInactiveBtn(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .width(335.dp)
            .height(56.dp)
        ,
    )
    {
        Text(
            text = text
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TestBigInactiveBtn() {
    BigInactiveBtn(
        text = "test"
    ) {
        
    }
}