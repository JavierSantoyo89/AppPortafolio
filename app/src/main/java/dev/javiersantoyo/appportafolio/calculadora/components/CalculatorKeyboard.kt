package dev.javiersantoyo.appportafolio.calculadora.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
//CalculatorKeyboard(total = total)
//fun CalculatorKeyboard(total: Int) {

fun CalculatorKeyboard(viewModel: CalculatorKeyboardViewModel) {
//    var dataNum by remember {
//        mutableIntStateOf(0)
//    }
//    var dataNum2 by remember {
//        mutableIntStateOf(0)
//    }
//    var subTotal by rememberSavable {
//        mutableIntStateOf(0)
//    }
val dataNum :Int by viewModel.dataNum.observeAsState(initial = 0)
    val dataNum2 :Int by viewModel.dataNum2.observeAsState(initial = 0)
    val subTotal : Int by viewModel.subTotal.observeAsState(initial = 0)
//    var total : Int by viewModel.subTotal.observeAsState(initial = 0)

    fun sum(subTotal: Int = 0, dataNum: Int = 0) {
        subTotal + dataNum
    }

    fun rest(subTotal: Int, dataNum: Int, dataNum2: Int): Int {
        var rest = subTotal + dataNum
        var subTotalResta = rest
        return subTotalResta - dataNum2
    }
//val sum =  subTotal + dataNum

    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .systemBarsPadding()
    ) {
// AC Row
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            OutlinedButton(
                onClick = { println(dataNum) }, modifier = Modifier
                    .size(90.dp)
                    .padding(15.dp)
            ) {
                Text("AC")
            }
            OutlinedButton(
                onClick = {  }, modifier = Modifier
                    .size(90.dp)
                    .padding(15.dp)
            ) {
                Text("()")
            }
            OutlinedButton(
                onClick = {  }, modifier = Modifier
                    .size(90.dp)
                    .padding(15.dp)
            ) {
                Text("%")
            }
            OutlinedButton(
                onClick = {  }, modifier = Modifier
                    .size(90.dp)
                    .padding(15.dp)
            ) {
                Text("/")
            }
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            OutlinedButton(
                onClick = {  },
                modifier = Modifier
                    .size(90.dp)
                    .padding(15.dp)
            ) {
                Text("7")
            }
            OutlinedButton(
                onClick = {  }, modifier = Modifier
                    .size(90.dp)
                    .padding(15.dp)
            ) {
                Text("8")
            }
            OutlinedButton(
                onClick = {  }, modifier = Modifier
                    .size(90.dp)
                    .padding(15.dp)
            ) {
                Text("9")
            }
            OutlinedButton(
                onClick = {  }, modifier = Modifier
                    .size(90.dp)
                    .padding(15.dp)
            ) {
                Text("X")
            }
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            OutlinedButton(
                onClick = { }, modifier = Modifier
                    .size(90.dp)
                    .padding(15.dp)
            ) {
                Text("4")
            }
            OutlinedButton(
                onClick = {  }, modifier = Modifier
                    .size(90.dp)
                    .padding(15.dp)
            ) {
                Text("5")
            }
            OutlinedButton(
                onClick = {  }, modifier = Modifier
                    .size(90.dp)
                    .padding(15.dp)
            ) {
                Text("6")
            }
            OutlinedButton(
                onClick = {  }, modifier = Modifier
                    .size(90.dp)
                    .padding(15.dp)
            ) {
                Text("-")
            }
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            OutlinedButton(
                onClick = {  }, modifier = Modifier
                    .size(90.dp)
                    .padding(15.dp)
            ) {
                Text("1")
            }
            OutlinedButton(
                onClick = { println(subTotal) }, modifier = Modifier
                    .size(90.dp)
                    .padding(15.dp)
            ) {
                Text("2")
            }
            OutlinedButton(
                onClick = { println("La resta es: ${rest(subTotal, dataNum, dataNum2)} ") },
                modifier = Modifier
                    .size(90.dp)
                    .padding(15.dp)
            ) {
                Text("3")
            }
            OutlinedButton(
                onClick = { sum(subTotal, dataNum) }, modifier = Modifier
                    .size(90.dp)
                    .padding(15.dp)
            ) {
                Text("+")
            }
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            OutlinedButton(
                onClick = {  }, modifier = Modifier
                    .size(90.dp)
                    .padding(15.dp)
            ) {
                Text("0")
            }
            OutlinedButton(
                onClick = {  }, modifier = Modifier
                    .size(90.dp)
                    .padding(15.dp)
            ) {
                Text(".")
            }
            OutlinedButton(
                onClick = {  }, modifier = Modifier
                    .size(90.dp)
                    .padding(15.dp)
            ) {
                Text("Ret")
            }
            OutlinedButton(
                onClick = { }, modifier = Modifier
                    .size(90.dp)
                    .padding(15.dp)
            ) {
                Text("=")
            }

        }

    }
}