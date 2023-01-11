package online.arenamainan.latihannavigasi.ui

import android.widget.Space
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HalSatu(
    onLanjutButtonClicked:() -> Unit = {}
) {
    Column() {
        Text("Halaman Satu")
        Row(modifier = Modifier
            .fillMaxWidth()
        ) {
            Button(
                onClick = onLanjutButtonClicked
            ) {
                Text(text = "Lanjut")
            }
        }
    }

}
