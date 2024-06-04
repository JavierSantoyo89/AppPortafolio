package dev.javiersantoyo.appportafolio.layout

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

//var presses: Int by remember { mutableIntStateOf(0) }
@Composable
fun FloatingActionButton(){
    androidx.compose.material3.FloatingActionButton(onClick = { }) {
        Icon(Icons.Default.Add, contentDescription = "Add")
    }
}