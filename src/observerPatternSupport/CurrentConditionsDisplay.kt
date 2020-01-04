package observerPatternSupport

import java.util.*
import java.util.Observer

class CurrentConditionsDisplay(observable: Observable) : Observer, DisplayElement {

    private var temp: Float = 0.0F
    private var humidity: Float = 0.0F
    private var pressure: Float = 0.0F

    init {
        observable.addObserver(this)
    }

    override fun update(o: Observable?, arg: Any?) {
        if (o is WeatherData) {
            this.temp = o.getTemp()
            this.humidity = o.getHumidity()
            this.pressure = o.getPressure()

            display()
        }
    }

    override fun display() {
        println("Current conditions: temperature $temp F degrees and $humidity % humidity")
    }

}