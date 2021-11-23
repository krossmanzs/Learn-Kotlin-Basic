fun main() {
    val nama: Array<String> = arrayOf("Cornelius", "Linux")
    displayArr(nama)

    nama[0] = "Bambang"
    displayArr(nama)

    val members: Array<String?> = arrayOfNulls(10)
    members[0] = "wow"
    members[1] = null
    println(members[0])
}

fun displayArr(array: Array<String>) {
    println("${array[0]} ${array[1]} dengan panjang ${array.size}")
}