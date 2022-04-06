package ir.hossein.structural.decorator.decorator;

public class SpecialEdition extends CarDecorator {
    Car car;

    public SpecialEdition(Car car) {
        this.car = car;
    }

    @Override
    public double getPrice() {
        return car.getPrice()+6000;
    }

    @Override
    public String getOptions() {
        return car.getOptions() + ", it's special edition";
    }
}
