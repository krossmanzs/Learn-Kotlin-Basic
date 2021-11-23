/*
    Label
    adalah penanda
    dengan prefix @

    Untuk menentukan ke label
    mana kode akan berhenti
 */

fun test (name: String, operation: (String) -> Unit): Unit = operation(name)

fun main() {
    loopI@ for (i in 0..10) {
        loopJ@ for (j in 0..10) {
            println("$i * $j = ${i * j}")
            if (j == 5) {
                println()
                break@loopJ
            }
        }
    }

    println("\n=============\n")

    test("Linux") test@ {
        if(it == "") {
            return@test
        } else {
            println("Cornelius")
        }
    }
}

