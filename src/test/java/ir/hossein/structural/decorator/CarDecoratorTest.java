package ir.hossein.structural.decorator;

import ir.hossein.structural.decorator.decorator.Benz;
import ir.hossein.structural.decorator.decorator.Car;
import ir.hossein.structural.decorator.decorator.SpecialEdition;
import ir.hossein.structural.decorator.decorator.SportRing;
import org.junit.jupiter.api.Test;

class CarDecoratorTest {

    @Test
    void testDecorator() {
        Car benz = new Benz();
        System.out.println(benz.name + " with this options : '" + benz.getOptions() + "' has this price : " + benz.getPrice());

        benz = new SpecialEdition(benz);
        benz = new SportRing(benz);
        System.out.println(benz.name + " with this options : '" + benz.getOptions() + "' has this price : " + benz.getPrice());
    }
}