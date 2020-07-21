package GoFDesignPatterns.StructuralDesignPatterns.Decorator.Example2Pizza;

public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding Sauce");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Tomato Sauce";
    }

    @Override
    public double getCost() {
        return super.getCost() + .35;
    }
}

