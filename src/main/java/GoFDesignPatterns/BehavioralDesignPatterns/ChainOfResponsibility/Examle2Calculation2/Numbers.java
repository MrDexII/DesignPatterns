package GoFDesignPatterns.BehavioralDesignPatterns.ChainOfResponsibility.Examle2Calculation2;

public class Numbers {

    private int number1;
    private int number2;

    private String calculatationWanted;

    public Numbers(int number1, int number2, String calculatationWanted) {
        this.number1 = number1;
        this.number2 = number2;
        this.calculatationWanted = calculatationWanted;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public String getCalculatationWanted() {
        return calculatationWanted;
    }
}
