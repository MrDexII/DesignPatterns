package GoFDesignPatterns.StructuralDesignPatterns.Decorator.Example1Cars;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}
