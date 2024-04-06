package com.example.calculadorakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var firstNum = 0.0
    private var operation: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val screen = findViewById<TextView>(R.id.screen)

        val ac = findViewById<Button>(R.id.ac)
        ac.setOnClickListener {
            firstNum = 0.0
            screen.text = "0"
        }

        val off = findViewById<Button>(R.id.off)
        off.setOnClickListener { screen.visibility = View.GONE }

        val on = findViewById<Button>(R.id.on)
        on.setOnClickListener {
            screen.visibility = View.VISIBLE
            screen.text = "0"
        }

        val nums = arrayOf(
            findViewById<Button>(R.id.num1),
            findViewById<Button>(R.id.num1),
            findViewById<Button>(R.id.num2),
            findViewById<Button>(R.id.num3),
            findViewById<Button>(R.id.num4),
            findViewById<Button>(R.id.num5),
            findViewById<Button>(R.id.num6),
            findViewById<Button>(R.id.num7),
            findViewById<Button>(R.id.num8),
            findViewById<Button>(R.id.num9)
        )

        nums.forEach { button ->
            button.setOnClickListener {
                if (screen.text.toString() != "0") {
                    screen.text = screen.text.toString() + button.text.toString()
                } else {
                    screen.text = button.text.toString()
                }
            }
        }

        val opers = arrayOf(
            findViewById<Button>(R.id.div),
            findViewById<Button>(R.id.mul),
            findViewById<Button>(R.id.rest),
            findViewById<Button>(R.id.sum)
        )

        opers.forEach { button ->
            button.setOnClickListener {
                firstNum = screen.text.toString().toDouble()
                operation = button.text.toString()
                screen.text = "0"
            }
        }

        val del = findViewById<Button>(R.id.del)
        del.setOnClickListener {
            val num = screen.text.toString()
            if (num.length > 1) {
                screen.text = num.substring(0, num.length - 1)
            } else if (num.length == 1 && num != "0") {
                screen.text = "0"
            }
        }

        val point = findViewById<Button>(R.id.point)
        point.setOnClickListener {
            if (!screen.text.toString().contains(".")) {
                screen.text = screen.text.toString() + "."
            }
        }

        val resul = findViewById<Button>(R.id.resul)
        resul.setOnClickListener {
            val secondNum = screen.text.toString().toDouble()
            val result: Double = when (operation) {
                "/" -> firstNum / secondNum
                "*" -> firstNum * secondNum
                "-" -> firstNum - secondNum
                "+" -> firstNum + secondNum
                else -> firstNum + secondNum
            }
            screen.text = result.toString()
            firstNum = result
        }
    }
}
