package shape

abstract class Shape {
    var shapeName: String? = null

    fun printShapeName() {
        println("This is a $shapeName")
    }

    fun calculateAreaAndCircular() {
        println("Area in $shapeName = ${calculateArea()}")
        println("Circular in $shapeName = ${calculateCircular()}")
    }

    abstract fun calculateArea(): Double
    abstract fun calculateCircular(): Double
}