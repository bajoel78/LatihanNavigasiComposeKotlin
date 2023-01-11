package online.arenamainan.latihannavigasi.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HalDua(
    onLanjutButtonClicked:() -> Unit,
    onKembaliButtonClicked:() -> Unit
) {
    Column() {
        Text("Halaman Dua")
        Row(modifier = Modifier
            .fillMaxWidth()
        ) {
            Button(
                onClick = onKembaliButtonClicked,
            ) {
                Text(text = "Kembali")
            }
            Spacer(modifier = Modifier
                .width(20.dp))
            Button(
                onClick = onLanjutButtonClicked,
            ) {
                Text(text = "Lanjut")
            }
        }
    }
}