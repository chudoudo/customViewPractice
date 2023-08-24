package com.example.customviewpractice.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.cardview.widget.CardView
import androidx.core.content.withStyledAttributes
import com.example.customviewpractice.R
import com.example.customviewpractice.databinding.RocketDetailViewBinding
import com.example.customviewpractice.service.dip


class RocketDetailView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
): CardView(context,attrs){
    var binding = RocketDetailViewBinding.inflate(LayoutInflater.from(context), this)

    var title: String = ""
        set(value) {
            field = value
            binding.rocketDetailTitleTv.text = value
        }

    var subtitle: String = ""
        set(value) {
            field = value
            binding.rocketDetailSubtitleTv.text = value
        }

    init {
        radius = dip(18).toFloat()
        elevation = dip(24).toFloat()
        context.withStyledAttributes(attrs, R.styleable.RocketDetailView) {
            title = getString(R.styleable.RocketDetailView_rdv_title) ?: " "
            subtitle = getString(R.styleable.RocketDetailView_rdv_subtitle) ?: " "
        }


    }
}