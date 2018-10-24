package com.dngwjy.antipungli.data.models.responses

import com.dngwjy.antipungli.data.models.LoginData

data class LoginResponse(
		val codeRes:String,
		val descRes:String,
		val loginData:List<LoginData>
)