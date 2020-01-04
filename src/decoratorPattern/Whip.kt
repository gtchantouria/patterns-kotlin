package decoratorPattern


class Whip(internal var beverage: Beverage) : CondimentDecorator() {

    override var description = beverage.description + ", Whip"

    override fun cost(): Double {
        return .10 + beverage.cost()
    }
}
