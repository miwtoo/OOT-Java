
package oot.test1;


public class Sample {
    public static void main(String[] args) {
        String s = "hEllo";
        
        printString1(s);
        printString2(s);
        printString3(s);
        printString4(s);
        
        
    }
    
    public static boolean isUpper(char ch){
        return ch >= 'A' && ch <= 'Z';
    }
    public static boolean isLower(char ch){
        return ch >= 'a' && ch <= 'z';
    }
    
    public static void printString1(String s){
        System.out.println(s);
    }
    public static void printString2(String s){
        //System.out.println(s.toUpperCase()); แบบง่าย
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(isLower(ch))
                System.out.print((char)(ch-32));
            else
                System.out.print(ch);
        }
        System.out.println();
    }
    public static void printString3(String s){
        //System.out.println(s.toLowerCase()); แบบง่าย
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(isUpper(ch))
                System.out.print((char)(ch+32));
            else
                System.out.print(ch);
        }
        System.out.println();
    }
    public static void printString4(String s){
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(isUpper(ch))
                System.out.print((char)(ch+32));
            else
                System.out.print((char)(ch-32));
        }
        System.out.println();
    }
    
}
