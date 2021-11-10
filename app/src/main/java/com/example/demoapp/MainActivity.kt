package com.example.demoapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.demoapp.DemoLogin.ConnectivityUtils

class MainActivity : AppCompatActivity() {
    lateinit var edit_name: TextView
    lateinit var pass: TextView
    lateinit var info: TextView
    lateinit var login_btn: Button
    var cnt=5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)
        edit_name=findViewById(R.id.etName)
        pass=findViewById(R.id.etPassword)
        info=findViewById(R.id.tvInfo)
        login_btn=findViewById(R.id.btn_login)
        info.text="No. of remaining attempts: 5"
        login_btn.setOnClickListener{validate(edit_name.text.toString(),pass.text.toString())}

    }
        fun validate(userName:String,password:String){
            if (userName=="Admin" && password=="12345"){
                ConnectivityUtils.validateDemo(this,"LoggedIn")
            }
            else{
                cnt--
                info.text="No. of attempts remaining:"+""+cnt.toString()
                if(cnt==0){
                    login_btn.setEnabled(false)
                }
            }
        }
}



