package online.arenamainan.latihannavigasi.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable


@Composable
fun HalEmpat(
    onKembaliButtonClicked:() -> Unit = {}
) {
    Column() {
        Text("Halaman Empat")
        Button(
            onClick = onKembaliButtonClicked
        ) {
            Text(text = "Kembali")
        }
    }
}