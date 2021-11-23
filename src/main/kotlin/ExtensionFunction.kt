/*
    Extension Function
    Kemampuan menambahkan function
    pada tipe data yang sudah ada
 */

fun String.hello(): String = "Hello $this"

fun main() {
    val name = "Linux"
    println(name.hello())
}