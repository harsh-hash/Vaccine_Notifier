package com.example.vaccinenotifier

import androidx.lifecycle.ViewModel
import com.example.vaccinenotifier.Repository.CentersRepository
import java.text.SimpleDateFormat
import java.util.*

class PincodeViewModel : ViewModel() {

    fun displayCenters(pincode: Int) {

        var todayDate = getDate()
        var centerList = CentersRepository().getCentersList(pincode, todayDate)

    }

    fun getDate(): String {
        var todaytime = Calendar.getInstance().time

        var dateFormat = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
        var todayDate = dateFormat.format(todaytime)

        return todayDate
    }
}