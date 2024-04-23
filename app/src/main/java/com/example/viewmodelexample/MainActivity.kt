package com.example.viewmodelexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.viewmodelexample.main.BookViewModel
import com.example.viewmodelexample.main.MainScreen
import com.example.viewmodelexample.ui.theme.ViewmodelExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bookViewModel by viewModels<BookViewModel>()
        setContent {
            ViewmodelExampleTheme {
                MainScreen(bookViewModel = BookViewModel())
            }
        }
    }
}



@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    ViewmodelExampleTheme {
        MainScreen(bookViewModel = BookViewModel())
    }
}