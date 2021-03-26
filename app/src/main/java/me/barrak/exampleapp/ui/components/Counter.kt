package me.barrak.exampleapp.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.tooling.preview.*
import me.barrak.exampleapp.ui.*

@Composable
fun Counter(count: Int, updateCount: (Int) -> Unit) {
    Button(
        onClick = { updateCount(count + 1) },
        modifier = Modifier
            .fillMaxWidth(),
        shape = RectangleShape,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = if (count > 5) MaterialTheme.colors.primary else MaterialTheme.colors.secondary
        )
    ) {
        Text("I've been clicked $count times")
    }
}



@Preview
@Composable
fun CounterPreview() {
    MyApp {
        var count by remember { mutableStateOf(0) }
        Counter(count = count, updateCount = {newCount -> count = newCount})
    }
}