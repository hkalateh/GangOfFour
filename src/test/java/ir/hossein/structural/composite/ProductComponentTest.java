package ir.hossein.structural.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductComponentTest {

    @Test
    void testCompositeDesignPattern(){
        ProductComponent mainPackage = new Product("Main Package",0.2);
        ProductComponent phone = new SingleProduct("smart phone", 300);
        ProductComponent TV = new SingleProduct("xperia television", 600);
        mainPackage.add(phone);
        mainPackage.add(TV);

        ProductComponent game = new Product("game Pack", 0.1);
        ProductComponent ps5 = new SingleProduct("playstation 5", 650);
        ProductComponent xbox = new SingleProduct("xbox",700);
        game.add(ps5);
        game.add(xbox);
        mainPackage.add(game);

        ProductComponent trip = new Product("trip",0.1);
        ProductComponent shoes = new SingleProduct("Mountain shoes", 150);
        ProductComponent backpack = new SingleProduct("backpack",50);
        trip.add(shoes);
        trip.add(backpack);
        mainPackage.add(trip);

        mainPackage.print();
        System.out.println(mainPackage.getName() + " has price : " + mainPackage.getPrice());
    }

}