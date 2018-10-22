package com.dngwjy.antipungli.data.models.responses

import com.dngwjy.antipungli.data.models.Nearest

data class NearestResponse(
		val codeRes:String,
		val descRes:String?,
		val nearests:List<Nearest>?
)