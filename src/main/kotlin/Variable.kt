const val APPLICATION = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {
    var firstName: String? = null // bisa diubah nilainya menggunakan var (mutable)
    val lastName = " Linux" // tidak bisa diubah nilainya (immutable)

    println(firstName)
    println("$APPLICATION - $VERSION")
    println(firstName?.length)
}