package com.example.vaccinenotifier.Model

import com.google.gson.annotations.SerializedName

data class States(
    @SerializedName("states")
    val stateLists: List<State>,
    @SerializedName("ttl")
    val ttl: Int
)

data class State(
    @SerializedName("state_id")
    val state_id: Int,
    @SerializedName("state_name")
    val state_name: String,
    @SerializedName("state_name_l")
    val state_name_l: String
)
