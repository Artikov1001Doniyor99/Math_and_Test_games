package com.example.a4_modul_4_dars_qayta

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Color.*
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_math.*
import kotlinx.android.synthetic.main.activity_test_mission.*

class Test_mission : AppCompatActivity() {
    var N = 0
    var T = 0
    var F = 0

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_mission)

        main_tv.text = "O'zbekiston Respublikasi qachon mustaqillikka erishgan ?"
        rb1.text = "1989 yil"
        rb2.text = "1990 yil"
        rb3.text = "1991 yil"
        rb4.text = "1992 yil"
        next_two.text = "Natijani ko'rish va keyingiga o'tish"

        next_two.setOnClickListener {
        if(rb1.isChecked || rb2.isChecked || rb3.isChecked || rb4.isChecked) {

                if (rb3.isChecked) {
                    tv3.text = (++T).toString()
                    Toast.makeText(this, "To'g'ri", Toast.LENGTH_SHORT).show()
                } else {
                    if (!rb1.isChecked && !rb2.isChecked && !rb3.isChecked && !rb4.isChecked) {
                        Toast.makeText(this, "Javob belgilang", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, "Xato", Toast.LENGTH_SHORT).show()
                        tv2.text = (++F).toString()
                    }
                }
                rb_group.clearCheck()




                main_tv.text = "O'zbekiston Respublikasi davlat bayrog'iga qachon asos solingan ?"
                rb1.text = "1991 yil 18 yanvar"
                rb2.text = "1990 yil 18 noyabr"
                rb3.text = "1993 yil 18 fevral"
                rb4.text = "1991 yil 18 noyabr"
                next_two.text = "Natijani ko'rish va keyingiga o'tish"

            next_two.setOnClickListener {
                if (rb1.isChecked || rb2.isChecked || rb3.isChecked || rb4.isChecked) {

                        if (rb4.isChecked) {
                            tv3.text = (++T).toString()
                            Toast.makeText(this, "To'g'ri", Toast.LENGTH_SHORT).show()
                        } else {
                            if (!rb1.isChecked && !rb2.isChecked && !rb3.isChecked && !rb4.isChecked) {
                                Toast.makeText(this, "Javob belgilang", Toast.LENGTH_SHORT).show()
                            } else {
                                Toast.makeText(this, "Xato", Toast.LENGTH_SHORT).show()
                                tv2.text = (++F).toString()
                            }
                        }
                        rb_group.clearCheck()


                        main_tv.text = "O'zbekiston Respublikasi davlat gerbiga qachon asos solingan ?"
                        rb1.text = "1992 yil 2 iyul"
                        rb2.text = "1990 yil 18 noyabr"
                        rb3.text = "1993 yil 2 fevral"
                        rb4.text = "1989 yil 18 noyabr"

                    next_two.setOnClickListener {
                        if (rb1.isChecked || rb2.isChecked || rb3.isChecked || rb4.isChecked) {

                                if (rb1.isChecked) {
                                    Toast.makeText(this, "To'g'ri", Toast.LENGTH_SHORT).show()
                                    tv3.text = (++T).toString()
                                } else {
                                    if (!rb1.isChecked && !rb2.isChecked && !rb3.isChecked && !rb4.isChecked) {
                                        Toast.makeText(this, "Javob belgilang", Toast.LENGTH_SHORT).show()
                                    } else {
                                        Toast.makeText(this, "Xato", Toast.LENGTH_SHORT).show()
                                        tv2.text = (++F).toString()
                                    }
                                }
                                rb_group.clearCheck()
                                main_tv.text = "O'zbekiston Respublikasi davlat madhiyasiga qachon qabul qilingan ?"
                                rb1.text = "1992 yil 2 iyul"
                                rb2.text = "1990 yil 18 noyabr"
                                rb3.text = "1991 yil 10 fevral"
                                rb4.text = "1992 yil 10 dekabr"

                            next_two.setOnClickListener {
                                if (rb1.isChecked || rb2.isChecked || rb3.isChecked || rb4.isChecked) {

                                        if (rb4.isChecked) {
                                            Toast.makeText(this, "To'g'ri", Toast.LENGTH_SHORT).show()
                                            tv3.text = (++T).toString()
                                        } else {
                                            if (!rb1.isChecked && !rb2.isChecked && !rb3.isChecked && !rb4.isChecked) {
                                                Toast.makeText(this, "Javob belgilang", Toast.LENGTH_SHORT).show()
                                                rb_group.clearCheck()
                                            } else {
                                                Toast.makeText(this, "Xato", Toast.LENGTH_SHORT).show()
                                                tv2.text = (++F).toString()
                                            }
                                        }
                                        rb_group.clearCheck()
                                        main_tv.text = "O'zbekiston Respublikasi birinchi prezidenti kim ?"
                                        rb1.text = "Sh.Mirziyoyev"
                                        rb2.text = "I.Karimov"
                                        rb3.text = "J.Otajonov"
                                        rb4.text = "A.Aripov"

                                    next_two.setOnClickListener {
                                        if (rb1.isChecked || rb2.isChecked || rb3.isChecked || rb4.isChecked) {

                                                if (rb2.isChecked) {
                                                    Toast.makeText(this, "To'g'ri", Toast.LENGTH_SHORT).show()
                                                    tv3.text = (++T).toString()
                                                } else {
                                                    if (!rb1.isChecked && !rb2.isChecked && !rb3.isChecked && !rb4.isChecked) {
                                                        Toast.makeText(this, "Javob belgilang", Toast.LENGTH_SHORT).show()
                                                        rb_group.clearCheck()
                                                    } else {
                                                        Toast.makeText(this, "Xato", Toast.LENGTH_SHORT).show()
                                                        tv2.text = (++F).toString()
                                                    }
                                                }
                                                rb_group.clearCheck()
                                                main_tv.text = "Test tugadi"
                                                main_tv.textSize = 40F
                                                main_tv.setTextColor(RED)
                                                main_tv.setBackgroundColor(WHITE)
                                                rb1.text = "----------"
                                                rb2.text = "----------"
                                                rb3.text = "----------"
                                                rb4.text = "----------"
                                                next_two.setBackgroundColor(RED)
                                                next_two.visibility = View.GONE
                                            rb_group.visibility = View.GONE
                                                next_two.text = ""
                                                next_two.setOnClickListener {
                                                    Toast.makeText(this, "Test tugadi", Toast.LENGTH_SHORT).show()
                                                }

                                            } else {
                                                Toast.makeText(this, "Birortasini tanlang", Toast.LENGTH_SHORT).show()
                                            }
                                        }


                                } else {
                                    Toast.makeText(this, "Birortasini tanlang", Toast.LENGTH_SHORT).show()
                                }
                                    }


                            } else {
                                Toast.makeText(this, "Birortasini tanlang", Toast.LENGTH_SHORT).show()
                            }

                        }

                    } else {
                        Toast.makeText(this, "Birortasini tanlang", Toast.LENGTH_SHORT).show()
                    }
                }

            }else{
                Toast.makeText(this, "Birortasini tanlang", Toast.LENGTH_SHORT).show()
            }
        }


          /*when(0){
                0 -> {
                    main_tv.text = "O'zbekiston Respublikasiga qachon asos solingan ?"
                    rb1.text = "1989 yil"
                    rb2.text = "1990 yil"
                    rb3.text = "1991 yil"
                    rb4.text = "1992 yil"
                    next_two.setOnClickListener {
                        if (rb3.isChecked) {
                            Toast.makeText(this, "To'g'ri", Toast.LENGTH_SHORT).show()
                            tv2.text = (T++).toString()
                        } else {
                            Toast.makeText(this, "Xato", Toast.LENGTH_SHORT).show()
                            tv2.text = (F++).toString()
                        }
                        rb_group.clearCheck()
                    }
                }
                1 -> {
                    main_tv.text = "O'zbekiston Respublikasi davlat bayrog'iga qachon asos solingan ?"
                    rb1.text = "1991 yil 18 yanvar"
                    rb2.text = "1990 yil 18 noyabr"
                    rb3.text = "1993 yil 18 fevral"
                    rb4.text = "1991 yil 18 noyabr"
                    next_two.setOnClickListener {
                        if (rb4.isChecked) {
                            Toast.makeText(this, "To'g'ri", Toast.LENGTH_SHORT).show()
                            tv2.text = (T++).toString()
                        } else {
                            Toast.makeText(this, "Xato", Toast.LENGTH_SHORT).show()
                            tv2.text = (F++).toString()
                        }
                        rb_group.clearCheck()
                    }
                }
                2 -> {
                    main_tv.text = "O'zbekiston Respublikasi davlat gerbiga qachon asos solingan ?"
                    rb1.text = "1992 yil 2 iyul"
                    rb2.text = "1990 yil 18 noyabr"
                    rb3.text = "1993 yil 2 fevral"
                    rb4.text = "1989 yil 18 noyabr"
                    next_two.setOnClickListener {
                        if (rb1.isChecked) {
                            Toast.makeText(this, "To'g'ri", Toast.LENGTH_SHORT).show()
                            tv2.text = (T++).toString()
                        } else {
                            Toast.makeText(this, "Xato", Toast.LENGTH_SHORT).show()
                            tv2.text = (F++).toString()
                        }
                        rb_group.clearCheck()
                    }
                }
                3 -> {
                    main_tv.text = "O'zbekiston Respublikasi davlat madhiyasiga qachon qabul qilingan ?"
                    rb1.text = "1992 yil 2 iyul"
                    rb2.text = "1990 yil 18 noyabr"
                    rb3.text = "1991 yil 10 fevral"
                    rb4.text = "1992 yil 10 dekabr"
                    next_two.setOnClickListener {
                        if (rb4.isChecked) {
                            Toast.makeText(this, "To'g'ri", Toast.LENGTH_SHORT).show()
                            tv2.text = (T++).toString()
                        } else {
                            Toast.makeText(this, "Xato", Toast.LENGTH_SHORT).show()
                            tv2.text = (F++).toString()
                        }
                        rb_group.clearCheck()
                    }
                }
                4 -> {
                    main_tv.text = "O'zbekiston Respublikasi birinchi prezidenti kim ?"
                    rb1.text = "Sh.Mirziyoyev"
                    rb2.text = "I.Karimov"
                    rb3.text = "J.Otajonov"
                    rb4.text = "A.Aripov"
                    next_two.setOnClickListener {
                        if (rb4.isChecked) {
                            Toast.makeText(this, "To'g'ri", Toast.LENGTH_SHORT).show()
                            tv2.text = (T++).toString()
                        } else {
                            Toast.makeText(this, "Xato", Toast.LENGTH_SHORT).show()
                            tv2.text = (F++).toString()
                        }
                        rb_group.clearCheck()
                    }
                }
            }

        rb_group.clearCheck()
        main_tv.text = "Test tugadi"
        rb1.text = "----------"
        rb2.text = "----------"
        rb3.text = "----------"
        rb4.text = "----------"*/
                }
            }