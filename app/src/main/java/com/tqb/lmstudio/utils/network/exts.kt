package com.tqb.lmstudio.utils.network

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions

fun ImageView.glide(context: Context, url: String, roundedCorners: Int = 30) {
    var requestOptions = RequestOptions()
    if (roundedCorners > 0) {
        requestOptions = requestOptions.transform(CenterCrop(), RoundedCorners(roundedCorners))
    }
    Glide.with(context).load(url).apply(requestOptions).into(this)
}