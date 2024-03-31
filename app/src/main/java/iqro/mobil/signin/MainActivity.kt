package iqro.mobil.signin

import android.content.Intent
import android.os.Bundle
import android.text.Html.ImageGetter
import android.webkit.WebView.FindListener
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.slider.Slider
import kotlin.math.absoluteValue

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val backImg=findViewById<ImageView>(R.id.backImg)
        backImg.setOnClickListener {
         onBackPressed()
        }



       val button=findViewById<Button>(R.id.button).setOnClickListener {
           Intent(this,Activity2::class.java).apply {
               startActivity(this)
           }
       }


    }
}