package shape

import kotlin.math.pow

class Circle(private val radius: Int) : Shape() {
    init {
        shapeName = "Circle"
    }

    override fun calculateArea(): Double {
        return Math.PI * radius.toDouble().pow(2)
    }

    override fun calculateCircular(): Double {
        return Math.PI * (radius * 2)
    }

}