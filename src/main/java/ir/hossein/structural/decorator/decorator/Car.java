package ir.hossein.structural.decorator.decorator;

public abstract class Car {
    public String name;
    public String option = "";

    public String getOptions() {
        return option;
    }

    public abstract double getPrice();
}
