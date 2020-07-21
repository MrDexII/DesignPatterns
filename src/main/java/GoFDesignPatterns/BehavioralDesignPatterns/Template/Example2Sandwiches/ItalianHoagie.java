package GoFDesignPatterns.BehavioralDesignPatterns.Template.Example2Sandwiches;

public class ItalianHoagie extends Hoagie {

    String[] meatUsed = {"Salami", "Pepperoni", "Capicola Ham"};
    String[] cheeseUsed = {"Provolone"};
    String[] veggiesUsed = {"Lettuce, Tomatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = {"Oil", "Vinegar"};

    @Override
    void addMeat() {
        System.out.println("Adding the Meat: ");
        for (String meat : meatUsed) System.out.print(meat + " ");
    }

    @Override
    void addCheese() {
        System.out.println("Adding the Cheese: ");
        for (String cheese : cheeseUsed) System.out.print(cheese + " ");
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
