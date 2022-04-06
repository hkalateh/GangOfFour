package ir.hossein.structural.decorator.decorator;

import ir.hossein.structural.decorator.decorator.Car;

public class Benz extends Car {
    public Benz() {
        this.name = "Benz";
    }

    @Override
    public double getPrice() {
        return 30000;
    }
}
