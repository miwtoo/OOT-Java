package comeng.cal;
import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        System.out.printf("%.2f\n",squareRoot(num));
    }
    
    public static float squareRoot(int n){
        float x, y, e;
        
        e = 0.0001f;
        x = n;
        y = 1;
        
        while(x-y > e){
            x = (x+y)/2;
            y = n/x;
        } 
        return x;
        //return (float)Math.sqrt(n); // use function in java
    }
}
