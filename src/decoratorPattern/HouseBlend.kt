package decoratorPattern

class HouseBlend: Beverage() {

    init {
        this.description = "House Blend"
    }

    override fun cost() = .89
}