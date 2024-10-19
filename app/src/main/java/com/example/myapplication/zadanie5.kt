package com.example.myapplication

import com.example.mobiledeveloping.Circle
import com.example.mobiledeveloping.Rectangle
import com.example.mobiledeveloping.Triangle

fun zadanie5() {
    val circle = Circle("Red", true, 5.0)
    val rectangle = Rectangle("Blue", false, 4.0, 6.0)
    val triangle = Triangle("Green", true, 3.0, 4.0, 5.0)

    val shapes = listOf(circle, rectangle, triangle)

    for (shape in shapes) {
        println(shape.toString())
        println("Area: ${shape.getArea()}")
        println("Perimeter: ${shape.getPerimeter()}")
        println()
    }

}