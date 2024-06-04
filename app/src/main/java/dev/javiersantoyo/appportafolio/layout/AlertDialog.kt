package dev.javiersantoyo.appportafolio.layout

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material3.AlertDialog
@Composable
fun AlertDialog(){
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
        Button(onClick = {  }) {
            Text(text = "Dialogo")
        }
    }
}

@Composable
fun MyDialog(){
    AlertDialog(
//        onDismissRequest = {  },
//        confirmButton = {  },
//        title = { Text(text = "Prueba Alert dialog")},
//        text = { Text(text = "Esto es el contenido de la alerta")}
    )
}