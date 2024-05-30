package hus.oop.lab4.thecustomerandaccountclasses;

public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }

    public int getID() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return customer.getName() + "(" + customer.getID() + ") balance=$" + String.format("%.2f", (Math.round(balance*100)/100.0));
    }

    public Account deposit(double amount) {
        this.balance = balance + amount;
        return new Account(id, customer, this.balance);
    }

    public Account withdraw(double amount) {
        if (amount <= balance) {
            this.balance = balance - amount;
        } else {
            System.out.println("amount withdraw exceeds the current balance!");
        }
        return new Account(id, customer, this.balance);
    }
}
