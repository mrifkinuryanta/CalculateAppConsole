package shape

class Rectangle(private val length: Int, private val width: Int): Shape() {
    init {
        shapeName = "Rectangle"
    }

    override fun calculateArea(): Double {
        return (length * width).toDouble()
    }

    override fun calculateCircular(): Double {
        return (2 * (length + width)).toDouble()
    }
}