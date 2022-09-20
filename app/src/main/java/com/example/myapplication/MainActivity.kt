package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity





var list = mutableListOf<Int>() //создание пустой коллекции, куда будут класться элементы

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

	  	for (s in 1..10) {
        	list.add(s) 
        }

        println(list)
    }
}