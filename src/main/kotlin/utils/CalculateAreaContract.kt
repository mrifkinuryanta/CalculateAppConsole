package utils

@Deprecated("Change implementation to Shape Class")
interface CalculateAreaContract {
    fun calculateAreaRectangle(length: Int, width: Int): Int
    fun calculateAreaCircle(radius: Int): Double
    fun calculateAreaTriangle(base: Int, height: Int): Double
}