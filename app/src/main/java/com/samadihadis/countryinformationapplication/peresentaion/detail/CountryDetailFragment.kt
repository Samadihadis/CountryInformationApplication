package com.samadihadis.countryinformationapplication.peresentaion.detail

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.samadihadis.countryinformationapplication.R
import com.samadihadis.countryinformationapplication.databinding.FragmentCountryDetailBinding

class CountryDetailFragment : Fragment() {

    private val args by navArgs<CountryDetailFragmentArgs>()
    private lateinit var binding: FragmentCountryDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentCountryDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val lang = args.countryModel.languages?.eng
        binding.apply {
            toolbar.title = args.countryModel.name.common
            countryName.text = args.countryModel.name.official
            populationValueTextView.text = args.countryModel.population.toString().plus(" person")
            areaValueTextView.text = args.countryModel.area?.toInt().toString().plus(" km2")
            languageValueTextView.text = if (!lang.isNullOrEmpty()) {
                lang
            } else {
                "- - -"
            }
            continentsValueTextView.text =
                args.countryModel.continents.toString().replace("[", "").replace("]", "")
            startOfWeekValueTextView.text = args.countryModel.startOfWeek
            Glide.with(requireContext())
                .load(args.countryModel.flags?.png)
                .placeholder(R.drawable.banner_image_placeholder)
                .into(flagImageView)
        }
    }

}