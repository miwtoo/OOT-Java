
package oot.lab6.no2;

public class Lab6No2 {
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount("001","KTB","Somsak",10000);
        acc1.printBalance();
        SavingAccount acc2 = new SavingAccount("002","SCB","Yupin",15000.50);
        acc2.printBalance();
        CurrentAccount acc3 = new CurrentAccount("003","KTB","Suchart",999);
        acc3.printBalance();
        
        getTransactionFee(acc1);
        getTransactionFee(acc2);
        getTransactionFee(acc3);        
    }
    
    public static void getTransactionFee(BankAccount acc){
        double fee = 0.0;
        if(acc.balance < 10000)
            fee = acc.balance * 0.01;
        else
            fee = 10.0;
        
        System.out.println("Transaction free is : " +fee);
    }
}
