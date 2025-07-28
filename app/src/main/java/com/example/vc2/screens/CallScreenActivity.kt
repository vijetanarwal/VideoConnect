package com.example.vc2.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zegocloud.uikit.prebuilt.call.ZegoUIKitPrebuiltCallConfig
import com.zegocloud.uikit.prebuilt.call.ZegoUIKitPrebuiltCallFragment

class CallScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val userID = intent.getStringExtra("user_id") ?: "user"
        val callID = intent.getStringExtra("call_id") ?: "defaultroom"

        val appID: Long = 1884559822L
        val appSign = "234ce0cd30d80ae0552f6163e3ed4d005e96da6517c4bfc0d3b2be127e42db2b"

        val callFragment = ZegoUIKitPrebuiltCallFragment.newInstance(
            appID,
            appSign,
            userID,
            userID,
            callID,
            ZegoUIKitPrebuiltCallConfig.oneOnOneVideoCall()
        )

        supportFragmentManager.beginTransaction()
            .replace(android.R.id.content, callFragment)
            .commit()
    }
}
