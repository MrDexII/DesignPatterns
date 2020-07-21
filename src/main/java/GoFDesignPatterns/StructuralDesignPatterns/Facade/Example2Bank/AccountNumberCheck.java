package GoFDesignPatterns.StructuralDesignPatterns.Facade.Example2Bank;

public class AccountNumberCheck {
    private int accountNumber = 12345678;

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean accountActive(int acctNumToCheck) {
        return acctNumToCheck == getAccountNumber();
        /*if (acctNumToCheck == getAccountNumber()) {
            return true;
        } else {
            return false;
        }*/
    }
}
