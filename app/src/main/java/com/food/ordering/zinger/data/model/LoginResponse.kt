package com.food.ordering.zinger.data.model
import com.google.gson.annotations.SerializedName


data class LoginResponse(
    @SerializedName("code")
    val code: Int,
    @SerializedName("data")
    val `data`: Data?,
    @SerializedName("message")
    val message: String
)

data class Data(
    @SerializedName("placeModel")
    val placeModel: PlaceModel,
    @SerializedName("userModel")
    val userModel: UserModel
)

data class PlaceModel(
    @SerializedName("address")
    val address: String,
    @SerializedName("iconUrl")
    val iconUrl: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
)

data class UserModel(
    @SerializedName("email")
    val email: String? = null,
    @SerializedName("mobile")
    val mobile: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("oauthId")
    val oauthId: String? = null,
    @SerializedName("role")
    val role: String? = null
)