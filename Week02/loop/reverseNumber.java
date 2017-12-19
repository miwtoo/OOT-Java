package comeng.loop;
import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        System.out.println(num + " is reversed to " + reverseNumber(num));
    }
    
    public static int reverseNumber(int n){
        int rev = 0;
        
        while(n > 0){
            rev = rev*10 + n%10; 
            n /= 10;
        }
        return rev;
    }
}
