package com.example.myapplication.ui
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.myapplication.ui.components.CharacterItem
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val nombres = listOf("Rick","Morty","Summer")
        setContent {
            MyApplicationTheme {
                var isHome by remember{ mutableStateOf(false) }
                Box(modifier = Modifier.fillMaxSize()) {
                    Button(
                        modifier = Modifier.align(Alignment.Center),
                        onClick = { isHome = true }
                    ) {
                        Text(text = "Navegar")
                    }
                }
                if (!isHome) {
                    LazyColumn {
                        items(nombres.size){
                            CharacterItem(nombres[it])

                        }
                    }
                } else {
                    Text(text = "Ima details screen")
                }
            }
        }
    }
}
