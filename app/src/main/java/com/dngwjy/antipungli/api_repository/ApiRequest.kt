package com.dngwjy.antipungli.api_repository

import java.net.URL

class ApiRequest {
	//. method for sending http request
	fun SendingRequest(url:String):String{
		return URL(url).readText()
	}
}