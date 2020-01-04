package decoratorPattern

class Decaf() : Beverage() {
    init {
        description = "Decaf"
    }

    override fun cost() = 1.05
}
