package decoratorPattern

fun main() {
    val beverage: Beverage = Espresso()
    println("${beverage.description}, $ ${beverage.cost()}")

    var darkRoast: Beverage = DarkRoast()
    darkRoast = Mocha(darkRoast)
    darkRoast = Mocha(darkRoast)
    darkRoast = Whip(darkRoast)

    println("${darkRoast.description}, $ ${darkRoast.cost()}")

    var houseBlend: Beverage = HouseBlend()
    houseBlend = Soy(houseBlend)
    houseBlend = Mocha(houseBlend)
    houseBlend = Whip(houseBlend)
    println("${houseBlend.description}, $ ${houseBlend.cost()}")
}