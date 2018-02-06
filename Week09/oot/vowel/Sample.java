/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.vowel;

/**
 *
 * @author All User
 */
public class Sample {
    public static void main(String[] args) {
        String s = "hello";
        
        printVowel(s);
    }
    
    public static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
    public static void printVowel(String str){
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(isVowel(ch)){
                System.out.println(ch);
            }
        }
    }
}
