package ir.hossein.structural.decorator.decorator;

import ir.hossein.structural.decorator.decorator.Car;

public class BMW extends Car {
    public BMW() {
        this.name = "BMW";
    }

    @Override
    public double getPrice() {
        return 32000;
    }
}
