import shape.Circle
import shape.Rectangle
import shape.Shape
import shape.Triangle
import utils.StarGeneratorUtils

class App {
    private var starGeneratorUtils = StarGeneratorUtils()

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
            4. Print Stars
            ======================================
            Enter menu ? (1/2/3/4)
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
            "4" -> {
                openMenuPrintStars()
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
        printShape(Rectangle(length, width))
    }

    private fun openMenuCircle() {
        print("Enter Radius = ")
        val radius = readLine()?.toInt() ?: 0
        printShape(Circle(radius))
    }

    private fun openMenuTriangle() {
        print("Enter Base = ")
        val base = readLine()?.toInt() ?: 0
        print("Enter Height = ")
        val height = readLine()?.toInt() ?: 0
        print("Enter Hypotenuse = ")
        val hypotenuse = readLine()?.toInt() ?: 0
        printShape(Triangle(base, height, hypotenuse))
    }

    private fun openMenuPrintStars() {
        println("Enter Total Star (Max star = 20) = ")
        val totalStar = readLine()?.toInt() ?: 0
        starGeneratorUtils.printStar(totalStar)
    }

    private fun printShape(shape: Shape) {
        shape.printShapeName()
        shape.calculateAreaAndCircular()
    }
}