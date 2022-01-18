package kaloo

import androidx.compose.material.MaterialTheme
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import kaloo.view.Home
import kotlin.system.exitProcess

object Kaloo {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Hello, world!")
        loadWindow()
    }

    private fun loadWindow(){
        application {
            MaterialTheme {
                Window(
                    title = "Kaloo",
                    onCloseRequest = ::exitApplication,
                    state = rememberWindowState()
                ){
                    Home()
                }
            }
        }
    }
}