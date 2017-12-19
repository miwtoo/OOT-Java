package comeng.cal;
import java.util.Scanner;

public class power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter a : ");
        a = sc.nextInt();
        
        System.out.print("Enter b : ");
        b = sc.nextInt();
        System.out.println(a +"^"+b + " = " + power(a,b));
    }
    
    public static int power(int a,int b){
        int result = 1;
        
        for(int i = 1; i <= b; i++){
            result *= a;
        }
        
        
        //return result;
        return (int)Math.pow(a, b);
    }
}
