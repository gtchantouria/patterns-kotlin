package observerPatternSupport

import java.util.*
import java.util.Observer

class StatisticsDisplay(observable: Observable) : Observer, DisplayElement {
    private var minTemp: Float = 0.0F
    private var maxTemp: Float = 200F
    private var tempSum: Float = 0.0F
    private var numReadings: Int = 0

    init {
        observable.addObserver(this)
    }

    override fun update(o: Observable?, arg: Any?) {
        if (o is WeatherData) {
            tempSum += o.getTemp()
            numReadings++

            if (o.getTemp() > maxTemp) {
                maxTemp = o.getTemp()
            }

            if (o.getTemp() < minTemp) {
                minTemp = o.getTemp()
            }

            display()
        }
    }

    override fun display() {
        println("Avg/Max/Min temperature = ${(tempSum / numReadings)} / $maxTemp / $minTemp")
    }
}