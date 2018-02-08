
package oot.lab8.test1;

import java.util.Scanner;

public class Lab8No1 {
    public static void main(String[] args) {
        Account acc1 = new Account("somSak","a1spd2xdd");
        acc1.validateAll();
        
        Account acc2 = new Account("Yamaha","asddd111110");
        acc2.validateAll();
        
        Account acc3 = new Account("yamaha","asddd111110");
        acc3.validateAll();
    }
}
