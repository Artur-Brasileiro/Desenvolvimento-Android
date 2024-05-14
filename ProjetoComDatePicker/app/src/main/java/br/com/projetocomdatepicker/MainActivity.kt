package br.com.projetocomdatepicker

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import java.text.SimpleDateFormat
import java.time.Year
import java.util.Calendar
import java.util.Locale

class MainActivity : AppCompatActivity() {

    var cal = Calendar.getInstance()
    lateinit var data : TextView
    lateinit var botao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        data = findViewById(R.id.data)
        botao = findViewById(R.id.button)
        
        var dateSetListener = object : DatePickerDialog.OnDateSetListener {

            override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, month)
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                
                val formatador = SimpleDateFormat("dd/MM/yyyy", Locale.ITALY)
                data.text = formatador.format(cal.time)
            }
        }

        botao.setOnClickListener{
            DatePickerDialog(this@MainActivity, dateSetListener, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH)).show()
        }
    }
}