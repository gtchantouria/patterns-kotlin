package myObserverPattern

interface Observer {
    fun update(temp: Float, humidity: Float, pressure: Float)
}