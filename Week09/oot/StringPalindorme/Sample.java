/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.StringPalindorme;

/**
 *
 * @author All User
 */
public class Sample {
    public static void main(String[] args) {
        String s = "bananab";
    
        if(isPalindorme(s)){
            System.out.println("palindrome");
        }
        else
            System.out.println("not palindrome");
    }
    
    public static boolean isPalindorme(String str){
        int left,right;
        left = 0;
        right = str.length()-1;
        
        while(left < right){
            char c1 = str.charAt(left);
            char c2 = str.charAt(right);
            
            if(c1 != c2)
                return false;
            left++;
            right--;
        } 
        
        return true;
    }
    
}
