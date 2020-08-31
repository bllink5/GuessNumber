fun main() {
    val sistem = System(point = Point())

    var input : Int

    do {
        println("======================================")
        println("            GUESS THE NUMBER          ")
        println("======================================")
        println(" 1. PLAY ")
        println(" 2. EXIT ")
        input = readLine()!!.toInt()
        when(input){
            1-> sistem.sistem()
            2-> println("THANK'S FOR PLAYING")
        }
    } while (input != 2)
}