import java.util.*

fun toUpper(value: String): String = value.uppercase(Locale.getDefault())

fun main() {
//    val tambahSatu: (Int) -> Int = { value: Int ->
//        value + 1
//    }
    val tambahSatu: (Int) -> Int = {
        it + 1
    }

    val result = tambahSatu(5)
    println(result)

    // lambda with
    // method reference
    val toUpperCase : (String) -> String = ::toUpper
    println(toUpperCase("Linux"))
}