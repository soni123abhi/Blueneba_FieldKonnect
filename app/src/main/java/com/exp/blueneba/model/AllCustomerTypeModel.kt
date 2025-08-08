package com.exp.blueneba.model

import com.google.gson.annotations.SerializedName

data class AllCustomerTypeModel (

    @SerializedName("id"                ) var id               : Int?    = null,
    @SerializedName("customertype_name" ) var customertypeName : String? = null

)