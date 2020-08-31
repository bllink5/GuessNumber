class Point {
    fun closest(number1 : Int , number2 : Int) : Int {
        if (number1 < number2) {
            return number2 - number1
        } else {
            return number1 - number2
        }
    }

    fun winner(closestPlayer : Int, closestCpu : Int, nama : String) : String {
        return when {
            closestPlayer < closestCpu -> {
                "$nama Score +1 "
            }
            closestCpu < closestPlayer -> {
                "Cpu Score +1 "
            }
            else -> {
                "Draw ! "
            }
        }
    }
}