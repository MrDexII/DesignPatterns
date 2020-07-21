package GoFDesignPatterns.StructuralDesignPatterns.Proxy.Example2;

public class NoCard implements ATMState {
    ATMMachine atmMachine;

    public NoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Please enter your PIN");
        atmMachine.setAtmState(atmMachine.getYesCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("You didn't enter a card");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("You didn't enter a card");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("You didn't enter a card");
    }
}
