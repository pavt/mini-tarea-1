package banktest;

public class Bank {

    private Account[] accounts = new Account[]{};

    /*
    Cuando se hace el primer deposito, se debe crear la cuenta
     */
    public Bank() {

    }

    public boolean hasAccount(String accountOwnerName) {
        for (Account account : accounts) {
            if (account.getName().equals(accountOwnerName)) {
                return true;
            }
        }
        return false;
    }

    public void deposite(String accountOwnerName, int anAmmount) {
        accounts = new Account[]{new Account(accountOwnerName)};
        int numberOfTransactions;
        for (Account account : accounts) {
            if (account.getName().equals(accountOwnerName)) {
                account.setAmmount(anAmmount + account.getAmmount());
                numberOfTransactions =+ 1;
                account.setNumberOfTransactions(numberOfTransactions);
            }
        }
    }

    public int balance(String accountOwnerName) {
        int balance = 0;
        for (Account account : accounts) {
            if (account.getName().equals(accountOwnerName)) {
                balance = account.getAmmount();
            }
        }
        return balance;
    }

    public int numberOfTransactions(String accountOwnerName) {
        int numberOfTransactions = 0;
        for (Account account : accounts) {
            if (account.getName().equals(accountOwnerName)) {
                numberOfTransactions = account.getNumberOfTransactions();

            }
        }
        return numberOfTransactions;
    }
}
