package com.example.myapplication

import kotlin.random.Random

fun task(x: Int): Int {
    return x + 10
}

val task2 = { x: Int -> x > 0 }


fun Array<Int>.filterAndMap(filter: (Int) -> Boolean, map: (Int) -> Int): Array<Int> {

    return this.filter(filter)
        .map(map)
        .toTypedArray()
}

fun zadanie4() {
    println("Задание 4 ")

    print("Введите размер массива N: ")
    val N = readLine()?.toIntOrNull() ?: 0

    val array = Array(N) { Random.nextInt(-100, 501) }

    println("Исходный массив: ${array.joinToString(", ")}")

    val resultArray = array.filterAndMap(task2, ::task1)

    println("Массив после применения filterAndMap: ${resultArray.joinToString(", ")}")
}