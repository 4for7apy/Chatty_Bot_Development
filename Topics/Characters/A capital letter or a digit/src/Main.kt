fun main() {
    val a: Char = readln().first()
    
    println(a in '1'..'9' || a in 'A'..'Z')
}

