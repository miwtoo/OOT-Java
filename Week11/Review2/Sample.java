
package Review2;


public class Sample {
    public static void main(String[] args) {
        int[] a = {123, 4884, 59124, 338, 9909, 13, 3003};
        
        for (int i = 0; i < a.length; i++) {
            try{
                check(a[i]);
                System.out.println(a[i]);
                
                
            }
            catch(ZeroException e){
                System.out.println(e.getMessage());
            }
            catch(PalindromeException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void check(int n) throws PalindromeException, ZeroException{
        if(hasZero(n))
            throw new ZeroException("ZeroException : " + n);
        
        if(isPalindrome(n))
            throw new PalindromeException("PalindromeException : " + n);
    }
    
    public static boolean hasZero(int n){
        int d;
        while(n > 0){
            d = n % 10;
            if(d == 0){
                return true;
            }
            n /= 10;
        }
        return false;
    }
    
    public static boolean isPalindrome(int n){
        int rev = 0, temp = n;
        while(n > 0){
            rev = rev*10 + n%10;
            n /= 10;
        }
        return rev == temp;
    }
    
    
}
