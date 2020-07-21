package GoFDesignPatterns.BehavioralDesignPatterns.Interpreter.Example1BinHex;

public class IntToHexExpression implements Expression {

    private int i;

    public IntToHexExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getHexadecimalFormat(i);
    }
}
