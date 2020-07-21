package GoFDesignPatterns.StructuralDesignPatterns.Bridge;

public abstract class Shape {
    //Composition - implementor
    protected Color color;

    //constructor with implementation as input argument
    public Shape(Color c) {
        this.color = c;
    }

    abstract public void applyColor();
}
