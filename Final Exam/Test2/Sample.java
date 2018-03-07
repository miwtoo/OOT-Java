package Test2;

public class Sample {
    public static void main(String[] args) {
        String[] s = {"ABC", "DFGHF", "JAV","ACEHI","BFGTF","TOPA"};
       
        for (int i = 0; i < s.length; i++) {
            try{
                check(s[i]);
                System.out.println(s[i]);
            }
            catch(DuplicateException e){
                System.out.println(e.getMessage());
            }
            catch(SortException e){
                System.out.println(e.getMessage());
            }
        }
    }  
    
    public static void check(String s) throws DuplicateException, SortException{
        if(isDuplicate(s)){
            throw new DuplicateException("DuplicateException : " + s);
        }
        
        if(isSort(s)){
            throw new SortException("SortException : " + s);
        }
    }
    
    public static boolean isDuplicate(String s){
        int[] n = new int[25];
        
        for (int i = 0; i < s.length(); i++) {
            n[s.charAt(i) - 'A']++;
        }
        
        for (int i = 0; i < n.length; i++) {
            if(n[i] > 1)
                return true;
        }
        return false;
    }
    
    public static boolean isSort(String s){
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i-1) > s.charAt(i))
                return false;
        }
        return true;
    }
}
