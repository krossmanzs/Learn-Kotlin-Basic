/*
    Inline Function
    code di dalam Higher-Order
    Function akan di duplicate
    agar pada saat runtime, aplikasi
    tidak perlu membuat object lambda
    berulang-ulang
 */

inline fun hello(
    firstName: () -> String,
    noinline lastName: () -> String): String {
    return "Hello ${firstName() + lastName()}"
}

fun main() {
    println(hello({ "Cornelius" }, { "Linux" }))
}