package oot.sumString;

import java.util.regex.Pattern;

public class Sample {
    public static void main(String[] args) {
        String s = "123:45:2";
        int[] t;
        
         t = extract(s);
         sumNumber(t);
    }
    
    public static int[] extract(String str) {
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ':')
                count++;
        }
        
        int[] a = new int[count+1];
        
        int ind = 0;
        String s = "";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ':'){
                int num = Integer.valueOf(s);
                s = "";
                a[ind++] = num;
            }
            else
                s += ch;
        }
        int num = Integer.valueOf(s);
        s = "";
        a[ind++] = num;
        
        return a;
   
        
    }
    
    public static void sumNumber(int[] x) {
        int sum = 0;
        
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        
        System.out.println(sum);
    }
    
     public static int[] extractEasy(String str) {
         String[] s;
         //s = str.split(Pattern.quote("+"));
         s = str.split(":");
         int[] a = new int[s.length];
         
         for (int i = 0; i < s.length; i++) {
             a[i] = Integer.valueOf(s[i]);
         }
         
         return a;
     }
}
