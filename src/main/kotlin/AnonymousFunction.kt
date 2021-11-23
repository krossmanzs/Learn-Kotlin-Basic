import java.util.*

fun main() {
    fun hello(name: String, transformer: (String) -> String) : String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val upper = fun(value: String): String {
        return if(value.isBlank()) {
            "UPS"
        } else {
            value.uppercase(Locale.getDefault())
        }
    }

    println(hello("Linux",upper))
    println(hello("",upper))
}