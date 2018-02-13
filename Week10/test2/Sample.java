/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author All User
 */
public class Sample {
    public static void main(String[] args) {
        String s = "hello";
        
        System.out.println(s + " has " + s.length() + " characters");
        System.out.print("next character after o is");
        System.out.println(s.charAt(s.indexOf('o')+1));
    }
}
