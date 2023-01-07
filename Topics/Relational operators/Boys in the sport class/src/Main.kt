fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    val ascending = a <= b && b <=c

    val descending = a >= b && b >= c

    println(ascending || descending)
}
