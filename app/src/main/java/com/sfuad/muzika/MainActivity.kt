package com.sfuad.muzika

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.material.*
import com.sfuad.muzika.ui.theme.MusicPlayerUITheme
import com.sfuad.muzika.view.PlayerScreen


class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MusicPlayerUITheme {

                Surface(color = MaterialTheme.colors.background) {
                    PlayerScreen()
                }
            }
        }
    }
}

