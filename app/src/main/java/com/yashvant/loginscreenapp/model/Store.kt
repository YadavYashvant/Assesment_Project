package com.yashvant.loginscreenapp.model

data class Store(
    val uid: Int,
    val store_uid : Int,
    val store_cat_id: Int,
    val store_item_name: String,
    val item_MRP: Int,
    val selling_price: Int,
    val buying_price: Int,
    val item_weight: Int,
    val item_weight_unit: String = "KG",
    val item_description: String,
    val item_image: ItemImage? = ItemImage(0, "string", 0, 0),
    val isNewArrival: String,
    val minimum_Qty_Buy: Int,
    val minimum_Qty_Unit: String
)
