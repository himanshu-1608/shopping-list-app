package com.thetechsamurai.genericlist.ui.shoppinglist

import com.thetechsamurai.genericlist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}