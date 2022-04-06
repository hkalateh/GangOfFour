package ir.hossein.structural.decorator.decorator;

public class SportRing extends CarDecorator {
    Car car;

    public SportRing(Car car) {
        this.car = car;
    }

    @Override
    public double getPrice() {
        return car.getPrice()+1000;
    }

    @Override
    public String getOptions() {
        return car.getOptions() + ", has sport ring";
    }
}
