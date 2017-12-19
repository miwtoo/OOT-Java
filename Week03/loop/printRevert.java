package comeng.loop;
import java.util.Scanner;

public class printRevert {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter number : ");
        num = sc.nextInt();
        printRevese(num);
        
    }
    
    public static void printRevese(int n){
        while(n > 0){
            System.out.print(n%10 + " ");
            n /= 10;
        }
    }
}
