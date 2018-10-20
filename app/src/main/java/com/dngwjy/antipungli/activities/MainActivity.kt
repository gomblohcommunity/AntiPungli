package com.dngwjy.antipungli.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dngwjy.antipungli.R
import com.dngwjy.antipungli.api_repository.ApiRequest
import com.dngwjy.antipungli.presenters.MainActPrensenter
import com.dngwjy.antipungli.views.MainActView
import com.google.gson.Gson

class MainActivity : AppCompatActivity(), MainActView {

	//.implements methods form MainActView
	override fun ShowLoading() {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun FinishLoading() {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	//.late init Declaration
	lateinit var presenter:MainActPrensenter
	// val initialization
	val apiRequest=ApiRequest()
	val gsonResponse=Gson()
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		//.presenter initialization
		presenter= MainActPrensenter(this,apiRequest,gsonResponse)
	}
}
