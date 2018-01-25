
package oot.lab6.no1;

public class Lab6No1 {
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount("001","KTB","Somsak",10000);
        acc1.printBalance();
        SavingAccount acc2 = new SavingAccount("002","SCB","Yupin",15000.50);
        acc2.printBalance();
        CurrentAccount acc3 = new CurrentAccount("003","KTB","Suchart",999);
        acc3.printBalance();
        
    }
}
