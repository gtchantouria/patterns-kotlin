package myObserverPattern

class CurrentConditionsDisplay(weatherData: WeatherData) : Observer, DisplayElement {
    private var temp: Float = 0.0F
    private var humidity: Float = 0.0F
    private var pressure: Float = 0.0F

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temp = temp
        this.humidity = humidity
        this.pressure = pressure
        display()
    }

    override fun display() {
        println("Current conditions: temperature $temp F degrees and $humidity % humidity")
    }

}