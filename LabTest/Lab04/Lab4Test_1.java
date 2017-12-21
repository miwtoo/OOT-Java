package oot.lab4.test;
import java.util.Scanner;
import java.util.Random;
public class Lab4Test_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("====== [MENU] ======");
        System.out.println("1. Create 2 3x3 matrix and add them");
        System.out.println("2. Draw Half Parabola in 25x5 matrix");
        System.out.println("====================");
        System.out.print("Select an option: ");
        int manu = sc.nextInt();
        switch(manu){
                case 1:
                int[][] m1,m2;
                m1 = createMatrix();
                m2 = createMatrix();
                System.out.println("Matrix 1 : ");
                printMetrix(m1);
                System.out.println("Matrix 2 : ");
                printMetrix(m2);
                System.out.println("Summation of matrix : ");
                addMetrix(m1,m2);
                break;
                
                case 2:
                    drawHalfParabola();
                    break;
                    
        }            
    }
    public static int[][] createMatrix(){
        Random rand = new Random();
        int[][] arr1 = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr1[i][j] = rand.nextInt(10)+1;
            }
        }
        return arr1;
    }
    public static void printMetrix(int[][] m1){
       for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("%-5d",m1[i][j]);
            }
            System.out.println("");
        }
   }
    
   public static void addMetrix(int[][] arr1,int[][] arr2){
        int[][] sum = new int[3][3];
        for (int i = 0; i < 3;i++){
          for(int j = 0; j < 3; j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
          }
        }
        printMetrix(sum);
    }   
   
   public static void drawHalfParabola(){
       char[][] ch = new char[6][26];
       for(int i = ch[0].length-1; i >= 0  ;i--){
           for(int j = 0; j < ch.length;j++){
               if( i == j*j)
                   ch[j][i] = 'x';
               else
                   ch[j][i] = ' ';
           }
       }
       printMetrix(ch);
   }
   
   public static void printMetrix(char[][] m1){
       for(int i = m1[0].length-1; i >= 0  ; i--){
           for(int j = 0; j < m1.length;j++){
                System.out.printf("%c    ",m1[j][i]);
            }
            System.out.println();
        }
   }
    
}
