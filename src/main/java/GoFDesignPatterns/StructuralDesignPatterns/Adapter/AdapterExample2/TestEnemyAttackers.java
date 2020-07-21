package GoFDesignPatterns.StructuralDesignPatterns.Adapter.AdapterExample2;

public class TestEnemyAttackers {

    public static void main (String[] args){
        EnemyTank rx7Tank = new EnemyTank();
        EnemyRobot fredTheRobot = new EnemyRobot();
        EnemyRobotAdapter robotAdapter = new EnemyRobotAdapter(fredTheRobot);

        System.out.println("The Robot");

        fredTheRobot.reactToHuman("Paul");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHand();

        System.out.println("The Enemy Tank");
        rx7Tank.assignDriver("Frank");
        rx7Tank.driveForward();
        rx7Tank.fireWeapon();

        System.out.println("The Robot with Adapter");
        robotAdapter.assignDriver("Andrew");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}
