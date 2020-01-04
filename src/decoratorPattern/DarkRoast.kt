package decoratorPattern

class DarkRoast : Beverage() {
    init {
        description = "Dark Roast"
    }

    override fun cost() = .99
}