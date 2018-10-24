package com.dngwjy.antipungli.api_repository

object ApiObject {

	//. url object for user Login
	fun LoginUrl(username:String,password:String):String{
		return "https://api.myjson.com/bins/rgg1w"
	}

	//. testing url login
	//. "https://api.myjson.com/bins/rgg1w" -> fail login
	//. "https://api.myjson.com/bins/oy7lg" -> success login

	//. url object for get nearest parking area
	fun NearestUrl(latitude:String,longitude:String):String{
		return "https://"
	}

}