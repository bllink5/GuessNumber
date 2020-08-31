class System(var point: Point) {
    fun sistem(){
        println("Enter Your Name : ")
        val namaPlayer = readLine()!!.trim().toLowerCase()
        val number = listOf(0,1,2,3,4,5,6,7,8,9)
        var round = 0
        var scorePlayer = 0
        var scoreCpu = 0

        do {
            println("$namaPlayer \n" +
                    "Please enter a number 0 - 9")
            var playerInput = readLine()!!.toInt()
            if (!number.contains(playerInput)){
                do {
                    println("Wrong Input")
                    println("$namaPlayer \n" +
                            "Please enter a number 0 - 9")
                    playerInput = readLine()!!.toInt()
                } while (!number.contains(playerInput))
            }

            println("$namaPlayer Guess : $playerInput")
            val pilCpu = number.random()
            println("Cpu Guess : $pilCpu")
            val numberGuess = number.random()
            println("Number come out : $numberGuess")

            val closestPlayer = point.closest(playerInput!!.toInt(),numberGuess)
            val closestCpu = point.closest(pilCpu,numberGuess)

            val winner = point.winner(closestPlayer,closestCpu,namaPlayer)

            println("closest number for $namaPlayer : $closestPlayer")
            println("closest number for Cpu : $closestCpu")
            println("Result : $winner")
            println("======================================")

            if (winner == "$namaPlayer Score +1 "){
                scorePlayer++
            } else if (winner == "Cpu Score +1 "){
                scoreCpu++
            }
            round++
        } while (round < 3)

        println("Total Score $namaPlayer :  $scorePlayer")
        println("Total Score Cpu  : $scoreCpu")
        if (scorePlayer > scoreCpu){
            //println("======================================")
            println("           $namaPlayer Win !          ")
            //println("======================================")
        } else if (scoreCpu > scorePlayer){
            //println("======================================")
            println("               Cpu Win !              ")
            //println("======================================")
        } else
            println("Draw ! ")
        println("======================================")
        println("           PLAY AGAIN ? : Y/N         ")
        println("======================================")

        val input = readLine()
        if (input.equals("y",ignoreCase = true)) {
            return sistem()
        } else (input.equals("n",ignoreCase = true))
        println("======================================")
        println("               GAME OVER              ")
        println("======================================")
    }
}