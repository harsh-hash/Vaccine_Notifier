package com.example.vaccinenotifier.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.vaccinenotifier.Model.CenterList
import com.example.vaccinenotifier.R

class PinCodeListViewAdapter : BaseAdapter() {

    lateinit var mContext: Context
    lateinit var centerList: CenterList

    fun PinCodeListViewAdapter(context: Context, centerList: CenterList) {
        this.mContext = context
        this.centerList = centerList
    }

    override fun getCount(): Int {
        return centerList.centerList.size
    }

    override fun getItem(position: Int): Any {
        return centerList.centerList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var view: View = convertView ?: LayoutInflater.from(mContext)
            .inflate(R.layout.pincode_listview_card, parent)
        return view
    }

}

