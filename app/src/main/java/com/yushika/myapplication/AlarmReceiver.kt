package com.yushika.myapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class AlarmReceiver:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val massage=intent?.getStringExtra("extramsg")
        println(massage)
        Log.e("message","massage $massage")
    }
}