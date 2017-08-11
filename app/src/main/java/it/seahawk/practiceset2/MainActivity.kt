package it.seahawk.practiceset2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */

    fun display(text: String) {
        val t = findViewById(R.id.display_text_view) as TextView
        t.text = text
    }

    fun display(text: Int) {
        val t = findViewById(R.id.display_text_view) as TextView
        t.text = text.toString() + ""
    }

    fun display1(text: String) {
        display(text)
    }

    fun display2(text: String) {
        val t = findViewById(R.id.display_text_view_2) as TextView
        t.text = text
    }

    fun display3(text: String) {
        val t = findViewById(R.id.display_text_view_3) as TextView
        t.text = text
    }
}
