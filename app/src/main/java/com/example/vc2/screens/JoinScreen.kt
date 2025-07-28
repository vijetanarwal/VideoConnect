package com.example.vc2.screens

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.vc2.ui.components.GradientOutlinedTextField

@Composable
fun JoinScreen() {
    val context = LocalContext.current
    var userId by remember { mutableStateOf("") }
    var callId by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(20.dp)
        ) {
            Text("Join Video Call", color = Color.White, fontSize = 24.sp)

            Spacer(modifier = Modifier.height(20.dp))

            GradientOutlinedTextField(
                value = userId,
                onValueChange = { userId = it },
                placeholder = "Enter User ID"
            )

            Spacer(modifier = Modifier.height(16.dp))

            GradientOutlinedTextField(
                value = callId,
                onValueChange = { callId = it },
                placeholder = "Enter Call ID"
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = {
                val intent = Intent(context, CallScreenActivity::class.java)
                intent.putExtra("user_id", userId)
                intent.putExtra("call_id", callId)
                context.startActivity(intent)
            }) {
                Text("Join Now")
            }
        }
    }
}
