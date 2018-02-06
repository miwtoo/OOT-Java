/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.find.fristAndLast;

/**
 *
 * @author All User
 */
public class Sample {
    public static void main(String[] args) {
        String s = "headmastererer";

        System.out.println(findFirst(s,'e'));
        System.out.println(s.indexOf('e')); // ของจาวา
        System.out.println(findFirst(s,'z'));
        System.out.println(s.indexOf('z')); // ของจาวา
        
        System.out.println(findLast(s,'e'));
        System.out.println(s.lastIndexOf('e'));
    }
    
    public static int findFirst(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == ch)
                return i; // return แล้วจบลูปเลย
        }
        return -1;
    }
    
    public static int findLast(String str, char ch) {
        for (int i = str.length()-1 ; i > 0 ; i--) {
            char c = str.charAt(i);
            if(c == ch)
                return i; // return แล้วจบลูปเลย
        }
        return -1;
    }
}
