package ir.hossein.behavioral.observer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WeatherStation station = new WeatherStation();
        Monitor monitor1 = new Monitor(station);
        PhoneDisplay phone1 = new PhoneDisplay(station);
        PhoneDisplay phone2 = new PhoneDisplay(station);
        //add subscribers
        station.add(monitor1);
        station.add(phone1);
        station.add(phone2);
        //call notify method
        for (int i = 0; i < 5; i++) {
            station.setTemperature(i+20);
            Thread.sleep(3000);
            station.notification();
        }
    }
}
