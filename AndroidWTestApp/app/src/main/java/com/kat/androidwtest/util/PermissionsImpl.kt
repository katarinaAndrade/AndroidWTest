package com.kat.androidwtest.util

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat
import com.kat.core.network.network.connection.Permissions

class PermissionsImpl: Permissions {

    override fun verifyPermissionGranted(context: Context): Boolean {
        val internet = ContextCompat.checkSelfPermission(context, Manifest.permission.INTERNET)
        val networkState = ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_NETWORK_STATE)
        return internet == PackageManager.PERMISSION_GRANTED && networkState == PackageManager.PERMISSION_GRANTED
    }

}