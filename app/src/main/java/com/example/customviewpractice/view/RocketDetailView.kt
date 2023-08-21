package com.example.customviewpractice.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.cardview.widget.CardView
import com.example.customviewpractice.databinding.RocketDetailViewBinding

class RocketDetailView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
): CardView(context,attrs){
    var binding = RocketDetailViewBinding.inflate(LayoutInflater.from(context), this)

    init {

    }
}