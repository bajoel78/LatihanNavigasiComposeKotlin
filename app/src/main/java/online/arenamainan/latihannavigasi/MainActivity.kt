package online.arenamainan.latihannavigasi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import online.arenamainan.latihannavigasi.ui.*


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
             AppNavigasi()
        }
    }
}

@Composable
fun AppNavigasi() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NamaScreen.HalSatu.name
    ) {
        composable(route = NamaScreen.HalSatu.name) {
            HalSatu(
                onLanjutButtonClicked = {navController.navigate(NamaScreen.HalDua.name)}
            )
        }
        composable(route = NamaScreen.HalDua.name) {
            HalDua(
                onLanjutButtonClicked = {navController.navigate(NamaScreen.HalTiga.name)},
                onKembaliButtonClicked= {navController.navigate(NamaScreen.HalSatu.name)}
            )
        }
        composable(route = NamaScreen.HalTiga.name) {
            HalTiga(
                onLanjutButtonClicked = {navController.navigate(NamaScreen.HalEmpat.name)},
                onKembaliButtonClicked= {navController.navigate(NamaScreen.HalDua.name)}
            )
        }
        composable(route = NamaScreen.HalEmpat.name) {
            HalEmpat(
                onKembaliButtonClicked= {navController.navigate(NamaScreen.HalDua.name)}
            )
        }
    }
}