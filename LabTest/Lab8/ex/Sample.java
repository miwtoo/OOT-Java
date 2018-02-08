/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.lab8.ex;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        
            
            
            do{
                str = checkColon(sc);
                if(str.compareTo("B:Y:E") == 0)
                    break;
                last(str);
                decode(str);
                //showVar(str);
            }while(str.compareTo("B:Y:E") != 0);
            
    }
   
    public static String checkColon(Scanner sc){
        int count = 0;
        String str;
        do{
            count =0;
            System.out.print("Radio tapped text :");
            str = sc.next();
            
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == ':')
                    count++;
            }
            if(count < 2)
                System.out.println("Don't care!");
        }while(count <= 1 );
        
        return str;
    }
    
    public static void last(String str){
        System.out.println("Last character "+str.charAt(str.length()-1));
    }
    
    public static void decode(String str){
        String n = "";
        
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'D')
                n = n + "B";
            else if(str.charAt(i) == 'b')
                n = n + "n";
            else if(str.charAt(i) == 'e')
                n = n + "a";
            else
                n = n + str.charAt(i);
        }
        System.out.println("Decoded : "+n);
    }
    
    
}
