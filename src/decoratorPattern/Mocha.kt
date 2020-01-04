package decoratorPattern

class Mocha(internal var beverage: Beverage) : CondimentDecorator() {
    override var description = beverage.description + ", Mocha"

    override fun cost(): Double {
        return .20 + beverage.cost()
    }
}