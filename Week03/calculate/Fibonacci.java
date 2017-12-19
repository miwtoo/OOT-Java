package comeng.cal;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter term : ");
        num = sc.nextInt();
        System.out.println("term " + num + " = " + Fibo(num));
    }
    
    public static int Fibo(int n){
        int fst,snd,trd = 0;
        
        if(n == 0 || n ==1)
            return n;
        else{
            fst = 0;
            snd = 1;
            for(int i = 2; i <= n; i++){
                trd = fst + snd;
                fst = snd;
                snd = trd;
            }
            return trd;
        }
    }
}
