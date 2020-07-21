package GoFDesignPatterns.StructuralDesignPatterns.Bridge;

public class RedColor implements Color {

    @Override
    public void applyColor() {
        System.out.println(" red.");
    }
}
