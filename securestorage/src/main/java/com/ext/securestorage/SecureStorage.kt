package com.ext.securestorage

import android.content.Context
import android.content.SharedPreferences
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey

object SecureStorage {

    private lateinit var prefs: SharedPreferences

    fun init(context: Context, prefName: String = "secure_storage_prefs") {

        val masterKey = MasterKey.Builder(context)
            .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
            .build()

        prefs = EncryptedSharedPreferences.create(
            context,
            prefName,
            masterKey,
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        )
    }

    private fun checkInit() {
        if (!::prefs.isInitialized) {
            throw IllegalStateException("SecureStorage is not initialized. Call SecureStorage.init(context)")
        }
    }

    fun putString(key: String, value: String) {
        checkInit()
        prefs.edit().putString(key, value).apply()
    }

    fun getString(key: String): String? {
        return prefs.getString(key, null)
    }

    fun putInt(key: String, value: Int) {
        checkInit()
        prefs.edit().putInt(key, value).apply()
    }

    fun getInt(key: String): Int {
        return prefs.getInt(key, 0)
    }

    fun putBoolean(key: String, value: Boolean) {
        checkInit()
        prefs.edit().putBoolean(key, value).apply()
    }

    fun getBoolean(key: String): Boolean {
        return prefs.getBoolean(key, false)
    }

    fun putFloat(key: String, value: Float) {
        checkInit()
        prefs.edit().putFloat(key, value).apply()
    }

    fun getFloat(key: String): Float {
        return prefs.getFloat(key, 0f)
    }

    fun putLong(key: String, value: Long) {
        checkInit()
        prefs.edit().putLong(key, value).apply()
    }

    fun getLong(key: String): Long {
        return prefs.getLong(key, 0L)
    }

    fun remove(key: String) {
        prefs.edit().remove(key).apply()
    }

    fun clear() {
        prefs.edit().clear().apply()
    }


}