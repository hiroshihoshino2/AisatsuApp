package jp.techacademy.hiroshi.hoshino2.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener{
           showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {

        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                    Log.d("UI_PARTS", "$hour:$minute")

                    textView.text = when{
                        hour in 2..9 -> "おはよう"
                        hour in 10..17 -> "こんにちは"
                        else -> "こんばんは"
                    }
                },
                13, 0, true)
        timePickerDialog.show()

        Log.d("UI_log_Hoshino", "ボタンをタップしました")

    }
}
