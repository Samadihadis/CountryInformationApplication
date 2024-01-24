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
        binding.apply {
            toolbar.title = args.countryModel.name.common
            countryName.text = args.countryModel.name.official
            populationValueTextView.text = args.countryModel.population.toString()
            areaValueTextView.text = args.countryModel.area.toString()
            languageValueTextView.text = args.countryModel.languages.eng
            continentsValueTextView.text = args.countryModel.continents.toString()
            currencyValueTextView.text = args.countryModel.currencies.AUD?.name
            Glide.with(requireContext())
                .load("https://flagcdn.com/w320" + args.countryModel.flags)
                .placeholder(R.drawable.banner_image_placeholder)
                .into(flagImageView)
        }
    }

}