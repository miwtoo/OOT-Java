package oot.StringToDigit;



public class Sample {
    public static void main(String[] args) {
        String s = "He35#lloxyZ";
        
        printDigit(s);
    }
    
    public static void printDigit(String s){
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //if(ch >= '0' && ch <= '9') แบบเต็ม
            if(Character.isDigit(ch))
                t += ch;
        }
        int num = Integer.valueOf(t);
        System.out.println(num + " + " + 1 + " = " + (num+1));
    }
    
}
