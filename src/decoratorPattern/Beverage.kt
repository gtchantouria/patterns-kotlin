package decoratorPattern

abstract class Beverage {
    open var description = "Unknown Beverage"

    abstract fun cost(): Double
}