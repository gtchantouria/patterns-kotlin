package myObserverPattern

class WeatherData : Subject {

    var observers = arrayListOf<Observer>()
    var temp: Float = 0.0F
    var humidity: Float = 0.0F
    var pressure: Float = 0.0F

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        if (observers.remove(o)) {
            observers.remove(o)
        }
    }

    override fun notifyObservers() {
        for (obs in observers) {
            obs.update(temp, humidity, pressure)
        }
    }

    fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temp = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}