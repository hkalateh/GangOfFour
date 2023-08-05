package ir.hossein.behavioral.observer;

public class Monitor implements Observer {
    WeatherStation weatherStation;

    public Monitor(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println("monitor : " + weatherStation.getTemperature());
    }
}
