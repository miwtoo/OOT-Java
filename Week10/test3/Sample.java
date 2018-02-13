/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;

/**
 *
 * @author All User
 */

import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b;
        
        System.out.print("Enter b :");
        b = sc.nextInt();
        System.out.println(100/b); // ArithmeticException: / by zero // ถ้าใส่ 0
        System.out.println("bye");
    }
}
