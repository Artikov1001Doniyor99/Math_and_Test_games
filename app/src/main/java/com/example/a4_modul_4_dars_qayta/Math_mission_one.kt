   package com.example.a4_modul_4_dars_qayta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_math.*
import kotlinx.android.synthetic.main.activity_math_mission_one.*
import java.util.*

    class Math_mission_one : AppCompatActivity() {

    lateinit var random:Random
    var result:Double? = null
        var N:Int = 0
        var M:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math_mission_one)

        random = Random()
        setElements()

        next_one.setOnClickListener {
            if (amal_one.text != "/"){
            var myResultOne = edit_one.text.toString() + ".0"
                if (myResultOne == result.toString()){
                    Toast.makeText(this, "To'g'ri", Toast.LENGTH_SHORT).show()
                    if (myResultOne.isNotEmpty()){
                        N++
                    }else{
                        Toast.makeText(this, "Son kiriting", Toast.LENGTH_SHORT).show()
                    }
                }else{
                    Toast.makeText(this, "Xato", Toast.LENGTH_SHORT).show()
                    if (myResultOne == ".0"){
                        Toast.makeText(this, "Son kiriting", Toast.LENGTH_SHORT).show()
                    }else{
                        M++
                    }
                }
            }else{
                var myResultOne = edit_one.text.toString()
                if (myResultOne == result.toString()){
                    Toast.makeText(this, "To'g'ri", Toast.LENGTH_SHORT).show()
                    if (myResultOne.isNotEmpty()){
                        N++
                    }else{
                        Toast.makeText(this, "Son kiriting", Toast.LENGTH_SHORT).show()
                    }
                }else{
                    if(myResultOne.isEmpty()){
                        Toast.makeText(this, "Son kiriting", Toast.LENGTH_SHORT).show()
                    }else{
                        Toast.makeText(this, "Xato", Toast.LENGTH_SHORT).show()
                        M++
                    }
                }
            }

            edit_one.setText("")
            text_true.text = N.toString()
            text_false.text = M.toString()
            setElements()
        }

    }

        fun setElements(){
            var son1 = random.nextInt(100)
            var son2 = random.nextInt(100)

            numberOne.text = son1.toString()
            numberTwo.text = son2.toString()

            result = null

            val n = random.nextInt(4)

            when(n){
                0 -> {
                    amal_one.text = "+"
                    result = son1.toDouble() + son2
                }
                1 -> {
                    amal_one.text = "-"
                    result = son1.toDouble() - son2
                }
                2 -> {
                    amal_one.text = "*"
                    result = son1.toDouble() * son2
                }
                3 -> {
                    amal_one.text = "/"
                    var Dson:Double = son1.toDouble() / son2.toDouble()
                    var length = Dson.toString().length
                        if (length in 0..3){
                            result = Dson
                        }else {
                            var substring = Dson.toString().substring(0, 4).toDouble()
                            result = substring
                        }
                    }
                }
            }

        }
