/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.trim;

/**
 *
 * @author All User
 */
public class Sample {
    public static void main(String[] args) {
        String s = "   hello   ";

        System.out.println(s + " has " + s.length() + " characters");
        
        s = trim(s);
        //s = s.trim(); // ของจาวา

        System.out.println(s + " has " + s.length() + " characters");
    }
    
    public static String trim(String str) {
        String t = "";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != ' ')
                t += ch;
        }
        return t;
    }
}
