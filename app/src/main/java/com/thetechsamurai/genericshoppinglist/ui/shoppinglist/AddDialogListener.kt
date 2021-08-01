package com.thetechsamurai.genericshoppinglist.ui.shoppinglist

import com.thetechsamurai.genericshoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}