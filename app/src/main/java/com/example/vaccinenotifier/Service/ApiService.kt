package com.example.vaccinenotifier.Service

import com.example.vaccinenotifier.Model.CenterList
import com.example.vaccinenotifier.Model.DistrictLists
import com.example.vaccinenotifier.Model.States
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("admin/location/districts/16")
    fun getDistricts(): Call<DistrictLists>

    @GET("appointment/sessions/public/calendarByPin?pincode={pincode}&date={date}")
    fun getCenters(@Path("pincode") pincode: Int, @Path("date") date: String): Call<CenterList?>

    @GET("admin/location/states")
    fun getStates(): Call<States>

}