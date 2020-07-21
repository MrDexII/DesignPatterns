package GoFDesignPatterns.StructuralDesignPatterns.Adapter.AdapterExample2;

import java.util.Random;

public class EnemyTank implements EnemyAttacker {

    Random generate = new Random();

    @Override
    public void fireWeapon() {
        int attackDamage = generate.nextInt(10) + 1;

        System.out.println("Enemy Tank Does " + attackDamage + " Damage");
    }

    @Override
    public void driveForward() {
        int movement = generate.nextInt(5) + 1;

        System.out.println("Enemy Tank moves " + movement + " space");

    }

    @Override
    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank");
    }
}
