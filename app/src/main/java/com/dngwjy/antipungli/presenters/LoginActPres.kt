package com.dngwjy.antipungli.presenters

import android.widget.Toast
import com.dngwjy.antipungli.api_repository.ApiObject
import com.dngwjy.antipungli.api_repository.ApiRequest
import com.dngwjy.antipungli.data.models.responses.LoginResponse
import com.dngwjy.antipungli.views.LoginActView
import com.google.gson.Gson
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class LoginActPres(val view:LoginActView,val request: ApiRequest,val gson: Gson) {
	fun DoLogin(user:String,pass:String){
		view.ShowLoading()
		doAsync {
			val data=gson.fromJson(request.SendingRequest(ApiObject.LoginUrl(user,pass)),LoginResponse::class.java)
			uiThread {
				if(data.codeRes.equals("200")&&data.descRes.equals("login success")){
					view.ShowMessage("Login Success")
					view.GetData(data.loginData)
				}else{
					view.ShowMessage("Login Failed")
				}
				view.HideLoading()

			}
		}
	}
}