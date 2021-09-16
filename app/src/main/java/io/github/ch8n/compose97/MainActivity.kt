package io.github.ch8n.compose97

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import io.github.ch8n.compose97.ui.components.StartBar
import io.github.ch8n.compose97.ui.theme.*

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
                                .fillMaxHeight(0.95f)
                        ) {

                            
                            Box(
                                modifier = Modifier
                                    .fillMaxSize(),
                                contentAlignment = Alignment.BottomStart
                            ) {
                                StartBar()
                            }

                        }
                        Row(
                            modifier = Modifier
                                .border(width = 1.dp, color = Gray)
                                .fillMaxWidth()
                                .height(55.dp)
                                .background(Silver)
                        ) {

                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .border(
                                        width = 1.dp,
                                        color = Black
                                    )
                                    .shadow(
                                        elevation = 2.dp
                                    )
                            ) {
                                Row {
                                    Icon(
                                        painter = painterResource(id = R.drawable.ic_windows95),
                                        contentDescription = "start button",
                                        tint = Color.Unspecified
                                    )
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Text(
                                        text = "Start",
                                        style = MaterialTheme.typography.button
                                    )
                                }
                            }

                        }
                    }
                }
            }
        }
    }
}
