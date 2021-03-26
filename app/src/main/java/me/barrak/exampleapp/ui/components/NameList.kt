package me.barrak.exampleapp.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.tooling.preview.*
import me.barrak.exampleapp.*
import me.barrak.exampleapp.ui.*

@Composable
fun NameList(names: List<String>, modifier: Modifier) {
    LazyColumn(modifier = modifier) {
        items (items = names) { name ->
            PhotographerCard()
        }
    }
}


@Preview
@Composable
fun NameListPreview() {
    MyApp {
        NameList(names = List(20) {"Name $it"}, modifier = Modifier.fillMaxHeight())
    }
}