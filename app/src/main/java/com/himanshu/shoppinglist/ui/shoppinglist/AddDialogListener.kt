package com.himanshu.shoppinglist.ui.shoppinglist

import com.himanshu.shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}