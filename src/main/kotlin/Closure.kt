/*
    Closure
    Kemampuan sebuah function,
    lambda atau anonymous function
    berinteraksi dengan data-data
    disekitarnya dalam scope yang sama
 */

fun main() {
    var counter = 0
//    val lambdaIncrement: () -> Unit = {
//        println("Increment")
//        counter++
//    }
    val lambdaIncrement = {
        println("Lambda Increment")
        counter++
    }

    val anonymousIncrement = fun() {
        println("Anonymous Increment")
        counter++
    }

    fun functionIncrement() {
        println("Function Increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)
}
