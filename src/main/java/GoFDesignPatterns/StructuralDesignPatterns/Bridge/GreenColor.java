package GoFDesignPatterns.StructuralDesignPatterns.Bridge;

public class GreenColor implements Color{
    @Override
    public void applyColor() {
        System.out.println(" green.");
    }
}
