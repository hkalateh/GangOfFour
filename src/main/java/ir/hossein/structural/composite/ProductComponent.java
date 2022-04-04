package ir.hossein.structural.composite;

public abstract class ProductComponent {

    public double getPrice(){
        throw new UnsupportedOperationException("Can not return any thing");
    }

    public String getName(){
        throw new UnsupportedOperationException("Can not return any thing");
    }

    public void print(){
        throw new UnsupportedOperationException("Can not return any thing");
    }

    public void add(ProductComponent productComponent){
        throw new UnsupportedOperationException("Can not return any thing");
    }

    public void remove(ProductComponent productComponent){
        throw new UnsupportedOperationException("Can not return any thing");
    }
}
