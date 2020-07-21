package GoFDesignPatterns.BehavioralDesignPatterns.Template.Example2Sandwiches;

public class VeggieHoagie extends Hoagie {

    String[] veggiesUsed = {"Lettuce, Tomatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = {"Oil", "Vinegar"};

    @Override
    boolean customerWatMeat() {
        return false;
    }

    @Override
    boolean customerWatCheese() {
        return false;
    }

    @Override
    void addMeat() {
    }

    @Override
    void addCheese() {
    }

    @Override
    void addVegetables() {
        System.out.println("Adding the Vegetables: ");
        for (String veggies : veggiesUsed) System.out.print(veggies + " ");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding the Condiments: ");
        for (String condi : condimentsUsed) System.out.print(condi + " ");
    }
}
