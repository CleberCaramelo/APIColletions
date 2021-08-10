package me.cleber

fun main() {

    val values = intArrayOf(0, 3, 8, 6, 1, 7, 10, 2)

    values.forEach {
        println(it)
    }

    println("---------------------")
    values.sort()
    values.forEach {
        println(it)
    }
}