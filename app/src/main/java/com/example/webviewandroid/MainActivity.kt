package com.example.webviewandroid

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webViewSetup()
    }


    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("SetJavaScriptEnabled")
    private fun webViewSetup() {
        val web: WebView = findViewById(R.id.webview)
        web.webViewClient = WebViewClient()
        web.apply {
            loadUrl("http://learning.smkn1jenpo.sch.id/login/index.php")
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
        }
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onBackPressed() {
        val web: WebView = findViewById(R.id.webview)
            if(web.canGoBack()) web.goBack() else super.onBackPressed()
    }
}