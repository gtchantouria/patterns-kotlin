package observerPatternSupport

import java.util.*
import java.util.Observer

class ForecastDisplay(observable: Observable) : Observer, DisplayElement {
    private var currentPressure = 29.92f

    private var lastPressure: Float = 0.0f

    init {
        observable.addObserver(this)
    }

    override fun update(o: Observable?, arg: Any?) {
        if (o is WeatherData) {
            lastPressure = currentPressure
            currentPressure = o.getPressure()

            display()
        }
    }

    override fun display() {
        print("Forecast: ")

        when {
            currentPressure > lastPressure -> println("Improving weather on the way!")
            currentPressure == lastPressure -> println("More of the same")
            currentPressure < lastPressure -> println("Watch out for cooler, rainy weather")
        }
    }
}