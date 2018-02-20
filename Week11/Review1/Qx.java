
package Review1;

public class Qx extends Px{
    public Qx(String s){
        super(s);
    }
    
    public void prt(int[] t){
        int first, last, sum;
        System.out.print(getS() + " prints ");
        for (int i = 0; i < t.length; i++) {
            first = firstDigit(t[i]);
            last = lastDigit(t[i]);
            sum = sumDigitExceptFirstLast(t[i]);
            
            if(sumDigitExceptFirstLast(t[i]) == 0)
                System.out.print(first+""+last+ " ");
            else
                System.out.print(first+""+ sum+""+last+ " ");
        }
        System.out.println();
    }
    
    public int lastDigit(int n) {
        return n%10;
    }
    
    public int firstDigit(int n){
        while(n > 9){
            n /= 10;
        }
        return n;
    }
    
    public int sumDigitExceptFirstLast(int n){
        int sum = 0;
        
        n /= 10;
        while(n > 9){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}
