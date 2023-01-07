fun main() {
    val x = readln().toInt()
    val y = readln().toInt()
    val z = readln().toInt()

    println(x > 0 && y <= 0 && z <= 0 || y > 0 && x <= 0 && z <= 0 || z > 0 && y <= 0 && x <= 0)
}