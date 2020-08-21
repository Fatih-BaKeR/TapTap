package com.kieronquinn.app.taptap.columbus.gates

import android.content.Context

open class HeadsetInverse(context: Context) : Headset(context) {

    override fun isBlocked(): Boolean {
        return !super.isBlocked()
    }

}