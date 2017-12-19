package comeng.cal;
import java.util.Scanner;
public class rescusive {
    public static void main(String[] args){
        System.out.println(factorial(5));
    }
    
    public static int factorial(int n){
        if(n == 0)
            return 1;
        else if(n > 0)
            return n * factorial(n-1);
    }
    
    public static int fibo(int n){
        if(n == 0 || n == 1)
            return n;
        else if(n > 0)
            return fibo(n-1) + fibo(n-2);
    }
}
