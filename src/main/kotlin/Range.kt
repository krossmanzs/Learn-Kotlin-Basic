/*
    Membuat array yang berisi
    data yang angkanya berurutan
 */

fun main() {
    val range = 0..100
    println(range)
    println(range.count())
    println(range.first)
    println(range.last)
    println(range.contains(1001))

    println("==========")

    val range1 = 100 downTo 1 // kebawah
    println(range1)
    println(range1.count())
    println(range1.first)
    println(range1.last)
    println(range1.contains(1001))

    println("==========")

    val range2 = 100 downTo 1 step 5 // kebawah dengan lengkah 5
    println(range2)
    println(range2.count())
    println(range2.first)
    println(range2.last)
    println(range2.contains(1001))
    println(range2.step)
}