package comeng.cal;
import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        System.out.println(isArmStrong(num) ? "Armstrong number" : "not Armstrong number");
    }
    
    public static int armStrong(int n){
        int sum = 0;
        while(n > 0){
           sum += power((n%10),countDigit(n));
           n /= 10;
        }
        return sum;
    }
    
    public static int power(int a, int b){
        int result = 1;
        
        for(int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }
    
    public static int countDigit(int n){
        int count = 0;
        
        while(n > 0){
            count++;
            n /= 10;
        }
        
        return count;
    }
    
    public static boolean isArmStrong(int num){
        return armStrong(num) == num;
    }
}
