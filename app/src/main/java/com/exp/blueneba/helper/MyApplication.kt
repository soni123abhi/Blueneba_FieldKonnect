package com.exp.blueneba.helper

import android.app.Activity
import android.app.Application
import android.os.Bundle

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityResumed(activity: Activity) {
                // Perform all security validations here
//                SecurityValidator.checkEnvironmentAndBlock(activity)
            }

            override fun onActivityPaused(activity: Activity) {}
            override fun onActivityStarted(activity: Activity) {}
            override fun onActivityDestroyed(activity: Activity) {}
            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {}
            override fun onActivityStopped(activity: Activity) {}
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {}
        })
    }

}
