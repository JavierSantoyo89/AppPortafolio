package dev.javiersantoyo.appportafolio.layout

import android.widget.Toast
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview


// FloatingActionButton/ boton flotante
@Preview
@Composable
fun FAB() {
    val context = LocalContext.current
    FloatingActionButton(onClick = {
        Toast.makeText(context, "Hola cabron!!!", Toast.LENGTH_SHORT).show()
    }) {
        Text("X")
    }
}