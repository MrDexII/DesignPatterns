package GoFDesignPatterns.CreationalDesignPatterns.builder.two;

public interface RobotBuilder {
    void buildRobotHead();
    void buildRobotTorso();
    void buildRobotArms();
    void buildRobotLegs();
    Robot getRobot();
}
