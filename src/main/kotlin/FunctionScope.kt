/*
    Function Scope
    Ruang lingkup dimana sebuah
    function bisa diakses

    Istilah lainnya adalah
    function didalam function
 */

fun main() {
    fun sayHello(msg: String): Unit = println("Hello $msg")

    sayHello("ANJAYYYYY")
}