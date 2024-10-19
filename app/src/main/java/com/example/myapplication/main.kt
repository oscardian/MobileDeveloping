package com.example.myapplication

fun main() {
    println("Hello")
    //Zadanie 1 variant 1
    println("Введите число")
    val number = readln().toInt()
    println(task1(number))
    //zadanie 2 variant 1
    val task2: (Int) -> Boolean = { number -> number > 0 }
    println("Введите число")
    val number1 = readln().toInt()
    println(task2(number1))
    //zadanie 3 variant 4
    val array = arrayOf(-3, 5, 0, 7, -2, 10)
    val arrayTask2 = array.filter(task2)
    println(arrayTask2)
}