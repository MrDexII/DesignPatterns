package GoFDesignPatterns.BehavioralDesignPatterns.Template.Example2Sandwiches;

public abstract class Hoagie {

    boolean afterFirstCondiment = false;

    final void makeSandwich() {

        cutBun();
        if (customerWatMeat()) {
            addMeat();
            afterFirstCondiment = true;
        }
        if (customerWatCheese()) {
            if (afterFirstCondiment) System.out.println();
            addCheese();
            afterFirstCondiment = true;
        }
        if (customerWatVegetables()) {
            if (afterFirstCondiment) System.out.println();
            addVegetables();
            afterFirstCondiment = true;
        }
        if (customerWatCondiments()) {
            if (afterFirstCondiment) System.out.println();
            addCondiments();
            afterFirstCondiment = true;
        }

        wrapTheHoagie();
    }

    public void cutBun() {
        System.out.println("The Hoagie is Cut");
    }

    abstract void addMeat();

    abstract void addCheese();

    abstract void addVegetables();

    abstract void addCondiments();

    boolean customerWatMeat() {
        return true;
    }

    boolean customerWatCheese() {
        return true;
    }

    boolean customerWatVegetables() {
        return true;
    }

    boolean customerWatCondiments() {
        return true;
    }

    public void wrapTheHoagie() {
        System.out.println("\nWrap the Hoagie");
    }
}
