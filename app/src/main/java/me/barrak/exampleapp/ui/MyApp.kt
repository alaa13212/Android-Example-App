package me.barrak.exampleapp.ui

import androidx.compose.material.*
import androidx.compose.runtime.*
import me.barrak.exampleapp.ui.theme.*

@Composable
fun MyApp(content: @Composable () -> Unit) {
    AndroidExampleAppTheme {
        Surface {
            content()
        }
    }
}

