package com.kat.core.network.network.connection

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities

class CheckNetworkConnection(private val context: Context, private val permissions: Permissions) {

    fun checkNetworkAvailable(): Boolean {
        if(permissions.verifyPermissionGranted(context)) return false

        val connectivityManager = context.connectivityManager
        val connectivityNetwork = connectivityManager.activeNetwork ?: return false
        val activeNetwork = connectivityManager.getNetworkCapabilities(connectivityNetwork) ?: return false

        return when {
            activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
            activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
            activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_BLUETOOTH) -> true
            activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
            else -> false
        }
    }

    companion object {
        val Context.connectivityManager: ConnectivityManager
            get() = this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    }

}