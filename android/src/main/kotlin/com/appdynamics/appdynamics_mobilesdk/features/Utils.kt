/*
 * Copyright (c) 2021. AppDynamics LLC and its affiliates.
 * All rights reserved.
 *
 */

package com.appdynamics.appdynamics_mobilesdk.features

import android.os.Handler
import android.os.Looper
import androidx.annotation.NonNull
import com.appdynamics.appdynamics_mobilesdk.AppDynamicsMobileSdkPlugin
import io.flutter.plugin.common.MethodChannel

fun AppDynamicsMobileSdkPlugin.sleep(@NonNull result: MethodChannel.Result, arguments: Any?) {
    val properties = arguments as HashMap<*, *>
    val seconds = properties["seconds"] as Number
    Thread.sleep(seconds.toLong() * 1000)
    result.success(null)
}

fun AppDynamicsMobileSdkPlugin.crash(@NonNull result: MethodChannel.Result, arguments: Any?) {
    Handler(Looper.getMainLooper()).postDelayed(Runnable {
        throw java.lang.RuntimeException("AppDynamics native crash");
    }, 50)
    result.success(null);
}