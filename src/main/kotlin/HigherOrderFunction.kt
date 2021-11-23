import java.util.*

fun main() {
    fun hello(name: String, transformer: (String) -> String) : String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lambdaUpper = {value: String -> value.uppercase(Locale.getDefault()) }
    val lambdaLower = {value: String -> value.lowercase(Locale.getDefault()) }
    println(hello("Linux",lambdaUpper))
    println(hello("Linux",lambdaLower))

    // Trailing Lambda
    // biasanya digunakan ketika
    // parameter lambda nya berada
    // di paling akhir
    val result = hello("Linux") { value: String ->
        value.lowercase(Locale.getDefault())
    }
}