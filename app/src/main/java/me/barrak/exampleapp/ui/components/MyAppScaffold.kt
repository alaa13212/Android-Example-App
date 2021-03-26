package me.barrak.exampleapp.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.tooling.preview.*
import me.barrak.exampleapp.ui.*

@Composable
fun MyAppScaffold(title: String = "Example App", content: @Composable () -> Unit) {
    Scaffold(
        topBar = { MyAppTopBar(title) }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            content()
        }
    }
}


@Preview
@Composable
fun MyAppScaffoldPreview() {
    MyApp {
        MyAppScaffold {
            Text(text = "Test Scaffold")
        }
    }
}

