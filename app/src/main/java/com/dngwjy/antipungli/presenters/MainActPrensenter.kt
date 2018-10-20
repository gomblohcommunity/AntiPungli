package com.dngwjy.antipungli.presenters

import com.dngwjy.antipungli.api_repository.ApiRequest
import com.dngwjy.antipungli.views.MainActView
import com.google.gson.Gson
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import java.net.CacheRequest

class MainActPrensenter(val view:MainActView,val request: ApiRequest,val gson: Gson) {

	fun GetNearest(latitude:String,longitude:String){
		view.ShowLoading()
		doAsync {

			uiThread {
				view.FinishLoading()
			}
		}
	}

}