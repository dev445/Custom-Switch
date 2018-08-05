package com.example.shahd.multipleuserregistration

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Glide.with(this@MainActivity)
                .load(R.drawable.cofee)
                .apply(RequestOptions().circleCrop())
                .into(img_profile)

        Glide.with(this@MainActivity)
                .load(R.drawable.cofee)
                .apply(RequestOptions().circleCrop())
                .into(img_small_pic)




    }
}
