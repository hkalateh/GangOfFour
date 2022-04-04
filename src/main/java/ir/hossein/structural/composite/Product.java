package ir.hossein.structural.composite;

import java.util.ArrayList;

public class Product extends ProductComponent {

    private String name;
    private double packagingPrice;
    private ArrayList<ProductComponent> products = new ArrayList<>();

    public Product(String name, double packagingPrice) {
        this.name = name;
        this.packagingPrice = packagingPrice;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (ProductComponent product: products) {
            totalPrice += product.getPrice();
        }
        totalPrice += packagingPrice;
        return totalPrice;
    }

    @Override
    public void print() {
        products.forEach(ProductComponent::print);
    }

    @Override
    public void add(ProductComponent productComponent) {
        products.add(productComponent);
    }

    @Override
    public void remove(ProductComponent productComponent) {
        products.remove(productComponent);
    }
}
