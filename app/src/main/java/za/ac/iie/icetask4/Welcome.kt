package za.ac.iie.icetask4


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val button = findViewById<Button>(R.id.btnProceed)
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}

