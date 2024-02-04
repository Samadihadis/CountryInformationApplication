package com.samadihadis.countryinformationapplication.peresentaion.list

import android.animation.ObjectAnimator
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.LinearInterpolator
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.samadihadis.countryinformationapplication.data.CountryModel
import com.samadihadis.countryinformationapplication.databinding.FragmentCountryListBinding
import com.samadihadis.countryinformationapplication.util.RetrofitClient
import com.samadihadis.countryinformationapplication.util.gone
import com.samadihadis.countryinformationapplication.util.visible
import retrofit2.Call
import retrofit2.Response

class CountryListFragment : Fragment() {

    private lateinit var binding: FragmentCountryListBinding
    private val countryAdaptor by lazy {
        CountryListAdapter()
    }
    private var animation: ObjectAnimator? = null
    private val dataList = mutableListOf<CountryModel>()
    private var isOnlineSearch = true


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentCountryListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
        initAnimation()
        if (dataList.isEmpty()) {
            getData()
        } else {
            countryAdaptor.clearList()
            countryAdaptor.addItemList(dataList)
        }
    }

    private fun setupViews() {
        val dividerItemDecoration =
            DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL)
        with(binding.countryRecyclerView) {
            layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
            addItemDecoration(dividerItemDecoration)
            adapter = countryAdaptor
        }
        binding.retryButton.setOnClickListener {
            getData()
        }
        countryAdaptor.setItemClickListener {
            findNavController().navigate(
                CountryListFragmentDirections.actionToCountyDetailFragment(
                    it
                )
            )
        }
        countryAdaptor.clearList()
        binding.searchCountryEditText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                if (isOnlineSearch)
                    onlineSearch(s)
                else
                    localSearch(s)
            }
        })
    }

    private fun onlineSearch(s: CharSequence) {
        val searchTerm = s.toString().lowercase()
        if (s.isNotEmpty()) {
            searchCountryRequest(searchTerm)
        }
        if (s.isEmpty()) {
            countryAdaptor.clearList()
            getData()
        }
    }

    private fun localSearch(s: CharSequence) {
        if (dataList.isNotEmpty() && s.toString().length > 1) {
            val searchTerm = s.toString().lowercase()
            val filterList = dataList.filter {
                it.name.official.lowercase().contains(searchTerm)
            }
            countryAdaptor.clearList()
            countryAdaptor.addItemList(filterList)
        }
        if (s.isEmpty()) {
            countryAdaptor.clearList()
            countryAdaptor.addItemList(dataList)
        }
    }

    private fun getData() {
        hideRetryButton()
        showLoading()
        RetrofitClient.apiService.allCountries()
            .enqueue(object : retrofit2.Callback<List<CountryModel>> {
                override fun onResponse(
                    call: Call<List<CountryModel>>,
                    response: Response<List<CountryModel>>
                ) {
                    onServerResponse(response)
                    hideLoading()
                }

                override fun onFailure(call: Call<List<CountryModel>>, t: Throwable) {
                    onServerErrorResponse(t)
                }
            })
    }

    private fun onServerResponse(response: Response<List<CountryModel>>) {
        if (response.isSuccessful) {
            if (!response.body().isNullOrEmpty()) {
                val countryList =
                    response.body() as List<CountryModel> // at this line data is ready
                dataList.addAll(countryList)
                countryAdaptor.addItemList(countryList)
            } else {
                showRetryButton()
                Toast.makeText(requireContext(), "List is Empty!", Toast.LENGTH_SHORT).show()
            }
        } else {
            showRetryButton()
            Toast.makeText(requireContext(), "Got an error!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun searchCountryRequest(term: String) {
        hideRetryButton()
        showLoading()
        countryAdaptor.clearList()
        RetrofitClient.apiService.searchCountry(term)
            .enqueue(object : retrofit2.Callback<List<CountryModel>> {
                override fun onResponse(
                    call: Call<List<CountryModel>>,
                    response: Response<List<CountryModel>>
                ) {
                    onServerResponse(response)
                    hideLoading()
                }

                override fun onFailure(call: Call<List<CountryModel>>, t: Throwable) {
                    onServerErrorResponse(t)
                }
            })
    }

    private fun onServerErrorResponse(t: Throwable) {
        Toast.makeText(requireContext(), "${t.localizedMessage}", Toast.LENGTH_SHORT)
            .show()
        t.printStackTrace()
        hideLoading()
        showRetryButton()
    }

    private fun showLoading() {
        binding.progressBarLoading.visible()
        animation?.start()
    }

    private fun hideLoading() {
        binding.progressBarLoading.gone()
        animation?.cancel()
    }

    private fun showRetryButton() {
        binding.retryButton.visible()
    }

    private fun hideRetryButton() {
        binding.retryButton.gone()
    }

    private fun initAnimation() {
        animation = ObjectAnimator.ofFloat(binding.progressBarLoading, "rotation", 0f, 360f).apply {
            duration = 1000
            repeatCount = ObjectAnimator.INFINITE
            interpolator = LinearInterpolator()
        }
    }

}