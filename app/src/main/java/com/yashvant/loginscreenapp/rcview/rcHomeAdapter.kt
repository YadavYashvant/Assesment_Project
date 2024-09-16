package com.yashvant.loginscreenapp.rcview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.yashvant.loginscreenapp.R
import com.yashvant.loginscreenapp.model.Store

class rcHomeAdapter: RecyclerView.Adapter<rcHomeAdapter.HomeViewHolder>() {

    private var storeList = emptyList<Store>()

    class HomeViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val storeItemName: TextView = itemView.findViewById(R.id.storeDetails)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.store_item_view, parent, false))
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val currentItem = storeList[position]
        holder.storeItemName.text = currentItem.store_item_name

    }

    override fun getItemCount(): Int {
        return storeList.size
    }

    fun setData(store: List<Store>) {
        this.storeList = store
        notifyDataSetChanged()
    }
}