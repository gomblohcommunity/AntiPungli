package com.dngwjy.antipungli.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.dngwjy.antipungli.R
import com.dngwjy.antipungli.api_repository.ApiRequest
import com.dngwjy.antipungli.data.models.LoginData
import com.dngwjy.antipungli.presenters.LoginActPres
import com.dngwjy.antipungli.views.LoginActView
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_login.*

class ActivityLogin : AppCompatActivity(),LoginActView {
	override fun ShowLoading() {
	Toast.makeText(this,"Please Wait...",Toast.LENGTH_SHORT).show()
		pgBar.visibility= View.VISIBLE
	}

	override fun HideLoading() {
		pgBar.visibility=View.GONE
	}

	override fun ShowMessage(data: String) {
		Toast.makeText(this,data,Toast.LENGTH_SHORT).show()
	}

	override fun GetData(data: List<LoginData>) {
		dataLogin.clear()
		dataLogin.addAll(data)

		val intent= Intent(this,MainActivity::class.java)
		intent.putExtra("data",dataLogin[0])
		startActivity(intent)
	}
	 var dataLogin:MutableList<LoginData> = mutableListOf()
	lateinit var presenter:LoginActPres
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		supportActionBar!!.hide()
		setContentView(R.layout.activity_login)
		val gson=Gson()
		val request=ApiRequest()
		presenter= LoginActPres(this,request,gson)
		btnLogin.setOnClickListener {
			presenter.DoLogin(usernameEdit.text.toString(),passwordEdit.text.toString())
		}
	}
}
