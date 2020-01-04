package decoratorPattern

class Soy(internal var beverage: Beverage) : CondimentDecorator() {

    override var description = beverage.description + ", Soy"

    override fun cost(): Double {
        return .15 + beverage.cost()
    }
}