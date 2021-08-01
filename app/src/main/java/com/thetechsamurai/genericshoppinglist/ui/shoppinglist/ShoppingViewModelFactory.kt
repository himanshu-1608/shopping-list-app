package com.thetechsamurai.genericshoppinglist.ui.shoppinglist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.thetechsamurai.genericshoppinglist.data.repositories.ShoppingRepository
import com.thetechsamurai.genericshoppinglist.ui.ShoppingViewModel

@Suppress("UNCHECKED_CAST")
class ShoppingViewModelFactory(
    private val repository: ShoppingRepository
): ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ShoppingViewModel(repository) as T
    }
}