package com.example.autocompletetextviewdemo

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val vocabulary = arrayListOf("apple", "application", "appal", "appalachia", "apposite")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, vocabulary)
        auto_complete_text.threshold = 1
        auto_complete_text.setAdapter(adapter)
    }
}
