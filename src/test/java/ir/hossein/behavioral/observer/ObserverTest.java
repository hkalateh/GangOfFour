package ir.hossein.behavioral.observer;

import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    void test() throws InterruptedException {
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
