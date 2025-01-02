package org.example;

public class SavingsAccount extends Account{

    private int daysAfterLastWithdraw;

    public SavingsAccount(String name, long number, double balance) {
        super(name, number, balance);
    }

    public int getDaysAfterLastWithdraw(){
        return this.daysAfterLastWithdraw;
    }

    public void setDaysAfterLastWithdraw(int days){
        this.daysAfterLastWithdraw = days;
    }
}
