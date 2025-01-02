package org.example;

public class SavingsAccount extends Account{

    private int daysAfterLastWithdraw;

    private int availableWithdraws;

    public SavingsAccount(String name, long number, double balance) {
        super(name, number, balance);
    }

    public int getDaysAfterLastWithdraw(){
        return this.daysAfterLastWithdraw;
    }

    public void setDaysAfterLastWithdraw(int days){
        this.daysAfterLastWithdraw = days;
    }

    public int getAvailableWithdraws(){
        return this.availableWithdraws;
    }

    public void setAvailableWithdraws(int withdraws){
        this.availableWithdraws = this.availableWithdraws + withdraws;
    }

    public void useWithdraw(){
        this.availableWithdraws = this.availableWithdraws - 1;
    }

    @Override
    public void showInfo(){
        System.out.println("Account Info\nName: " + this.getName() + ", Account Number: " + this.getNumber() + ", " +
                "Balance: " +this.getBalance() + ", Available Withdraws: " + this.getAvailableWithdraws());
    }

    @Override
    public void Withdraw(double value){
        if(this.availableWithdraws > 0){
            this.useWithdraw();
            this.setBalance(this.getBalance() - value);
            this.showInfo();
        }
        else{
            System.out.println("You don't have available withdraws!");
        }
    }
}
