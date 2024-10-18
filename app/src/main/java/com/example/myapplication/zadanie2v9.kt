package com.example.myapplication

import androidx.compose.runtime.produceState

fun zadanie2v9() {
    println("Введите число 1")
    val a = readln().toInt()
    println("Введите число 2")
    val b = readln().toInt()
    println("Введите число 3")
    val c = readln().toInt()

    val d = a + b
    val z = a + c
    val x = b + c
    if (d > x && d > z){
        println("сумма чисел a и b больше")
    }
    else if (z > d && z > x){
        println("сумма чисел a и c больше")
        }
    else {
        println("сумма числе b и c больше")
    }

    when {
        d>x && d>z -> println("сумма чисел a и b больше")
        z>x && z>d -> println("сумма чисел a и c больше")
        else -> println("сумма числе b и c больше")
    }


}