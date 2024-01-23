package com.samadihadis.countryinformationapplication.peresentaion.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.samadihadis.countryinformationapplication.data.CountryModel
import com.samadihadis.countryinformationapplication.databinding.FragmentCountryListBinding
import com.samadihadis.countryinformationapplication.util.RetrofitClient
import retrofit2.Call
import retrofit2.Response

class CountryListFragment : Fragment() {

    private lateinit var binding: FragmentCountryListBinding
    private val countryAdaptor by lazy {
        CountryListAdapter()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentCountryListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAdapter()
        getData()
    }

    private fun setupAdapter() {
        val dividerItemDecoration =
            DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL)
        with(binding.countryRecyclerView) {
            layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
            addItemDecoration(dividerItemDecoration)
            adapter = countryAdaptor
        }
    }

    private fun getData() {
        RetrofitClient.apiService.allCountries()
            .enqueue(object : retrofit2.Callback<List<CountryModel>> {
                override fun onResponse(
                    call: Call<List<CountryModel>>,
                    response: Response<List<CountryModel>>
                ) {
                    onServerResponse(response)
                }

                override fun onFailure(call: Call<List<CountryModel>>, t: Throwable) {
                    Toast.makeText(requireContext(), "${t.localizedMessage}", Toast.LENGTH_SHORT)
                        .show()
                    t.printStackTrace()
                }

            })
    }

    private fun onServerResponse(response: Response<List<CountryModel>>) {
        if (response.isSuccessful) {
            if (!response.body().isNullOrEmpty()) {
                val countryList = response.body() as List<CountryModel>
                countryAdaptor.addItemList(countryList)
            } else {
                Toast.makeText(requireContext(), "List is Empty!", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(requireContext(), "Got an error!", Toast.LENGTH_SHORT).show()
        }
    }
}