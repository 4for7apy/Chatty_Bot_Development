fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000
    val newHours = totalSeconds % 86400 / 3600
    val newMinutes = totalSeconds % 3600 / 60
    val newSeconds = totalSeconds % 60
    println("$newHours:$newMinutes:$newSeconds")
}
