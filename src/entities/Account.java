package entities;

public class Account {

    private int number;
    private String name;
    private double balance;

    public Account() {

    }

    public Account(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Account(int number, String name, double initialDeposit) {
        this.number = number;
        this.name = name;
        depositCash(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void depositCash(double amount) {
        this.balance += amount;

    }
    public void withdrawCash(double amount) {
        this.balance -= amount + 5.0;
    }
    public String toString() {
        return "Account number: "
                + number
                + ", Holder name: "
                + name
                + ", $ "
                + String.format("%.2f", balance);
    }
}
