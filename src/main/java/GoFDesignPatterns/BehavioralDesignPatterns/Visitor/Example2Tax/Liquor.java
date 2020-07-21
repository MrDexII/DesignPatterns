package GoFDesignPatterns.BehavioralDesignPatterns.Visitor.Example2Tax;

public class Liquor implements Visitable {

    private double price;

    public Liquor(double price) {
        this.price = price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }
}
