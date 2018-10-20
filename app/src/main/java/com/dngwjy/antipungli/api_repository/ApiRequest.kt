package com.dngwjy.antipungli.api_repository

import java.net.URL

class ApiRequest {
	fun SendingRequest(url:String):String{
		return URL(url).readText()
	}
}