package dev.javiersantoyo.appportafolio.calculadora.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable

//total: Int?
fun DisplayScreen(viewModel: CalculatorKeyboardViewModel, total: Int,  ) {
//    var total:Int by remember {
//        mutableIntStateOf(0)
//    }
    var total: Unit = viewModel.isCounter(total=total)


    Text(
text = total.toString(),
//        text = viewModel.isCounter(total),
//        text = displayTotal.toString(),
        fontSize = 32.sp,
        color = Color.Black,
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Color.Gray
            ),
        textAlign = TextAlign.Right
    )
}