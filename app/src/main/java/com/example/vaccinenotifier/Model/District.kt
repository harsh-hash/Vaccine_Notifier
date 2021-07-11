package com.example.vaccinenotifier.Model

import com.google.gson.annotations.SerializedName

data class DistrictLists(
    @SerializedName("districts")
    val districtLists: List<District>,
    @SerializedName("ttl")
    val ttl: Int
)

data class District(
    @SerializedName("district_id")
    val id: Int,
    @SerializedName("district_name")
    val name: String,
    @SerializedName("state_id")
    val state_id: Int,
    @SerializedName("district_name_l")
    val district_name_l: String
)

