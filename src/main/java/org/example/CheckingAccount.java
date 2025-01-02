package org.example;

public class CheckingAccount extends Account{

    private double tax;

    public CheckingAccount(String name, long number, double balance) {
        super(name, number, balance);
    }

    public double getTax(){
        return this.tax;
    }

    public void setTax(double tax){
        this.tax = tax;
    }
}
