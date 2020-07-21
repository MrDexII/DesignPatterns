package GoFDesignPatterns.StructuralDesignPatterns.Facade.Example2Bank;

public class FundsCheck {
    private double cashInAccount = 1000.00;

    public double getCashInAccount() {
        return cashInAccount;
    }

    public void decreaseCashInAccount(double cashWithdraw) {
        cashInAccount -= cashWithdraw;
    }

    public void increaseCashInAccount(double cashDeposited) {
        cashInAccount += cashDeposited;
    }

    public boolean haveEnoughMoney(double cashToWithdraw) {
        if (cashToWithdraw > getCashInAccount()) {

            System.out.println("Error: You don't have enough money");
            System.out.println("Current Balance: " + getCashInAccount());

            return false;
        } else {
            decreaseCashInAccount(cashToWithdraw);
            System.out.println("Withdraw Completed: Current Balance is " + getCashInAccount());

            return true;
        }
    }

    public void makeDeposit(double cashToDeposit) {
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit Complete: Current Balance is " + getCashInAccount());
    }

}
