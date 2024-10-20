package com.security.exportedcomponentapp

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class ExportedService : Service() {

    override fun onBind(intent: Intent?): IBinder? {
        // No binding provided
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Insecurely accessible by any app
        Toast.makeText(this, "Exported Service Started!", Toast.LENGTH_LONG).show()
        return START_NOT_STICKY
    }
}
