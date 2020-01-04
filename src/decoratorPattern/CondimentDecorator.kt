package decoratorPattern

abstract class CondimentDecorator : Beverage() {
    abstract override var description: String
}