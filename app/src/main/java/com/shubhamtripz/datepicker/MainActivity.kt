package com.shubhamtripz.datepicker
import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var openbtn : Button
    private lateinit var calender : Calendar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openbtn = findViewById(R.id.openbtn)
        calender = Calendar.getInstance()

        openbtn.setOnClickListener {

            val datePicker = DatePickerDialog(
                this, { _, year, month, dayOfMonth ->
                    val selectedDate = "$dayOfMonth/${month + 1}/$year"
                    Toast.makeText(this, "selected date: $selectedDate", Toast.LENGTH_SHORT).show()
                },
                calender.get(Calendar.YEAR),
                calender.get(Calendar.MONTH),
                calender.get(Calendar.DAY_OF_MONTH)

            )
            datePicker.show()


        }

    }
}