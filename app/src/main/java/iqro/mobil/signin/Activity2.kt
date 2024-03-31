package iqro.mobil.signin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.slider.Slider

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)

        findViewById<ImageView>(R.id.backImg).setOnClickListener {
            onBackPressed()
        }

        val slider=findViewById<Slider>(R.id.slider)
        val digitTv=findViewById<TextView>(R.id.digitTv)
        digitTv.text= "${slider.value.toInt()} of ${slider.valueTo.toInt()}"
        slider.addOnChangeListener { _, fl, b ->
            digitTv.text="${fl.toInt()} of ${slider.valueTo.toInt()}"

        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            Intent(this,Activity3::class.java).apply {
                startActivity(this)
            }
        }

    }
}