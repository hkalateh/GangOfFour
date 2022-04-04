package ir.hossein.structural.composite;

public class SingleProduct extends ProductComponent {

    private final String name;
    private double price;

    public SingleProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println("Product name: "+name+" Price: "+price);
    }
}
