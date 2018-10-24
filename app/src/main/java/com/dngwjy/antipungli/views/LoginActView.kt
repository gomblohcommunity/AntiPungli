package com.dngwjy.antipungli.views

import com.dngwjy.antipungli.data.models.LoginData

interface LoginActView {
	fun ShowLoading()
	fun HideLoading()
	fun ShowMessage(data:String)
	fun GetData( data:List<LoginData>)
}