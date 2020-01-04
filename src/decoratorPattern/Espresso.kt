package decoratorPattern

class Espresso : Beverage() {
    init {
        description = "Espresso"
    }

    override fun cost() = 1.99
}