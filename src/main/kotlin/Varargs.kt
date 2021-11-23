fun main() {
    display(1,2,3,4,5,6,7,8,9,10)
}

fun display(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}