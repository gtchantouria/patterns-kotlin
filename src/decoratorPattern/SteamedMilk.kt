package decoratorPattern

class SteamedMilk(private var beverage: Beverage) : CondimentDecorator() {
    override var description = beverage.description + ", Milk"

    override fun cost() = beverage.cost() + .10
}