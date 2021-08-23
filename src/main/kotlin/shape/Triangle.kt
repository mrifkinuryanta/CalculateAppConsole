package shape

class Triangle(private val base: Int, private val height: Int, private val hypotenuse: Int) : Shape() {
    init {
        shapeName = "Triangle"
    }

    override fun calculateArea(): Double {
        return 0.5 * base * height
    }

    override fun calculateCircular(): Double {
        return (base + height + hypotenuse).toDouble()
    }
}