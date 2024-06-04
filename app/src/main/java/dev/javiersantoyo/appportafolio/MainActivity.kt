package dev.javiersantoyo.appportafolio

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import dev.javiersantoyo.appportafolio.calculadora.MainCalculator
import dev.javiersantoyo.appportafolio.layout.BottomBar
import dev.javiersantoyo.appportafolio.layout.FloatingActionButton
import dev.javiersantoyo.appportafolio.layout.TopAppBar
import dev.javiersantoyo.appportafolio.ui.theme.AppPortafolioTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
//    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppPortafolioTheme {
//                var presses by remember { mutableIntStateOf(0) }
                Scaffold(
                    topBar = { TopAppBar() },
                    bottomBar = { BottomBar() },
                    floatingActionButton = { FloatingActionButton() })
                {
                    MainCalculator()
                }
            }
        }
    }
}
