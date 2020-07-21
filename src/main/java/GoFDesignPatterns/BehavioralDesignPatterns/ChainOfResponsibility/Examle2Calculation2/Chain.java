package GoFDesignPatterns.BehavioralDesignPatterns.ChainOfResponsibility.Examle2Calculation2;

public interface Chain {

    void setNextChain(Chain nextChain);

    void calculate(Numbers request);

}
