package za.ac.iie.icetask4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    private val maxTemps = arrayOf(25, 29, 22, 24, 20, 18, 16)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultText = findViewById<TextView>(R.id.tvWeatherData)
        val avgText = findViewById<TextView>(R.id.tvAverage)
        val backButton = findViewById<Button>(R.id.btnBack)

        val stringBuilder = StringBuilder()
        var total = 0

        for (i in days.indices) {
            stringBuilder.append("${days[i]}: ${maxTemps[i]}°C\n")
            total += maxTemps[i]
        }

        val average = total / maxTemps.size
        resultText.text = stringBuilder.toString()
        avgText.text = "Average Max Temperature: $average°C"

        backButton.setOnClickListener {
            startActivity(Intent(this, EditScreen ::class.java))
            finish()
        }
    }
}
