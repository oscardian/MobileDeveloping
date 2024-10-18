package com.example.myapplication

fun zadanie3v9() {
    for (i in 1..20) {
        if (i % 2 == 0) {
            repeat(10) {
                print("$i ")
            }
        } else {
            repeat(10) {
                print("1 ")
            }
        }
        println()
    }
}