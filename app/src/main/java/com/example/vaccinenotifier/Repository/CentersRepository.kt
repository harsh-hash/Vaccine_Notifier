package com.example.vaccinenotifier.Repository

import com.example.vaccinenotifier.Model.CenterList
import com.example.vaccinenotifier.Service.Retrofit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CentersRepository {

    var centerList: Call<CenterList?>? = null
    var _centerList: CenterList? = null

    fun getCentersList(pincode: Int, date: String): CenterList? {

        centerList = Retrofit().apiservice.getCenters(pincode, date)
        centerList!!.enqueue(object : Callback<CenterList?> {

            override fun onResponse(call: Call<CenterList?>, response: Response<CenterList?>) {
                _centerList = response.body()
            }

            override fun onFailure(call: Call<CenterList?>, t: Throwable) {

            }
        })
        return _centerList
    }
}