//package com.example.olimpiada
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import com.example.olimpiada.ui.theme.OlimpiadaTheme
//import com.example.uikit.components.BigPrimaryBtn
//
//class Selects : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            OlimpiadaTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    BigPrimaryBtn(
//                        text = "Test"
//                    ) { }
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun Greeting2(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview2() {
//    OlimpiadaTheme {
//        Greeting2("Android")
//    }
//}