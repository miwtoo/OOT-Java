package comeng.loop;
import java.util.Scanner;

public class sumDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        System.out.println("Sum all digits = " + sumDigit(num));
    }
    
    public static int sumDigit(int n){
        int sum = 0;
        
        while(n > 0){
           sum += n%10;
           n /= 10;
        }
        return sum;
    }
}
