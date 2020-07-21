package GoFDesignPatterns.BehavioralDesignPatterns.ChainOfResponsibility.Examle1ATM502010;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}
