package com.example.myapplication

fun zadanie1v9() {
    val k1  = 6.0
    val k2  = 10.0
    val g = Math.sqrt(k1 * k1 + k2 * k2)


    val area = 0.5 * k1 * k2


    val perimeter = k1 + k2 + g


    println("Гипотенуза: $g")
    println("Площадь: $area")
    println("Периметр: $perimeter")
}