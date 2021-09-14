package banktest;

public class Account {
    private String name;
    private int ammount;
    private int numberOfTransactions;

    public Account(String aName){
        this.name = aName;
    }

    public Account(String aName, int anAmmount){
        this.name = aName;
        this.ammount = anAmmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(int numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }
}
