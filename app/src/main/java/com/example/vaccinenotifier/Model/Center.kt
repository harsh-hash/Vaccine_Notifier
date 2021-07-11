package com.example.vaccinenotifier.Model

import com.google.gson.annotations.SerializedName

data class CenterList(

    @SerializedName("centers")
    val centerList: List<Center>
)

data class Center(
    @SerializedName("center_id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("address")
    val address: String,
    @SerializedName("state_name")
    val state: String,
    @SerializedName("district_name")
    val district: String,
    @SerializedName("block_name")
    val block: String,
    @SerializedName("pincode")
    val pinCode: Int,
    @SerializedName("from")
    val from: String,
    @SerializedName("to")
    val to: String,
    @SerializedName("lat")
    val lat: Int,
    @SerializedName("long")
    val long: Int,
    @SerializedName("fee_type")
    val feeType: String,
    @SerializedName("sessions")
    val sessions: List<Sessions>
)

data class Sessions(
    @SerializedName("session_id")
    val sessionID: String,
    @SerializedName("date")
    val date: String,
    @SerializedName("available_capacity")
    val capacity: Int,
    @SerializedName("available_capacity_dose1")
    val dose1: Int,
    @SerializedName("available_capacity_dose2")
    val dose2: Int,
    @SerializedName("min_age_limit")
    val minAge: Int,
    @SerializedName("vaccine")
    val vaccine: String,
    @SerializedName("slots")
    val slots: List<String>
)
