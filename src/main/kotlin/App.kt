import utils.CalculateAreaUtils

class App {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App().start()
        }
    }

    fun start() {
        printHeader()
        readLine()?.let {
            openMenu(it)
        }
    }

    private fun printHeader() {
        println(
            """
            ======================================
            Console app for Calculating Area in 2D
            ======================================
            1. Calculate Rectangle
            2. Calculate Circle
            3. Calculate Triangle Area
            ======================================
            Enter menu ? (1/2/3)
            ======================================
        """.trimIndent()
        )
    }

    private fun openMenu(menu: String) {
        when (menu) {
            "1" -> {
                openMenuRectangle()
            }
            "2" -> {
                openMenuCircle()
            }
            "3" -> {
                openMenuTriangle()
            }
            else -> {
                println("No menu matches")
                start()
            }
        }
    }

    private fun openMenuRectangle() {
        print("Enter Length = ")
        val length = readLine()?.toInt() ?: 0
        print("Enter Width = ")
        val width = readLine()?.toInt() ?: 0
        println("Area of Rectangle is = ${CalculateAreaUtils.calculateAreaRectangle(length, width)}")
    }

    private fun openMenuCircle() {
        print("Enter Radius = ")
        val radius = readLine()?.toInt() ?: 0
        println("Area of Circle is = ${CalculateAreaUtils.calculateAreaCircle(radius)}")
    }

    private fun openMenuTriangle() {
        print("Enter Base = ")
        val base = readLine()?.toInt() ?: 0
        print("Enter Height = ")
        val height = readLine()?.toInt() ?: 0
        println("Area of Triangle is = ${CalculateAreaUtils.calculateAreaTriangle(base, height)}")
    }
}