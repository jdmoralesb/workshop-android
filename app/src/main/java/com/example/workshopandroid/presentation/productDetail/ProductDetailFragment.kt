package com.example.workshopandroid.presentation.productDetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.workshopandroid.R
import com.example.workshopandroid.data.MockDataProvider
import com.example.workshopandroid.databinding.FragmentProductDetailBinding
import com.example.workshopandroid.entity.platformIcon
import com.example.workshopandroid.presentation.MainActivity

class ProductDetailFragment : Fragment() {

    var binding: FragmentProductDetailBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProductDetailBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let { extras ->
            with(MockDataProvider.getProductById(extras.getInt(PRODUCT_ID))) {
                this?.image?.let { binding?.imageProduct?.setImageResource(it) }
                this?.platform?.let { binding?.imagePlatform?.setImageResource(platformIcon()) }
                binding?.textName?.text = this?.name
                binding?.textDescription?.text = this?.description
                binding?.textPrice?.text = getString(R.string.price, this?.price ?: 0)
            }
        }
    }

    override fun onStart() {
        super.onStart()

        (activity as MainActivity?)?.supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    companion object {
        const val PRODUCT_ID = "product_id"
    }
}