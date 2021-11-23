/*
    Infix Notation
    Operasi yang dilakukan di operasi
    matematika, dimana dia melakukan
    operasi terhadap dua data
 */

infix fun Int.tambah(b: Int): Int = this + b

fun main() {
    println("Hasil 2 + 1 adalah ${2 tambah 1}")
}