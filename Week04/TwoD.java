package comeng.sut;

import java.util.Random;
import java.util.Scanner;

public class TwoD {
    public static void main(String[] ags){
        int[][] n= new int[5][5];
        
        n = createRandomArray(5);
        
        printArray(n);
    }
    
    public static int[][] createRandomArray(int x){
        int[][] y = new int[x][x];
        Random r = new Random();
        
        for(int i = 0; i < y.length; i++){
            for(int j = 0; j < y[i].length; j++) {
                y[i][j] = r.nextInt(10)+1;
            }
        }
        return y;
    }
    
    public static void printArray(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++) {
                System.out.printf("%-2d  ",a[i][j]);
            }
            System.out.println();
        }
    }
}