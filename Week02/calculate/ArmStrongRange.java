package comeng.cal;
import java.util.Scanner;

public class ArmStrongRange {
    public static void main(String[] args){
        /////////////// Ans Wrong
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter the first number : ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        num2 = sc.nextInt();
        
        for(int i = num1; i <= num2; i++){
            if(isArmStrong(i) == true)
                System.out.print(i + " ");
        }
        //System.out.println(isArmStrong(num1) ? "Armstrong number" : "not Armstrong number");
        //(1-3) 3 4 5 6 7 8 9 153 30 371 407 1634 8208 9474 54748 92727 93084
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
