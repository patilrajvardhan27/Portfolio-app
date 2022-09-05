package com.example.portfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart:Button = findViewById(R.id.btnaboutme)
        btnStart.setOnClickListener(){
            val intent = Intent(this,Aboutme::class.java)
            startActivity(intent)
            finish()
        }

        val btndownload : Button = findViewById(R.id.btndw)
        btndownload.setOnClickListener(){
            val uri = Uri.parse("https://drive.google.com/file/d/1Mdh_ACPPfksdet-NWYCb_VaTPG8Jy-FM/view?usp=sharing")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
}