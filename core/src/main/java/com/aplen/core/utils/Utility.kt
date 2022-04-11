package com.aplen.core.utils

import android.view.View
import android.widget.ImageView
import com.aplen.core.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

object Utility {

    fun ImageView.load(image: Any?) {
        Glide.with(context.applicationContext)
            .load(image)
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                    .error(R.drawable.ic_error_image)
            )
            .into(this)
    }

    fun View.visible() {
        this.visibility = View.VISIBLE
    }

    fun View.gone() {
        this.visibility = View.GONE
    }

}