package com.example.calculadorakotlin

class TestCalculadora {
    fun suma(firstnum: String, secondNum: String): String {
        val resultado = firstnum.toInt() + secondNum.toInt()
        return resultado.toString()
    }

    fun resta(firstnum: String, secondNum: String): String {
        val resultado = firstnum.toInt() - secondNum.toInt()
        return resultado.toString()
    }

    fun division(firstnum: String, secondNum: String): String {
        val resultado = firstnum.toInt() / secondNum.toInt()
        return resultado.toString()
    }

    fun multiplicacion(firstnum: String, secondNum: String): String {
        val resultado = firstnum.toInt() * secondNum.toInt()
        return resultado.toString()
    }
}
