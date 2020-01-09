package com.example.dollarconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.dollarconverter.model.UsdToInr
import com.example.dollarconverter.utils.RetrofitObject
import com.example.dollarconverter.utils.progressDialog
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private var progressBar:AlertDialog ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init(){
        progressBar = progressDialog(this,"Loading...")
        btnConvert.setOnClickListener {
            if (getUsd()!=0.0){
                getApiDat()
            }else{
                showToast("Enter Valid Amount !")
            }
        }
    }
    private fun getApiDat() {
        progressBar!!.show()
        val apiService = RetrofitObject.apiService
        val call = apiService.getData()
        call.enqueue(object : retrofit2.Callback<UsdToInr> {
            override fun onFailure(call: Call<UsdToInr>, t: Throwable) {
                showToast("Check Internet Connection and Try Again !")
                progressBar!!.dismiss()

            }
            override fun onResponse(call: Call<UsdToInr>, response: Response<UsdToInr>) {
                if (response.isSuccessful){
                    response.body()?.let {
                        it.quotes?.let {
                            convertUsdToInr(it.uSDINR)
                        }?:run {
                            progressBar!!.dismiss()
                        }
                    }?:run{
                        progressBar!!.dismiss()

                    }
                }
            }

        })
    }

    fun showToast(message:String){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }
    private fun convertUsdToInr(uSDINR: Double?) {
        uSDINR?.let {
            val indianRupees = getUsd()*uSDINR
            editTextInr.text = String.format("INR: %.4f",indianRupees)
            progressBar!!.dismiss()
        }
    }


    private fun getUsd():Double = if (editTextdollar.text.toString().isNotEmpty()) editTextdollar.text.toString().toDouble() else 0.0
}
