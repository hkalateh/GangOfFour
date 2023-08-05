package ir.hossein.behavioral.observer;

public interface Observable {
    void add(Observer observer);

    void remove(Observer observer);

    //notify
    void notification();
}
