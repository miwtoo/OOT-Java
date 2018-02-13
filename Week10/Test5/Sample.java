
package Test5;


public class Sample {
    public static void main(String[] args) {
        String[] s = {"pen:12", "book:100", "15:15", "ruler:10x", "pencil:50"};
        int total = 0;
        for (int i = 0; i < s.length; i++) {
            try{
                check(s[i]);
                String[] t = s[i].split(":");
                System.out.println(t[0] + " " + t[1]);
                total += Integer.valueOf(t[1]);
                
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Total of correct quantity = " + total);
    }
    
    public static void check(String s)throws NameException , QtyException {
        String[]t = s.split(":");
        if(!isRightName(t[0]))
            throw new NameException("ZeroException : " + t[0]);
        if(!isRightQty(t[1]))
            throw new QtyException("QtyException : " + t[1]);
    }
    
    public static boolean isRightName(String name){
        for (int i = 0; i < name.length() ; i++) {
            char ch = name.charAt(i);
            if(ch < 'a' || ch > 'z')
                return false;
        }
        return true;
    }
    
    public static boolean isRightQty(String q){
        int qty;
        
        try{
            qty = Integer.valueOf(q);
        }
        catch(NumberFormatException e){
            return false;
        }
        return true;
    }
    
}
