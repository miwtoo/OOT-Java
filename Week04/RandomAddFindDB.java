package comeng.sut;

import java.util.Random;
import java.util.Scanner;

public class RandomAddFindDB {
    public static void main(String[] ags){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int num;
        int[] n;
        
        do{
            System.out.print("Enter a number <10-15> : ");
            num = sc.nextInt();
        }while(num < 10 || num > 15);
        
        n = createRandomArray(num);
        findDoubleNumber(n);
        
    }
    
    public static int[] createRandomArray(int x){
        int[] y = new int[x];
        Random r = new Random();
        
        for(int i = 0; i < y.length; i++){
            int rnd = r.nextInt(100);
            while(rnd < 10)
                rnd = r.nextInt(100);
            y[i] = rnd;
            //if(rnd > 9)
            //    y[i] = rnd;
        }
        return y;
    }
    
    public static void findDoubleNumber(int [] a){
        int count = 0;
        
        for(int i = 0; i < a.length; i++){
            if(a[i]/10 == a[i]%10){
                System.out.print(a[i] + " ");
                count++;
            }
        }
        if(count == 0)
            System.out.println("cannot find double number");
    } 
    
}