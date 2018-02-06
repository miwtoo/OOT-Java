/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.Equals;

/**
 *
 * @author All User
 */
public class Equals {
    public static void main(String[] args) {
        String s = "hello";
        String t = "hello";
        
        if(isEquals(s,t ))
            System.out.println("equal");
        else
            System.out.println("not equal");
        /////////////////////////////////////////////////
        if(s.equals(t))  // ของจาวา
            System.out.println("equal");
        else
            System.out.println("not equal");
        
        if(s.equalsIgnoreCase(t))  // ของจาวา ไม่สนตัวใหญ่ตัวเล็ก
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
    
    public static boolean isEquals(String a, String b) {
        
        if(a.length() != b.length())
            return false;
        
        for (int i = 0; i < a.length() ; i++) {
            char c1 = a.charAt(i);
            char c2 = b.charAt(i);
            
            if(c1 != c2)
                return false;
        }
        
        return true;
    }
}
