package com.example.a4_modul_4_dars_qayta

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.CompoundButton
import android.widget.RadioGroup
import android.widget.Toast
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.imagebutton_layout.*

class MainActivity : AppCompatActivity() {

    var TAG = "Artikov"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.imagebutton_layout)

        button_a.setOnClickListener {

            val text = "Assalomu aleykum"
            val duration = Toast.LENGTH_LONG
            val toast = Toast.makeText(this,text,duration)
            toast.setGravity(Gravity.CENTER,0,0)
            toast.show()

/*            Toast.makeText(this, "La la kuuuuu", Toast.LENGTH_SHORT).show()
*
* */
/*            Log.d(TAG,"Doniyor")
            Log.e(TAG,"Doniyor")
            Log.w(TAG,"Doniyor")
            Log.i(TAG,"Doniyor")
            Log.v(TAG,"Doniyor")*/
        }


/*
        toogle1.setOnCheckedChangeListener { buttonView, isChecked ->
            println(isChecked)
        }
*/

/*        switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            println(isChecked)
        }*/

/*

        radio.setOnCheckedChangeListener { group, checkedId -> }

        radio.clearCheck()

        radioButton1.setOnCheckedChangeListener { buttonView, isChecked ->  }
*/

/*        checkbox1.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                if (isChecked) {
                    println("Checked")
                } else {
                    println("Not checked")
                }
            }

        })*/

        //https://yt3.ggpht.com/ytc/AAUvwnhJadO7VnYGM3CXDmtPsK90RkfLNwnzcoFx__SqQQ=s900-c-k-c0x00ffffff-no-rj

/*        Picasso.get().load("https://storage.kun.uz/source/thumbnails/_medium/7/HHRB8elv-qpjiqlBrtDhCETxsipIbwhl_medium.jpg").into(imageV)
      */
        /*
      Glide.with(this).load("https://storage.kun.uz/source/thumbnails/_medium/7/HHRB8elv-qpjiqlBrtDhCETxsipIbwhl_medium.jpg").into(imageV)
        */
/*
        val parse =
            Uri.parse("https://storage.kun.uz/source/thumbnails/_medium/7/HHRB8elv-qpjiqlBrtDhCETxsipIbwhl_medium.jpg")
        imageV.setImageURI(parse)*/


    }
}