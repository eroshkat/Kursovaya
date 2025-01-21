package com.example.myapplication111

import android.R.attr.onClick
import android.R.string
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.compose.ui.semantics.SemanticsActions.OnClick
import java.net.URI

class AuthorsActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.authors)

        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            val intent = Intent(this@AuthorsActivity, MainActivity::class.java)
            startActivity(intent)
        }

        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        imageView3.setOnClickListener {
            val telegram = Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/pobsikpolya"))
            startActivity(telegram)
        }

    }
}