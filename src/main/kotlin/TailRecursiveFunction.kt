fun main() {
    tailrec fun display(value: Int) {
        println("Recursive $value")
        if (value > 0) {
            display(value - 1)
        }
    }

    tailrec fun recursiveTail(value: Int, total: Int = 1): Int {
        return when (value) {
            1 -> total
            else -> recursiveTail(value - 1, total * value)
        }
    }

    println(recursiveTail(10))
}