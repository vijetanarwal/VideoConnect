# 📞 VideoCallApp – Jetpack Compose + ZegoCloud

A simple peer-to-peer (1-on-1 or group) **video calling app** built using **Jetpack Compose** and **ZegoCloud SDK**, where users can join a common call room by entering a **User ID** and a **Call ID**.

---

## 🚀 Features

- ✅ Jetpack Compose UI
- ✅ Dynamic **User ID** and **Call ID** input
- ✅ Real-time **video & audio calling**
- ✅ ZegoCloud Prebuilt SDK integration
- ✅ Works on emulator or real Android device
- ✅ Call connects automatically when multiple users join with same Call ID

---

---

## 🛠️ Tech Stack

- **Language:** Kotlin  
- **UI:** Jetpack Compose  
- **Video SDK:** [ZegoCloud UIKit Prebuilt Call SDK](https://www.zegocloud.com/video/ui-kit/quick-start/android)

---

## 🧪 How It Works

- Each user enters:
  - A **User ID** → unique per user 
  - A **Call ID** → shared room name 
- When two or more users enter the **same Call ID**, they are auto-connected to a video call.


---

## 🔧 Setup Instructions

**1. Clone the repo**<br>
Run this command in your terminal:
git clone https://github.com/yourusername/VideoCallApp.git

**2. Add your Zego AppID and AppSign**<br>
Go to the ZegoCloud Console

Create a new project

Copy your AppID and AppSign

Open the file: CallScreenActivity.kt

Replace the following lines:

val appID: Long = YOUR_APP_ID

val appSign = "YOUR_APP_SIGN"

**3. Run the project**<br>
Make sure your emulator or real device has:

Android API level 26+

Camera and Microphone access

Open the project in Android Studio

Click ▶️ Run


