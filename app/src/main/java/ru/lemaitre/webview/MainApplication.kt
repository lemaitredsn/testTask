package ru.lemaitre.webview

import android.app.Application
import com.onesignal.OneSignal


class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)

        // OneSignal Initialization
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }

    companion object {
        private const val ONESIGNAL_APP_ID = "164c30ee-cde0-4ad4-a95d-0c725272e1a2"
    }

}