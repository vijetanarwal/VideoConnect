package com.example.vc2.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.zegocloud.uikit.prebuilt.call.ZegoUIKitPrebuiltCallConfig
import com.zegocloud.uikit.prebuilt.call.ZegoUIKitPrebuiltCallFragment
import com.zegocloud.uikit.service.defines.ZegoUIKitUser
import androidx.appcompat.app.AppCompatActivity


class CallScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val userID = intent.getStringExtra("user_id") ?: "user"
        val appID: Long = 1884559822
        val appSign = "234cec03d0daae0552f6163a3e4d00d5e96da6517ca4bfc0d3b2be127e42db2b"

        val callFragment = ZegoUIKitPrebuiltCallFragment.newInstance(
            appID,
            appSign,
            userID,
            userID, // userName
            "testcall", // callID
            ZegoUIKitPrebuiltCallConfig.oneOnOneVideoCall()
        )

        supportFragmentManager.beginTransaction()
            .replace(android.R.id.content, callFragment)
            .commit()
    }
}
