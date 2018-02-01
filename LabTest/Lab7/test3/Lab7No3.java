
package oot.lab7.test3;

import java.util.Scanner;
public class Lab7No3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        do {
            
            System.out.print("Enter number with operator : ");// input only 0-9
            String calText = scanner.nextLine();
            String operator = calText.substring(2, calText.length()-2);
           
            
            double firstOperand = calText.charAt(0) - '0';
            double secondOperand = calText.charAt(calText.length()-1) - '0';
            Calculator c = new Calculator(firstOperand, secondOperand);
            switch(operator){
                case "ADD" : 
                    c.add();
                    c.compare();
                    break;
                case "MINUS" : 
                    c.minus();
                    c.compare();
                    break;
            }

        } while (true);
        
        
    }
}
