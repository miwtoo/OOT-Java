package comeng.loop;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        System.out.println(num + " has " + countDigits(num) +" digits");
        printRverse(num);
        sumDigit(num);
        if(num == reverseNumber(num))
            System.out.println(num + " is Palindome");
        else
            System.out.println(num + " is not Palindome");
        
    }
    
    public static int countDigits(int n){
        int count = 0;
        while(n > 0){
            count++;
            n /= 10;
        }
        return count;
    }
    
    public static void printRverse(int n){
        int flag = 0;
        
        while(n > 0){
            if(flag == 0)
                System.out.print(n%10);
            else
                System.out.print(" and " + (n%10) );
            flag = 1;
            n /= 10;
        }
    }
    
    public static void sumDigit(int n){
        int sum = 0;
        
        while(n > 0){
           sum += n%10;
           n /= 10;
        }
        
        if(sum%2 == 0)
            System.out.println("Sum of all digits is even number");
        else
            System.out.println("Sum of all digits is odd number");
        System.out.println();
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
