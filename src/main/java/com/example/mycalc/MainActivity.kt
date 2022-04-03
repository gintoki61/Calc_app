package com.example.mycalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var output: TextView
    private lateinit var myOperator: String

    private var firstNum: Double = 0.0
    private var secondNum: Double = 0.0
    private var lastNum: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cleadData() {
        output.text = ""
        firstNum = 0.0
        secondNum = 0.0
        lastNum = 0.0
        myOperator = ""
    }

    fun setOperator(button: Button) {
        val firstNum = output.text.toString().toDouble()
        val myOperator = button.text.toString()

        output.text = myOperator
    }

    fun creatNums(button: Button) {
        val text1 = output.text.toString()
        val text2 = button.text.toString()

        output.text = text1 + text2
    }

    fun findOutput(button: Button) {
        val secondNum = output.text.toString().toDouble()

        if(myOperator == "+") {
            lastNum = firstNum + secondNum;
        } else if(myOperator == "-") {
            lastNum = firstNum + secondNum;
        } else if(myOperator == "*") {
            lastNum = firstNum * secondNum;
        } else if(myOperator == "/") {
            lastNum = firstNum / secondNum;
        }

        output.text = lastNum.toString()
    }

}