package com.example.vc2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.vc2.ui.theme.VC2Theme
import com.example.vc2.screens.JoinScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VC2Theme {
                JoinScreen()
            }
        }
    }
}
