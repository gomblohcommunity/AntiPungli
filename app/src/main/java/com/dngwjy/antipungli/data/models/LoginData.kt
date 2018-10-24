package com.dngwjy.antipungli.data.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LoginData (
		val id:String,
		val username:String,
		val password:String
): Parcelable