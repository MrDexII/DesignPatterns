package GoFDesignPatterns.StructuralDesignPatterns.Proxy.Example2;

public class HasPin implements ATMState {

    ATMMachine atmMachine;

    public HasPin(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You already entered a card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Your card is ejected");
        atmMachine.setAtmState(atmMachine.getNoCardState());
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        if (cashToWithdraw > atmMachine.cashInMachine) {
            System.out.println("You don't have that much cash available");
            System.out.println("Your card is ejected");
            atmMachine.setAtmState(atmMachine.getNoCardState());
        } else {
            System.out.println(cashToWithdraw + " is provided by the machine");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);

            System.out.println("Your card is ejected");
            atmMachine.setAtmState(atmMachine.getNoCardState());

            if (atmMachine.cashInMachine <= 0) {
                atmMachine.setAtmState(atmMachine.getNoCashState());
            }
        }
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("You already entered a PIN");
    }
}
