package com.example.demoapp

import android.content.Context
import android.widget.Toast

public class DemoLogin{
    object ConnectivityUtils {
        fun validateDemo(context: Context, msg: String) {
            Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
        }
    }
}