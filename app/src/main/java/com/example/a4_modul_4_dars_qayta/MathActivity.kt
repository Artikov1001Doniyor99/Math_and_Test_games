package com.example.a4_modul_4_dars_qayta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_math.*
import kotlin.random.Random

class MathActivity : AppCompatActivity() {

    lateinit var random: java.util.Random
    var result:Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math)
        random = java.util.Random()
        setElement()

        next_btn.setOnClickListener {
            var myResult = edit.text.toString()
            if (myResult == result.toString()){
                Toast.makeText(this, "Qoyil,topding eyyy", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "O'laaa topa olmading !", Toast.LENGTH_SHORT).show()
            }
            edit.setText("")
            setElement()
        }

    }

    fun setElement(){

        var son1 = random.nextInt(100)
        var son2 = random.nextInt(100)
        number1.text = son1.toString()
        number2.text = son2.toString()

        result = null

        val n = random.nextInt(4)

        when(n){
            0 -> {
                amal.text = "+"
                result = son1 + son2
            }

            1 -> {
                amal.text = "-"
                result = son1 - son2
            }

            2 -> {
                amal.text = "*"
                result = son1 * son2
            }

            3 -> {
                amal.text = "/"
                result = son1 / son2
            }
        }

    }

}