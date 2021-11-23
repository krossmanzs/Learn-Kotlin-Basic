fun main() {
    val names = arrayOf("Linux","Edwin","Tito")
    for (name in names) {
        println(name)
    }

    println()

//    for (value in 0..100) {
//        println(value)
//    }

//    for (value in 1000 downTo 0 step 5) {
//        println(value)
//    }

    for (i in names.indices) {
        println("index $i bernilai ${names[i]}")
    }

    var fullName = fullName(lastName = "Linux",
                firstName = "Cornelius")
    println(fullName)
}

fun fullName(firstName: String, lastName: String, midleName: String = ""): String =
    ("Hello $firstName $midleName $lastName")