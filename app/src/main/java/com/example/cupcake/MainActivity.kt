
package com.example.cupcake

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import com.example.cupcake.ui.theme.CupcakeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            CupcakeTheme {
                CupcakeApp()
            }
        }
    }
}

@Preview
@Composable
fun MyAppCupcake() {
    CupcakeTheme {
        CupcakeApp()
    }
}
