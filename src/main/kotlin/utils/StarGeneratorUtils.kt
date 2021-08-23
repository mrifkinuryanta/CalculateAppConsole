package utils

class StarGeneratorUtils {
    fun printStar(totalStar: Int) {
        if (totalStar <= 20) {
            for (i in 0 until totalStar) {
                for (j in 0..i) {
                    print("*")
                }
                println()
            }
        } else {
            println("Total stars should not greater than 20")
        }
    }
}