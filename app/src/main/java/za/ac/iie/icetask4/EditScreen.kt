package za.ac.iie.icetask4

import android.os.Bundle
import android.text.InputType
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class EditScreen  : AppCompatActivity() {

    private val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    private var maxTemps = arrayOf(25, 29, 22, 24, 20, 18, 16)
    private val weatherConditions = arrayOf("Sunny", "Cloudy", "Rainy", "Sunny", "Windy", "Rainy", "Cloudy")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editscreen)

        val layout = findViewById<LinearLayout>(R.id.editLayout)

        for (i in days.indices) {
            val row = LinearLayout(this).apply {
                orientation = LinearLayout.HORIZONTAL
            }

            val dayLabel = TextView(this).apply {
                text = days[i]
                setPadding(8, 8, 8, 8)
            }

            val tempInput = EditText(this).apply {
                hint = "Temp"
                setText(maxTemps[i].toString())
                inputType = InputType.TYPE_CLASS_NUMBER
            }

            val conditionInput = EditText(this).apply {
                hint = "Condition"
                setText(weatherConditions[i])
            }

            row.addView(dayLabel)
            row.addView(tempInput)
            row.addView(conditionInput)

            layout.addView(row)
        }

        findViewById<Button>(R.id.btnSave).setOnClickListener {
            Toast.makeText(this, "Changes saved", Toast.LENGTH_SHORT).show()
            finish() // This will go back to MainActivity if it was the previous screen
        }

    }
}

