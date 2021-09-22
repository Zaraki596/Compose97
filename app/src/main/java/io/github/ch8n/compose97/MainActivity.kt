package io.github.ch8n.compose97

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.ch8n.compose97.ui.components.desktop.Desktop
import io.github.ch8n.compose97.ui.components.startbar.StartMenu
import io.github.ch8n.compose97.ui.components.taskbar.TaskBar
import io.github.ch8n.compose97.ui.theme.Compose97Theme
import io.github.ch8n.compose97.ui.theme.Teal

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose97Theme {
                Surface(
                    color = Teal,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight(0.95f),
                        ) {
                            Desktop()
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.BottomStart
                            ) {
                                StartMenu()
                            }
                        }
                        TaskBar(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(55.dp)
                        )
                    }
                }
            }
        }
    }
}
