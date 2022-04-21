package com.naim.androidmultilanguagefontexample

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.naim.androidmultilanguagefontexample.databinding.ActivityMainBinding
import com.naim.androidmultilanguagefontexample.util.LocaleHelper

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.toggleButton?.setOnCheckedChangeListener { buttonView, isChecked ->
            if (buttonView.isPressed) {
                val language = switchLanguage(this)
                LocaleHelper.setLocale(this, language)
                recreate()
            }
        }
    }

    private fun switchLanguage(context: Context): String {
        return if (LocaleHelper.getLanguage(context).equals("en", true)) "ja" else "en"
    }

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(LocaleHelper.onAttach(newBase))
    }
}