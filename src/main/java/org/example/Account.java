package org.example;

public abstract class Account {

    private String name;

    private long number;

    private double balance;

    public Account(String name, long number, double balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public String getName(){
        return this.name;
    }

    public long getNumber() {
        return this.number;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNumber(long number){
        this.number = number;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void Deposit(double value){
        this.balance = this.balance + value;
    }

    public void Withdraw(double value){
        this.balance = this.balance - value;
    }

    public void showInfo(){
        System.out.println("Account Info\nName: " + name + ", Account Number: " + number + ", Balance: " +balance);
    }
}
