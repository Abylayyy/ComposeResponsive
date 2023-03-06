package kz.abylay.myresponsivecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import kz.abylay.myresponsivecompose.ui.composable.ExpandedScreen
import kz.abylay.myresponsivecompose.ui.composable.NormalScreen
import kz.abylay.myresponsivecompose.ui.composable.WindowInfo
import kz.abylay.myresponsivecompose.ui.composable.rememberWindowInfo
import kz.abylay.myresponsivecompose.ui.theme.MyResponsiveComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyResponsiveComposeTheme {
                val windowInfo = rememberWindowInfo()
                if (windowInfo.screenWidthInfo is WindowInfo.WindowType.Compact) {
                    NormalScreen()
                } else {
                    ExpandedScreen()
                }
            }
        }
    }
}