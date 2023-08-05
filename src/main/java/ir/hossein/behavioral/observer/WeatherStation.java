package ir.hossein.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {
    List<Observer> observerList = new ArrayList<>();
    int temp;

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notification() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    public int getTemperature() {
        return temp;
    }

    public void setTemperature(int temp) {
        this.temp = temp;
    }
}
