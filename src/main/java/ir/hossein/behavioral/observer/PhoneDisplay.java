package ir.hossein.behavioral.observer;

public class PhoneDisplay implements Observer {

    WeatherStation station;

    public PhoneDisplay(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        System.out.println("phone : " + station.getTemperature());
    }
}
