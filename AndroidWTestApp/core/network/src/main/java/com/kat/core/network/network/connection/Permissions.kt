package com.kat.core.network.network.connection

import android.content.Context

interface Permissions {

    fun verifyPermissionGranted(context: Context): Boolean

}