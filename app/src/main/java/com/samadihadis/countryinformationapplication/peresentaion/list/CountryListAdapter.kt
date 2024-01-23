package com.samadihadis.countryinformationapplication.peresentaion.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.samadihadis.countryinformationapplication.R
import com.samadihadis.countryinformationapplication.data.CountryModel

class CountryListAdapter() : RecyclerView.Adapter<CountryItemListViewHolder>() {

    private var countryList: MutableList<CountryModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryItemListViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
        return CountryItemListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    fun addItemList(countryModelList: List<CountryModel>) {
        countryList.addAll(countryModelList)
        notifyItemRangeInserted(countryList.size - 1, countryModelList.size)
    }

    override fun onBindViewHolder(holder: CountryItemListViewHolder, position: Int) {
        holder.apply {
            countryName.text = countryList[position].name.official
            Glide.with(holder.rootLayout.context)
                .load(countryList[position].flags.png)
                .placeholder(R.drawable.banner_image_placeholder)
                .transform(CenterCrop(), RoundedCorners(40))
                .into(countryImageView)
        }
    }
}