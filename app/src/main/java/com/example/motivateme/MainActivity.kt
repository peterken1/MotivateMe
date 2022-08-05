package com.example.motivateme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //Declare our references to views before layout inflation
    private lateinit var name: EditText
    private lateinit var message: TextView

    //Override lifecycle method onCreate. This should initialize all important items for the code.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Inflate the given layout to turn xml views into kotlin objects.
        setContentView(R.layout.activity_main)

        //Get a reference to the button view from our layout and set a clickListener
        val updateButton: Button = findViewById(R.id.activity_main_bt_update)
        updateButton.setOnClickListener { updateMessage() }

        //Set the value to our declared views
        name = findViewById(R.id.activity_main_et_name)
        message = findViewById(R.id.main_activity_tv_message)


    }
    //Get a name from an editText and display a personalized message
    private fun updateMessage(){
        //Get the username from the editText
        val username = name.text
        //Update the textView to display our message
        if (username.toString() == ""){
            message.text = "Make sure to enter your name!"
        }else{
            message.text = "Hello $username!"
        }




        //Clear the editText and use setText because editText's require an editable
        name.setText("")


    }

}