
package oot.lab6.no1;


public class CurrentAccount extends BankAccount{
    public CurrentAccount (String accountnNumber, String bank , String ower, double balance){
        super( accountnNumber,  bank ,  ower,  balance);
    }
    
    public void printBalance(){
        System.out.println("[override]your balance is " + balance + " but it reserved for cheque");
    }
}
