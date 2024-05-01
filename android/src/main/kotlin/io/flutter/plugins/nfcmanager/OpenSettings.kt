package io.flutter.plugins.nfcmanager

import android.content.Intent
import android.provider.Settings
import android.content.Context

fun openNFCSettings(context: Context): Boolean {
    try{
        //Log.d("NFCSettings", "openNFCSettings called")
        val intent = Intent(Settings.ACTION_NFC_SETTINGS)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY)
        intent.addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS)
        context.startActivity(intent)
       
        //Log.d("NFCSettings", "openNFCSettings called2")
        return true;
    }catch(e: Exception){
        return false;
    }
}