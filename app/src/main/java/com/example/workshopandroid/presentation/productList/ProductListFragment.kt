package com.example.workshopandroid.presentation.productList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.workshopandroid.R
import com.example.workshopandroid.data.MockDataProvider
import com.example.workshopandroid.presentation.MainActivity
import com.example.workshopandroid.presentation.productDetail.ProductDetailFragment

class ProductListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_product_list, container, false)

        if (view is RecyclerView) {
            with(view) {
                layoutManager = LinearLayoutManager(context)
                adapter = ProductAdapter(MockDataProvider.getListOfProducts()) {
                    findNavController().navigate(
                        R.id.action_productListFragment_to_productDetailFragment,
                        bundleOf(ProductDetailFragment.PRODUCT_ID to it.id)
                    )
                }
            }
        }
        return view
    }

    override fun onStart() {
        super.onStart()

        (activity as MainActivity?)?.supportActionBar?.setDisplayHomeAsUpEnabled(false)
    }
}