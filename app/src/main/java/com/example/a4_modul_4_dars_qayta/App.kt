package com.example.a4_modul_4_dars_qayta

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco

class App:Application() {
    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this)
    }
}