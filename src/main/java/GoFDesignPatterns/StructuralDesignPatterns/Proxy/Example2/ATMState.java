package GoFDesignPatterns.StructuralDesignPatterns.Proxy.Example2;

public interface ATMState {

    void insertCard();

    void ejectCard();

    void requestCash(int cashToWithdraw);

    void insertPin(int pinEntered);
}
