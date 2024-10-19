package com.example.myapplication

fun zadanie4v9() {
    val array = intArrayOf(1, 4, 3, 2, 1)
    var isAscending = true
    var isDescending = true

    for (i in 0 until array.size - 1) {
        if (array[i] > array[i + 1]) {
            isAscending = false
        }
        if (array[i] < array[i + 1]) {
            isDescending = false
        }
    }

    when {
        isAscending -> println("Массив упорядочен по возрастанию")
        isDescending -> println("Массив упорядочен по убыванию")
        else -> println("Массив неупорядочен")
    }
}