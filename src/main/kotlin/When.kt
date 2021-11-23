/*
    When expression biasa dipanggil
    sebagai switch expression
    pada bahasa pemograman lainnya
 */

fun main() {
    val nilaiUlangan: Char = 'C'

    when (nilaiUlangan) {
        'A' -> println("Wow")
        'B' -> {
            println("XD")
        }
        'C','O','E' -> println("AWKOWAKOAW")
        else -> {
            println("apa njir jelek bet")
        }
    }

    println()

    val nilaiTugas = 'A'
    val kriteriaLulus = arrayOf('A','B')

    // in digunakan untuk mengecek
    // apakah nilainya terdapat di
    // suatu variable atau array
    when (nilaiTugas) {
        in kriteriaLulus -> println("Lulus")
        !in kriteriaLulus -> println("Tidak lulus")
    }

    // is digunakan untuk mengecek
    // apakah tipe variablenya cocok
    val nama = "Linux"
    when (nama) {
        is String -> println("Tipenya adalah String")
        !is String -> println("Tipenya bukan String")
    }
}