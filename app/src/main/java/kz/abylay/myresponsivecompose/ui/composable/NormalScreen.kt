package kz.abylay.myresponsivecompose.ui.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Slider
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kz.abylay.myresponsivecompose.ui.ProfileHeader

@Composable
fun NormalScreen() {
    Column {
        var progress by remember {
            mutableStateOf(0f)
        }
        ProfileHeader(progress = progress)
        Spacer(modifier = Modifier.height(32.dp))
        Slider(
            value = progress,
            onValueChange = {
                progress = it
            },
            modifier = Modifier.padding(horizontal = 32.dp)
        )
    }
}