package GoFDesignPatterns.BehavioralDesignPatterns.Template.Example1BuildingHouses;

public abstract class HouseTemplate {

    //template method, final so subclasses can't override
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }

    //default implementation
    private void buildWindows(){
        System.out.println("Building Glass Windows");
    }

    //method to be implemented by subclasses
    public abstract void buildWalls();
    public abstract void buildPillars();

    private void buildFoundation(){
        System.out.println("Build foundation with cement, iron rods and sand");
    }
}
