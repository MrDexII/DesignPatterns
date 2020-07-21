package GoFDesignPatterns.CreationalDesignPatterns.builder.two;

public class TestRobotBuilder {

    public static void main(String[] args){
        RobotBuilder oldStyleRobot = new OldRobotBuilder();

        RobotDirector robotDirector = new RobotDirector(oldStyleRobot);

        robotDirector.makeRobot();

        Robot firstRobot = robotDirector.getRobot();

        System.out.println("Robot Build");

        System.out.println("Robot Head Type: " + firstRobot.getRobotHead());
        System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());
        System.out.println("Robot Arms Type: " + firstRobot.getRobotArms());
        System.out.println("Robot Legs Type: " + firstRobot.getRobotLegs());

    }
}
