package dev.javiersantoyo.appportafolio.calculadora.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import dev.javiersantoyo.appportafolio.R

@Composable
fun ImageCounter() {

    var total:Int by remember {
        mutableIntStateOf(0)
    }

    fun isCounter(): Int {
        total += 1
        println("el total es: $total")
        return total

    }
    Image(
        painter = painterResource(id = R.drawable.ed),
        contentDescription = "Javier Santoyo App",
        modifier = Modifier
            .fillMaxSize()
            .height(400.dp)
            .clickable { isCounter() }
    )
}

