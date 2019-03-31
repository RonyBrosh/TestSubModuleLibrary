package com.sample.rony.testsubmodulelibrary

object TestAPI {
    fun getVersion(): String {
        return BuildConfig.VERSION_NAME
    }
}