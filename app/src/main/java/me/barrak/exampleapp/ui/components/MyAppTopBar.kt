package me.barrak.exampleapp.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.*
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.tooling.preview.*
import me.barrak.exampleapp.ui.*

@Composable
fun MyAppTopBar(title: String = "Example App") {
    TopAppBar(
        title = {
            Text(text = title, maxLines = 2)
        },
        navigationIcon = {
            Icon(Icons.Rounded.Menu, contentDescription = null, modifier = Modifier.fillMaxWidth())
        },
        actions = {
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.Favorite, contentDescription = null)
            }
        }
    )
}


@Preview
@Composable
fun MyAppTopBarPreview() {
    MyApp {
        MyAppTopBar("Screen Title")
    }
}

