package GoFDesignPatterns.StructuralDesignPatterns.Adapter.AdapterExample2;

public class EnemyRobotAdapter implements EnemyAttacker {

    EnemyRobot theRobot;

    public EnemyRobotAdapter(EnemyRobot theRobot) {
        this.theRobot = theRobot;
    }

    @Override
    public void fireWeapon() {
        theRobot.smashWithHand();
    }

    @Override
    public void driveForward() {
        theRobot.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {
        theRobot.reactToHuman(driverName);
    }
}
