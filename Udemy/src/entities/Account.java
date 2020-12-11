package entities;

public class Account {
// Não foi eu que fiz, só algumas partes
    private int count;
    private String owner;
    private double balance;

    public Account(int count, String owner) {
        this.count = count;
        this.owner = owner;
    }

    public Account(int count, String owner, double inicialDeposit) {
        this.count = count;
        this.owner = owner;
        deposit(inicialDeposit);
    }

    public int getCount() {
        return this.count;
    }

    public void setOwner( String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return this.owner;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit( double amount ) {
        balance += amount;
    }

    public void withdraw( double amount ) {
        balance -= amount + 5.0;
    }

    public String toString() {
        return "Account " +
                count + ", " +
                "Holder: " +
                owner + ", " +
                "Balance: $" + String.format("%.2f", balance);
    }
}
