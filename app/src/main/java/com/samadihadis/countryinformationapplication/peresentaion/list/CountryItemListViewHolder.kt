package com.samadihadis.countryinformationapplication.peresentaion.list

import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textview.MaterialTextView
import com.samadihadis.countryinformationapplication.R

class CountryItemListViewHolder (view: View) : RecyclerView.ViewHolder(view){

    val countryImageView: AppCompatImageView
    val countryName: MaterialTextView
    val rootLayout: ConstraintLayout

    init {
        view.apply {
            countryImageView = findViewById(R.id.countryImageView)
            countryName = findViewById(R.id.countryName)
            rootLayout = findViewById(R.id.RootLayout)
        }
    }
}