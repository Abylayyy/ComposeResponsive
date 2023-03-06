package kz.abylay.myresponsivecompose.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ExpandedScreen() {
    Row(modifier = Modifier.fillMaxWidth()) {
        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {
            items(10) {
                Text(
                    text = "Item $it",
                    fontSize = 25.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Cyan)
                        .padding(16.dp)
                )
            }
        }
        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {
            items(10) {
                Text(
                    text = "Item $it",
                    fontSize = 25.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Green)
                        .padding(16.dp)
                )
            }
        }
    }
}