package com.aplen.core.utils

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.aplen.core.R
import com.squareup.picasso.Picasso

object Utility {

    fun ImageView.load(image: String?) {
        Picasso.get()
            .load(image)
            .placeholder(R.drawable.ic_loading)
            .error(R.drawable.ic_error_image)
            .into(this)
    }

    fun View.visible() {
        this.visibility = View.VISIBLE
    }

    fun View.gone() {
        this.visibility = View.GONE
    }

}