fun checkNilai(nilai: Char): String {
//    return if (nilai == 'A') {
//        "Bagus"
//    } else {
//        "Jelek"
//    }

    return when(nilai) {
        'A' -> "Bagus"
        'B' -> "Lumayan"
        else -> "Jelek bet AWKOAWKOAW"
    }
}

fun main() {
    val result = checkNilai('A')
    println(result)
}