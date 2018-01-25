
package oot.lab6.no2;


public class BankAccount {
    private String accountnNumber;
    private String bank;
    private String ower;
    protected double balance;
    
    
    public BankAccount (String accountnNumber, String bank , String ower, double balance){
        this.accountnNumber = accountnNumber;
        this.bank = bank;
        this.ower = ower;
        this.balance = balance;
    }
    
    public void printBalance(){
        System.out.println("[print]your balance is " + balance);
    }
}
