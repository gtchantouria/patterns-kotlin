package observerPatternSupport

import java.util.*

class WeatherData : Observable(){

    private var temp: Float = 0.0F
    private var humidity: Float = 0.0F
    private var pressure: Float = 0.0F

    fun measurementsChanged() {
        setChanged()
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temp = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }

    fun getPressure() = this.pressure

    fun getHumidity() = this.humidity

    fun getTemp() = this.temp
}