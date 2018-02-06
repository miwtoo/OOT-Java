/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.anagram;

/**
 *
 * @author All User
 */
public class Sample {
    public static void main(String[] args) {
        String s = "triangl";
        String t = "integral";
        
        if(isAnagram(s,t))
            System.out.println("anagram");
        else
            System.out.println("not anagram");
    }
    
    public static boolean isAnagram(String a, String b){
        int[]count = new int[26];
        
        
        if(a.length() != b.length())
            return false;
        
        for (int i = 0; i < a.length(); i++) {
            char c1 = a.charAt(i);
            char c2 = b.charAt(i);
            count[c1-'a']++;
            count[c2-'a']--;
        }
        
        for (int i = 0; i < 26; i++) {
            if(count[i] != 0)
                return false;
        }
        return true;
    }
}
