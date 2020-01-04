package myObserverPattern

class StatisticsDisplay(weatherData: WeatherData) : Observer, DisplayElement {
    private var minTemp: Float = 0.0F
    private var maxTemp: Float = 200F
    private var tempSum: Float = 0.0F
    private var numReadings: Int = 0

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        tempSum += temp
        numReadings++

        if (temp > maxTemp) {
            maxTemp = temp
        }

        if (temp < minTemp) {
            minTemp = temp
        }

        display()
    }

    override fun display() {
        println("Avg/Max/Min temperature = ${(tempSum / numReadings)} / $maxTemp / $minTemp")
    }
}