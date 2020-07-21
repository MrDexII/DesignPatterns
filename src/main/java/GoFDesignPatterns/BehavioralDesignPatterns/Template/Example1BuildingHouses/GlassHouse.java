package GoFDesignPatterns.BehavioralDesignPatterns.Template.Example1BuildingHouses;

public class GlassHouse extends HouseTemplate {


    @Override
    public void buildWalls() {
        System.out.println("Build Glass Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Build Pillars with glass coating");
    }
}
