package comeng.loop;
import java.util.Scanner;

public class countDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        System.out.println(countDigit(num) + " digits");
    }
    
    public static int countDigit(int n){
        int count = 0;
        
        while(n > 0){
            count++;
            n /= 10;
        }
        
        return count;
    }
}

