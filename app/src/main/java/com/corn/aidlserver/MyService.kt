package com.corn.aidlserver

import android.app.Service
import android.content.Intent
import android.os.IBinder

class MyService : Service() {

    override fun onBind(intent: Intent): IBinder {
        return MyBinder()
    }

    internal inner class MyBinder : IMyAidlInterface.Stub() {
        override fun getUser(): User {
            val user = User()
            user.name = "name is corn"

            return user
        }
    }
}