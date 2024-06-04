package dev.javiersantoyo.appportafolio.calculadora

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import dev.javiersantoyo.appportafolio.calculadora.components.CalculatorKeyboard
import dev.javiersantoyo.appportafolio.calculadora.components.CalculatorKeyboardViewModel
import dev.javiersantoyo.appportafolio.calculadora.components.DisplayScreen
import dev.javiersantoyo.appportafolio.calculadora.components.ImageCounter
import dev.javiersantoyo.appportafolio.ui.theme.AppPortafolioTheme

@Composable
fun MainCalculator() {
    var total:Int by remember {
        mutableIntStateOf(0)
    }
    AppPortafolioTheme {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
        ) {
            item {
                ImageCounter()
//                DisplayScreen()
                CalculatorKeyboard(CalculatorKeyboardViewModel())
            }
        }
    }
}



//fun isCounter() {
//    println("La function total es:")
//}
